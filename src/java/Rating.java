/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gopi
 */
@WebServlet(urlPatterns = {"/Rating"})
public class Rating extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Connection con=DatabaseConnection.dbConnection();
         int rate=Integer.parseInt(request.getParameter("value"));
         String video=request.getParameter("video");
         System.out.println("Rating Given="+rate);
       //  System.out.println("Video="+video);
         
         //--------------------Inserting Values to Database---------------------------------
         
         
         PreparedStatement ps1=con.prepareStatement("select * from rating where VideoName=?");
         ps1.setString(1,video);
        ResultSet rs=ps1.executeQuery();
        if(rs.next()){
            int Sum=rs.getInt("Sum");
            int Count=rs.getInt("Count");
             System.out.println("Sum B4--"+Sum);
             System.out.println("Count B4--"+Sum);
             Sum=Sum+rate;
             Count=Count+1;
            System.out.println("Sum After--"+Sum);
            System.out.println("Count After--"+Count);
            int rating=Sum/Count;
            System.out.println("Rating--"+rating);
            PreparedStatement ps=con.prepareStatement("UPDATE rating SET Sum=?,Count=?,Rating=? WHERE VideoName=?");
          ps.setInt(1,Sum);
          ps.setInt(2,Count);
          ps.setInt(3,rating);
          ps.setString(4,video);
          ps.execute();
            
            response.sendRedirect("videoss.jsp?videoid="+video+".mp4");
        }else{
          PreparedStatement ps=con.prepareStatement("Insert into rating values(?,?,?,?)");
          ps.setString(1,video);
          ps.setInt(2,rate);
          ps.setInt(3,1);
          ps.setInt(4,rate);
          ps.execute();
          response.sendRedirect("videoss.jsp?videoid="+video+".mp4");
        }
//         
//            String id=rs.getString("Qid");
//            id=id.substring(1);
//            int n=Integer.parseInt(id);
//            n++;
//        PreparedStatement ps=con.prepareStatement("Insert into forumquestions values(?,?,?,?,?)");
//      //  String Video=request.getParameter("Video");
//        String Ques=request.getParameter("Ques");
//        System.out.println("Ques--->"+Ques);
////        ps.setString(1,Video);
////        ps.setString(2,Ques);
////        ps.setString(3,"Q"+n);
////         ps.setString(4,uname);
////         ps.setString(5,date);
//        ps.execute();
//        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Rating.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Rating.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Rating.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Rating.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
