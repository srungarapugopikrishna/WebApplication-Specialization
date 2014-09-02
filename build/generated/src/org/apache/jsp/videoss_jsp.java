package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.io.File;

public final class videoss_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("function changeImage()\n");
      out.write("{\n");
      out.write("element=document.getElementById('myimage')\n");
      out.write("if (element.src.match(\"b\"))\n");
      out.write("  {\n");
      out.write("  element.src=\"a.jpg\";\n");
      out.write("  }\n");
      out.write("else\n");
      out.write("  {\n");
      out.write("  element.src=\"b.jpg\";\n");
      out.write("  }\n");
      out.write("}\n");
      out.write(" \n");
      out.write("function showHint(str)\n");
      out.write("{\n");
      out.write("var xmlhttp;\n");
      out.write("if (str.length==0)\n");
      out.write("  { \n");
      out.write("  document.getElementById(\"txtHint\").innerHTML=\"\";\n");
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
      out.write("    document.getElementById(\"list\").innerHTML=xmlhttp.responseText;\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("xmlhttp.open(\"GET\",\"valuesearch.jsp?search=\"+str,true);\n");
      out.write("xmlhttp.send();\n");
      out.write("}\n");
      out.write("  </script>\n");
      out.write(" <style type=\"text/css\">\n");
      out.write(".tooltip {\n");
      out.write("\tdisplay:none;\n");
      out.write("\tposition:absolute;\n");
      out.write("\tborder:1px solid #333;\n");
      out.write("\tbackground-color:#161616;\n");
      out.write("\tborder-radius:5px;\n");
      out.write("\tpadding:10px;\n");
      out.write("\tcolor:#fff;\n");
      out.write("\tfont-size:12px Arial;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("$(document).ready(function() {\n");
      out.write("        // Tooltip only Text\n");
      out.write("        $('.masterTooltip').hover(function(){\n");
      out.write("                // Hover over code\n");
      out.write("                var title = $(this).attr('title');\n");
      out.write("                $(this).data('tipText', title).removeAttr('title');\n");
      out.write("                $('<p class=\"tooltip\"></p>')\n");
      out.write("                .text(title)\n");
      out.write("                .appendTo('body')\n");
      out.write("                .fadeIn('slow');\n");
      out.write("        }, function() {\n");
      out.write("                // Hover out code\n");
      out.write("                $(this).attr('title', $(this).data('tipText'));\n");
      out.write("                $('.tooltip').remove();\n");
      out.write("        }).mousemove(function(e) {\n");
      out.write("                var mousex = e.pageX + 20; //Get X coordinates\n");
      out.write("                var mousey = e.pageY + 10; //Get Y coordinates\n");
      out.write("                $('.tooltip')\n");
      out.write("                .css({ top: mousey, left: mousex })\n");
      out.write("        });\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<script>\n");
      out.write("function changeImage1(rating)\n");
      out.write("{\n");
      out.write("  element=document.getElementById('img1')\n");
      out.write("  var pattern = /\\bb.jpg/g;\n");
      out.write(" if (element.src.match(pattern)&&rating<1)\n");
      out.write("  { \n");
      out.write("  element.src=\"a.jpg\";\n");
      out.write("  }\n");
      out.write("else\n");
      out.write("  { \n");
      out.write("  element.src=\"b.jpg\";\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("function changeImage2(rating)\n");
      out.write("{\n");
      out.write("element=document.getElementById('img2')\n");
      out.write("var pattern = /\\bb.jpg/g;\n");
      out.write(" if (element.src.match(pattern)&&rating<2)\n");
      out.write("  {\n");
      out.write("  element.src=\"a.jpg\";\n");
      out.write("  }\n");
      out.write("else\n");
      out.write("  {\n");
      out.write("  element.src=\"b.jpg\";\n");
      out.write("  }\n");
      out.write("  changeImage1(rating);\n");
      out.write("}\n");
      out.write("function changeImage3(rating)\n");
      out.write("{\n");
      out.write("element=document.getElementById('img3')\n");
      out.write("var pattern = /\\bb.jpg/g; \n");
      out.write(" if (element.src.match(pattern)&&rating<3)\n");
      out.write("  {\n");
      out.write("  element.src=\"a.jpg\";\n");
      out.write("  }\n");
      out.write("else\n");
      out.write("  {\n");
      out.write("  element.src=\"b.jpg\";\n");
      out.write("  }\n");
      out.write("   \n");
      out.write("  changeImage2(rating);\n");
      out.write("}\n");
      out.write("function changeImage4(rating)\n");
      out.write("{\n");
      out.write("element=document.getElementById('img4')\n");
      out.write("var pattern = /\\bb.jpg/g;\n");
      out.write(" if (element.src.match(pattern)&&rating<4)\n");
      out.write("  {\n");
      out.write("  element.src=\"a.jpg\";\n");
      out.write("  }\n");
      out.write("else\n");
      out.write("  {\n");
      out.write("  element.src=\"b.jpg\";\n");
      out.write("  }\n");
      out.write("   \n");
      out.write("  changeImage3(rating);\n");
      out.write("}\n");
      out.write("function changeImage5(rating)\n");
      out.write("{\n");
      out.write("element=document.getElementById('img5')\n");
      out.write("var pattern = /\\bb.jpg/g;\n");
      out.write(" if (element.src.match(pattern)&&rating<5)\n");
      out.write("  {\n");
      out.write("  element.src=\"a.jpg\";\n");
      out.write("  }\n");
      out.write("else\n");
      out.write("  {\n");
      out.write("  element.src=\"b.jpg\";\n");
      out.write("  }\n");
      out.write("   \n");
      out.write("  changeImage4(rating);\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("    <div class=\"main\">\n");
      out.write("        <div class=\"minihead\"></div>\n");
      out.write("        <div class=\"head\" >\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                 <a href=\"Main.jsp\"><img src=\"images/pcs.PNG\" width=\"200\" height=\"90\"></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"Utabs\"></div>\n");
      out.write("            <div class=\"tabs\">\n");
      out.write("                <a href=\"Main.jsp\" style=\"text-decoration:none;color: black\">HOME</a> \n");
      out.write("            </div>\n");
      out.write("        </div>  \n");
      out.write("        <div class=\"middle_box\">\n");
      out.write("        <div class=\"left\">Search Video:\n");
      out.write("            <br>\n");
      out.write("            <form action=\"\"> \n");
      out.write("                <input type=\"text\" id=\"txt1\" onkeyup=\"showHint(this.value)\" />\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"mid\">  \n");
      out.write("            <div id=\"mydiv\" class=\"video\" style=\"overflow:scroll;\">\n");
      out.write("                <video id=\"myvideo\" width=\"500\" height=\"350\" controls>\n");
      out.write("                  ");
String videoid=request.getParameter("videoid");
                  String [] vdio=videoid.split("\\.");
                  videoid=videoid.trim();
                  
      out.write("\n");
      out.write("                    <source src=\"");
      out.print(videoid);
      out.write("\" type=\"video/mp4\">\n");
      out.write("\n");
      out.write("                </video>\n");
      out.write("            Rate this video- \n");
      out.write("            ");
      String[]rate=new String[5];
                    for(int i=0;i<5;i++){
                        rate[i]="a";
                    }
                    int rating=0;
                    java.sql.Connection con=null;
                    String url="jdbc:mysql://localhost:3306/pcs";
                    Class.forName("com.mysql.jdbc.Driver");
                    con=(java.sql.Connection) DriverManager.getConnection(url,"root","root");
                    PreparedStatement ps1=con.prepareStatement("select * from rating where VideoName=?");
                    ps1.setString(1,vdio[0]);
                    ResultSet rss=ps1.executeQuery();
                    if(rss.next()){
                        rating=rss.getInt("Rating");
                        for(int i=0;i<5;i++){
                          if(i<rating){
                              rate[i]="b";
                          }
                         }
                    }
            
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("            <a href=\"Rating?value=1&video=");
      out.print(vdio[0]);
      out.write("\"><img id=\"img1\" onmouseover=\"changeImage1(");
      out.print(rating);
      out.write(")\" onmouseout=\"changeImage1(");
      out.print(rating);
      out.write(")\" class=\"masterTooltip\" title=\"1 out of 5 stars\" src=\"");
      out.print(rate[0]);
      out.write(".jpg\"></a>\n");
      out.write("            <a href=\"Rating?value=2&video=");
      out.print(vdio[0]);
      out.write("\"><img id=\"img2\" onmouseover=\"changeImage2(");
      out.print(rating);
      out.write(")\" onmouseout=\"changeImage2(");
      out.print(rating);
      out.write(")\" class=\"masterTooltip\" title=\"2 out of 5 stars\" src=\"");
      out.print(rate[1]);
      out.write(".jpg\"></a>\n");
      out.write("            <a href=\"Rating?value=3&video=");
      out.print(vdio[0]);
      out.write("\"><img id=\"img3\" onmouseover=\"changeImage3(");
      out.print(rating);
      out.write(")\" onmouseout=\"changeImage3(");
      out.print(rating);
      out.write(")\" class=\"masterTooltip\" title=\"3 out of 5 stars\" src=\"");
      out.print(rate[2]);
      out.write(".jpg\"></a>\n");
      out.write("            <a href=\"Rating?value=4&video=");
      out.print(vdio[0]);
      out.write("\"><img id=\"img4\" onmouseover=\"changeImage4(");
      out.print(rating);
      out.write(")\" onmouseout=\"changeImage4(");
      out.print(rating);
      out.write(")\" class=\"masterTooltip\" title=\"4 out of 5 stars\" src=\"");
      out.print(rate[3]);
      out.write(".jpg\"></a>\n");
      out.write("            <a href=\"Rating?value=5&video=");
      out.print(vdio[0]);
      out.write("\"><img id=\"img5\" onmouseover=\"changeImage5(");
      out.print(rating);
      out.write(")\" onmouseout=\"changeImage5(");
      out.print(rating);
      out.write(")\" class=\"masterTooltip\" title=\"5 out of 5 stars\" src=\"");
      out.print(rate[4]);
      out.write(".jpg\"></a>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            ");
      out.write("          \n");
      out.write("             ");
 String videoo=request.getParameter("videoid");
      out.write("\n");
      out.write("        <a href=\"forum.jsp?videoid=");
      out.print(videoo);
      out.write("\">Forum</a><br><br>\n");
      out.write("        <b><u>Comments:</b></u>\n");
      out.write("                ");


                    java.sql.Connection conn=null;
               //     String url="jdbc:mysql://localhost:3306/pcs";
                    Class.forName("com.mysql.jdbc.Driver");
                    conn=(java.sql.Connection) DriverManager.getConnection(url,"root","root");
                    PreparedStatement pst=conn.prepareStatement("Select * from videos_review where video=?");
                    
                    session.setAttribute("present_video",videoid);
                    
                    System.out.println("video->"+vdio[0]);
                    pst.setString(1,vdio[0]);
                    ResultSet rs=pst.executeQuery();
                    while(rs.next()){
                      String empid=rs.getString("emp_id");
                      String comment=rs.getString("comment");
                      String time=rs.getString("Date");
                      
      out.write("\n");
      out.write("                      <br> ");
      out.print(empid);
      out.write(':');
      out.write(':');
      out.print(comment);
      out.write("<br>\n");
      out.write("                           ");
      out.print(time);
      out.write("\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("                <form name=\"comment\" action=\"comment\" method=\"get\">\n");
      out.write("                    <input type=\"text\" name=\"review\"><br>\n");
      out.write("                   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"submit\" value=\"submit\">\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("            <div class=\"freeuse\"></div>\n");
      out.write("            <div class=\"videopreview\" id=\"list\" style=\"overflow:scroll;\">\n");
      out.write("            <br><b><u>Recommended Videos</u></b><br><br>\n");
      out.write("            ");

            PreparedStatement pst1=conn.prepareStatement("Select name from videos");
            ResultSet rs1=pst1.executeQuery();
            String[] pic={"",""};
//                     pic[0]=pic[0]+".png";
            while(rs1.next()){
            String files=rs1.getString("name");
            files=files+".mp4";
           // System.out.println("Files---"+files);
            
      out.write("\n");
      out.write("            <br><div style=\"color:#000000\" onmouseover=\"this.style.color = '#FF6600'\" onmouseout=\"this.style.color = '#000000'\"> <a href=\"videoss.jsp?videoid=");
      out.print(files);
      out.write("\" style=\"text-decoration:none;\"><img src=\"");
      out.print(pic[0]);
      out.write("\" width=\"30\" height=\"30\"> ");
      out.print(files);
      out.write(" </a></div>\n");
      out.write("            ");
}
            
      out.write("\n");
      out.write("            ");

//            String path = "C:/Users/Gopi/Documents/NetBeansProjects/WebApplication1/web"; 
//            String files;
//            File folder = new File(path);
//            File[] listOfFiles = folder.listFiles(); 
//            for (int i = 0; i < listOfFiles.length; i++) 
//            {
//
//             if (listOfFiles[i].isFile()) 
//             {
//             files = listOfFiles[i].getName();
//                 if (files.endsWith(".mp4"))
//                 {
//                     String[] pic=files.split("\\.");
//                     pic[0]=pic[0]+".png";
//
//                     

//                  }
//             }
//            }
            
      out.write(" \n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("            <div id=\"comment\" class=\"review\" style=\"overflow:scroll;\">\n");
      out.write("                <b><u>Description::</u></b><br>\n");
      out.write("                ");

                        
                  pst1=conn.prepareStatement("Select description from videos where name=?");
                  pst1.setString(1,vdio[0]);
                  System.out.println("VNaMe->->"+vdio[0]);
                   rs1=pst1.executeQuery();String description;
                   while(rs1.next()){
                   description=rs1.getString("description");
                   
      out.write("<br>\n");
      out.write("                ");
      out.print(description);
      out.write("\n");
      out.write("                ");

                   }
                
      out.write(" \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"footer\">  </div>\n");
      out.write("     </div>\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
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
