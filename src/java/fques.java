/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author G0pS
 */
@WebServlet(urlPatterns = {"/fques"})
public class fques extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
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
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
             Date date = new Date();
            String Date=dateFormat.format(date);
         Connection con=DatabaseConnection.dbConnection();
         
         HttpSession session=request.getSession(true);
            String Video=(String) session.getAttribute("forumvideo");
            String[] Videoo = Video.split("\\.");
            String emp_id=(String) session.getAttribute("emp_id");
        PreparedStatement ps1=con.prepareStatement("select Qid from forumquestions ORDER BY Qid DESC LIMIT 1");
        ResultSet rs=ps1.executeQuery();
        if(rs.next()){
            String id=rs.getString("Qid");
            id=id.substring(1);
            int n=Integer.parseInt(id);
            n++;
        PreparedStatement ps=con.prepareStatement("Insert into forumquestions values(?,?,?,?,?)");
      //  String Video=request.getParameter("Video");
        String Ques=request.getParameter("Que");
        System.out.println("Ques--->"+Ques);
        ps.setString(1,Videoo[0]);
        ps.setString(2,Ques);
        ps.setString(3,"Q"+n);
        ps.setString(4,emp_id);
        ps.setString(5,Date);
        ps.execute();
        }
        else{
        PreparedStatement ps=con.prepareStatement("Insert into forumquestions values(?,?,?,?,?)");
     //   String Video=request.getParameter("Video");
        String Ques=request.getParameter("Que");
        
        System.out.println("Ques--->"+Ques);
        ps.setString(1,Videoo[0]);
        ps.setString(2,Ques);
        ps.setString(3,"Q1");
        ps.setString(4,emp_id);
         ps.setString(5,Date);
        ps.execute();
        }
        response.sendRedirect("forum.jsp?videoid="+Video);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
            Logger.getLogger(fques.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(fques.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
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
            Logger.getLogger(fques.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(fques.class.getName()).log(Level.SEVERE, null, ex);
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
