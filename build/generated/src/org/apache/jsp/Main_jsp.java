package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Main_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link href=\"cs.css\" rel=\"stylesheet\" type=\"text/css\"> \n");
      out.write("<title>Important</title>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("<!--\n");
      out.write("var image1=new Image()\n");
      out.write("image1.src=\"./images/1.png\"\n");
      out.write("var image2=new Image()\n");
      out.write("image2.src=\"./images/2.png\"\n");
      out.write("var image3=new Image()\n");
      out.write("image3.src=\"./images/3.png\"\n");
      out.write("var image4=new Image()\n");
      out.write("image4.src=\"./images/4.png\"\n");
      out.write("//-->\n");
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
      out.write("       \n");
      out.write("        </div>\n");
      out.write("    </div>  \n");
      out.write("    <div class=\"middle_box\">\n");
      out.write("    <div class=\"l1\"></div>\n");
      out.write("    <div class=\"matter\"><br><br><br><br><br><br>\n");
      out.write("        This site makes you very easy for anyone to submit short videos with attached documents to the tool so that others can search and find these lessons. \n");
      out.write("   <br><pre> - Usage is recorded and users are encouraged to review the materials and assess \n");
      out.write("    the usefulness for others (quality, relevance, etc.) \n");
      out.write("   <br> - Searching is possible by \n");
      out.write("  <br>      1) key words, \n");
      out.write("  <br>      2) what kind of project the material is for, \n");
      out.write("  <br>      3) when in the project life cycle the material is relevant, etc. \n");
      out.write("  <br> - Sorting of returned results by user ranking of quality and relevance must<br>    be supported.\n");
      out.write("   </pre>  \n");
      out.write("<!--<script>\n");
      out.write("\n");
      out.write("//variable that will increment through the images\n");
      out.write("var step=1\n");
      out.write("function slideit(){\n");
      out.write("//if browser does not support the image object, exit.\n");
      out.write("if (!document.images)\n");
      out.write("return\n");
      out.write("document.images.slide.src=eval(\"image\"+step+\".src\")\n");
      out.write("if (step<4)\n");
      out.write("step++\n");
      out.write("else\n");
      out.write("step=1\n");
      out.write("//call function \"slideit()\" every 2.5 seconds\n");
      out.write("setTimeout(\"slideit()\",2500)\n");
      out.write("}\n");
      out.write("slideit()\n");
      out.write("//\n");
      out.write("</script>-->\n");
      out.write("    </div>\n");
      out.write("    <div class=\"r1\"><br><br><br><br> \n");
      out.write("        \n");
      out.write("        <a href=\"videosredirect\"> <img src=\"images/videos.png\" width=\"250\" height=\"75\"></a><br><br>\n");
      out.write("        <a href=\"uploadredirect\"> <img src=\"images/upload.png\" width=\"250\" height=\"75\"></a><br><br>\n");
      out.write("         \n");
      out.write("    </div>\n");
      out.write("    </div>\n");
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
