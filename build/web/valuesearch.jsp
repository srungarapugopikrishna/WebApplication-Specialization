<%-- 
    Document   : valuesearch
    Created on : Nov 12, 2013, 6:19:30 PM
    Author     : Gopi
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
    <body><br><b><u>Recommended Videos</u></b><br><br>
        <%
            String key=request.getParameter("search");
         //   System.out.println(key+"key");
            String s1 = null,s2 = null,s3 = null;
        java.sql.Connection con=null;boolean val=false;
                String url1="jdbc:mysql://localhost:3306/pcs";
                Class.forName("com.mysql.jdbc.Driver");
                con=(java.sql.Connection) DriverManager.getConnection(url1,"root","root");
        PreparedStatement pst1=con.prepareStatement("Select * from videos");
         ResultSet rss=pst1.executeQuery();
         if(!key.equals("")){
                while(rss.next()){
                    
                    s1=rss.getString(1);
                    s2=rss.getString(2);
                    s3=rss.getString(3);    //System.out.println("S1->"+s1);System.out.println("S2->"+s2);System.out.println("Key->"+key);
                    if(s1.contains(key)||s2.contains(key)||s3.contains(key)){
                        s1=s1.trim();
                        System.out.println("S1->"+s1);  
                        %><a href="videoss.jsp?videoid=<%=s1%>.mp4" style="text-decoration:none;"><%=s1%></a><br><% 
                            val=true;
                    }else{ }
                 }
             if(!val){
             %><br><br><br><br>No Results Found<%}}
         else{
              while(rss.next()){
                    
                    s1=rss.getString(1);
                    s2=rss.getString(2);//System.out.println("S1->"+s1);System.out.println("S2->"+s2);System.out.println("Key->"+key);
                   
                        s1=s1.trim();
                        System.out.println("S1->"+s1);  
                        %><a href="videoss.jsp?videoid=<%=s1%>.mp4" style="text-decoration:none;"><%=s1%></a><br><% 
                             
                     
         }}
            %>
    </body>
</html>