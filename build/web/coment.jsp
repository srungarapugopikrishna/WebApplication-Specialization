<%-- 
    Document   : coment
    Created on : Sep 10, 2013, 3:39:03 PM
    Author     : G0pS
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%
                
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
                  %>
                  <br> Emp_id=<%=empid%><br>Comment=<%=comment%><br>
            <%
                }
            %>
            <form name="comment" action="comment" method="get">
                <input type="text" name="review"><br>
                <input type="submit" value="submit">
            </form>
             
    </body>
</html>
