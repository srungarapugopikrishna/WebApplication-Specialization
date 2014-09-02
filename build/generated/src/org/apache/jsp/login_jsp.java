package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link href=\"cs.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<script language=\"javascript\" type=\"text/javascript\">\n");
      out.write("    //Validation for the registration page\n");
      out.write("    function validate(){\n");
      out.write("        //EmpId Validation\n");
      out.write("        var username=document.login.username.value;\n");
      out.write("            if(username==\"\"){\n");
      out.write("                alert(\"Enter User name\");\n");
      out.write("                document.login.username.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("        var password=document.login.password.value;\n");
      out.write("            if(password==\"\"){\n");
      out.write("                alert(\"Enter password\");\n");
      out.write("                document.login.password.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("         \n");
      out.write("    }\n");
      out.write("</script>\n");
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
      out.write("            <a href=\"Main.jsp\" style=\"text-decoration:none;color: black\">HOME</a> \n");
      out.write("        </div>\n");
      out.write("    </div>  \n");
      out.write("    <div class=\"middle_box\">\n");
      out.write("    <div class=\"left\"></div>\n");
      out.write("    <div class=\"mid\">\n");
      out.write("        <table>\n");
      out.write("            <form name=\"login\" action=\"login\" method=\"get\" onsubmit=\"return validate()\">\n");
      out.write("            <tr>\n");
      out.write("                <td style=\"font-family: Calibri; color: #333;\">UserName:</td>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"text\" name=\"username\">\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td style=\"font-family: Calibri; color: #333;\">Password:</td>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"password\" name=\"password\">\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"submit\" value=\"submit\" onClick=\"validate()\">\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("        </table>\n");
      out.write("        <a href=\"reg.jsp\">New User?</a>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div class=\"r1\"></div>\n");
      out.write("</div>\n");
      out.write("    <div class=\"footer\">  </div>\n");
      out.write("</div>\n");
      out.write("    \n");
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
