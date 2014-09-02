/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;

/**
 *
 * @author G0pS
 */
@WebServlet(urlPatterns = {"/upload"})
public class upload extends HttpServlet {

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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
          try {
        List<FileItem> items = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
         System.out.println("----------------------------------");
        for (FileItem item : items) {
            if (item.isFormField()) {
                // Process regular form field (input type="text|radio|checkbox|etc", select, etc).
                String fieldname = item.getFieldName();
                String fieldvalue = item.getString();
                // ... (do your job here)
                } 
            else {
                // Process form file field (input type="file").
                String fieldname = item.getFieldName();
                System.out.println("fieldName---"+fieldname);
                String filename = FilenameUtils.getName(item.getName());
                System.out.println("fileName---"+filename);
                InputStream filecontent = item.getInputStream();
                // ... (do your job here)
                
                HttpSession session=request.getSession(true);
                String videoname=(String) session.getAttribute("uploadedvideoname");
                String description=(String) session.getAttribute("description");
                String tags=(String) session.getAttribute("tags");
                System.out.println("VideoName---"+videoname);
                System.out.println("Description---"+description);
                System.out.println("tags---"+tags);
                
                Connection con = null;PreparedStatement ps = null;
                try {
                    con = DatabaseConnection.dbConnection();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(upload.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(upload.class.getName()).log(Level.SEVERE, null, ex);
                }
             
                try {
                    ps = con.prepareStatement("Insert into videos values(?,?,?)");
                } catch (SQLException ex) {
                    Logger.getLogger(upload.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    ps.setString(1,videoname);
                     ps.setString(2,description);
              ps.setString(3,tags);
              ps.execute();
                } catch (SQLException ex) {
                    Logger.getLogger(upload.class.getName()).log(Level.SEVERE, null, ex);
                }
             
                
                try{
                    
                FileOutputStream f=new FileOutputStream("D:/pcs/"+videoname+".txt");
//                 FileOutputStream f=new FileOutputStream("C:/Users/Gopi/Documents/Uploads/"+videoname+".txt");
                PrintStream p=new PrintStream(f);
                    p.println("Name-"+videoname+"\n");
                    p.println("Desc-"+description+"\n");
                    p.println("Tags-"+tags);
                    p.close();
                }catch(FileNotFoundException e){System.out.println("Upload exception"+e);}
                OutputStream outputStream;
   //             outputStream = new FileOutputStream(new File("C:/Users/Gopi/Documents/Uploads/"+videoname+".mp4"));
                outputStream = new FileOutputStream(new File("D:/pcs/"+videoname+".mp4"));
                int read = 0;
		byte[] bytes = new byte[1024];
 
		while ((read = filecontent.read(bytes)) != -1) {
			outputStream.write(bytes, 0, read);
		}
 
		System.out.println("Done!");
                 response.sendRedirect("Uploaded.jsp");
            }
        }
    } catch (FileUploadException e) {
        throw new ServletException("Cannot parse multipart request.", e);
    }    
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
        processRequest(request, response);
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
        processRequest(request, response);
       
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
