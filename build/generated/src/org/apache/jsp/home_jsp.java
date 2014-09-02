package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.io.File;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link href=\"cs.css\" rel=\"stylesheet\" type=\"text/css\"> \n");
      out.write("<script>\n");
      out.write("function  changeVideo(id)\n");
      out.write("{\n");
      out.write(" var xmlhttp;    \n");
      out.write("if (id==\"\")\n");
      out.write("  {\n");
      out.write("  document.getElementById(\"comment\").innerHTML=\"\";\n");
      out.write("  return;\n");
      out.write("  }\n");
      out.write("if (window.XMLHttpRequest)\n");
      out.write("  {// code for IE7+, Firefox, Chrome, Opera, Safari\n");
      out.write("  xmlhttp=new XMLHttpRequest();\n");
      out.write("  }\n");
      out.write("else\n");
      out.write("  {// code for IE6, IE5\n");
      out.write("  xmlhttp=new ActiveXObject(\"Microsoft.XMLHTTP\");\n");
      out.write("  }\n");
      out.write("xmlhttp.onreadystatechange=function()\n");
      out.write("  {\n");
      out.write("  if (xmlhttp.readyState==4 && xmlhttp.status==200)\n");
      out.write("    {\n");
      out.write("    document.getElementById(\"comment\").innerHTML=xmlhttp.responseText;\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("xmlhttp.open(\"GET\",\"coment.jsp\",true);\n");
      out.write(" xmlhttp.send();\n");
      out.write("    \n");
      out.write(" video=document.getElementById(\"myvideo\");\n");
      out.write(" video.src=id;\n");
      out.write(" \n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"jquery.ratings.css\" />\n");
      out.write("    <script src=\"jquery-1.3.2.min.js\"></script>\n");
      out.write("    <script src=\"jquery.ratings.js\"></script>\n");
      out.write("    <script src=\"example.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"main\">\n");
      out.write("    <div class=\"minihead\"></div>\n");
      out.write("    <div class=\"head\" >\n");
      out.write("        <div class=\"logo\">\n");
      out.write("             <a href=\"Main.jsp\"><img src=\"images/pcs.PNG\" width=\"200\" height=\"90\"></a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"Utabs\"></div>\n");
      out.write("        <div class=\"tabs\">\n");
      out.write("            <a href=\"Main.jsp\"><img src=\"images/bhome.PNG\"></a> \n");
      out.write("        </div>\n");
      out.write("    </div>  \n");
      out.write("    <div class=\"middle_box\">\n");
      out.write("    <div class=\"left\"></div>\n");
      out.write("    <div class=\"mid\">  \n");
      out.write("        <div id=\"mydiv\" class=\"video\">\n");
      out.write("            <video id=\"myvideo\" width=\"500\" height=\"350\" controls>\n");
      out.write("              ");
String videoid=request.getParameter("videoid");
      out.write("\n");
      out.write("                <source src=\"");
      out.print(videoid);
      out.write("\" type=\"video/mp4\">\n");
      out.write("                     \n");
      out.write("            </video>\n");
      out.write("        Rate this video-<div id=\"example-2\"></div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"freeuse\"></div>\n");
      out.write("        <div class=\"videopreview\" style=\"overflow:scroll;\">\n");
      out.write("        <br><b><u>Recommended Videos</u></b><br><br>\n");
      out.write("        ");

        String path = "C:/Users/G0pS/Documents/NetBeansProjects/WebApplication1/web"; 
        String files;
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles(); 
        for (int i = 0; i < listOfFiles.length; i++) 
        {

         if (listOfFiles[i].isFile()) 
         {
         files = listOfFiles[i].getName();
             if (files.endsWith(".mp4"))
             {
                 String[] pic=files.split("\\.");
                 pic[0]=pic[0]+".png";

                 
      out.write("<br><div id=\"");
      out.print(files);
      out.write("\" onclick=\"changeVideo(this.id);\" style=\"color:#000000\" onmouseover=\"this.style.color = '#FF6600'\" onmouseout=\"this.style.color = '#000000'\"> <img src=\"");
      out.print(pic[0]);
      out.write("\" width=\"30\" height=\"30\">   ");
      out.print(files);
      out.write("</div>");

              }
         }
        }
        
      out.write(" \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("        <div id=\"comment\" class=\"review\" style=\"overflow:scroll;\">\n");
      out.write("            Reviews:\n");
      out.write("            ");

                
                java.sql.Connection conn=null;
                String url="jdbc:mysql://localhost:3306/pcs";
                Class.forName("com.mysql.jdbc.Driver");
                conn=(java.sql.Connection) DriverManager.getConnection(url,"root","root");
                PreparedStatement pst=conn.prepareStatement("Select emp_id,comment from videos_review where video=?");
                String video=(String) session.getAttribute("present_video");
                System.out.println("video->"+video);
                pst.setString(1,video);
                ResultSet rs=pst.executeQuery();
                while(rs.next()){
                  String empid=rs.getString("emp_id");
                  String comment=rs.getString("comment");
                  
      out.write("\n");
      out.write("                  <br> Emp_id=");
      out.print(empid);
      out.write("<br>Comment=");
      out.print(comment);
      out.write("<br>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("            <form name=\"comment\" action=\"comment\" method=\"get\">\n");
      out.write("                <input type=\"text\" name=\"review\"><br>\n");
      out.write("                <input type=\"submit\" value=\"submit\">\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"footer\">  </div>\n");
      out.write(" </div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
