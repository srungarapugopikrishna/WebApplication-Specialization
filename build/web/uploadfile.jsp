<%-- 
    Document   : uploadfile
    Created on : Nov 11, 2013, 7:02:58 PM
    Author     : Gopi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         
        <title>JSP Page</title>
    </head>
    <body>
        <%
        String videoname=request.getParameter("video");
        String description=request.getParameter("desc");
        String tags=request.getParameter("tags");
        session.setAttribute("uploadedvideoname",videoname);
        session.setAttribute("description",description);
        session.setAttribute("tags",tags);
                     
        %>
        <form action="upload" method="post" enctype="multipart/form-data">
            <input type="file" name="file" /><br>
            <input type="submit" />
        </form>
    </body>
</html>
