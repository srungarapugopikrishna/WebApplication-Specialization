 <%-- 
    Document   : home
    Created on : Sep 4, 2013, 10:39:24 PM
    Author     : G0pS
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.io.File"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
<head>
<link href="cs.css" rel="stylesheet" type="text/css"> 
<script>
function loadXMLDoc()
{
var xmlhttp;
str=process;
if (window.XMLHttpRequest)
  {// code for IE7+, Firefox, Chrome, Opera, Safari
  xmlhttp=new XMLHttpRequest();
  }
else
  {// code for IE6, IE5
  xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
  }
xmlhttp.onreadystatechange=function()
  {
  if (xmlhttp.readyState==4 && xmlhttp.status==200)
    {
    document.getElementById("list").innerHTML=xmlhttp.responseText;
    }
  }
xmlhttp.open("GET","search",true);
xmlhttp.send();
}
</script>
<link type="text/css" rel="stylesheet" href="jquery.ratings.css" />
    <script src="jquery-1.3.2.min.js"></script>
    <script src="jquery.ratings.js"></script>
    <script src="example.js"></script>
</head>
<body>
<div class="main">
    <div class="minihead"></div>
    <div class="head" >
        <div class="logo">
             <a href="Main.jsp"><img src="images/pcs.PNG" width="200" height="90"></a>
        </div>
        <div class="Utabs"></div>
        <div class="tabs">
            <a href="Main.jsp" style="text-decoration:none;color: black">HOME</a> 
        </div>
    </div>  
    <div class="middle_box">
    <div class="left">Search Video:
        <br>
        <form name="comment" action="videos1.jsp" method="get">
                <input type="text"  name="search" ><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="search">
            </form>
        
    </div>
    <div class="mid">  
        <div id="mydiv" class="video">
            <video id="myvideo" width="500" height="350" controls>
              <%String videoid=request.getParameter("videoid");%>
                <source src="<%=videoid%>" type="video/mp4">
                     
            </video>
        Rate this video-<div id="example-2"></div>
        </div>
        
        <div class="freeuse"></div>
        <div class="videopreview" id="list" style="overflow:scroll;">
            <%
            String key=request.getParameter("search");
            System.out.println(key+"key");
            String s1 = null,s2 = null;
        java.sql.Connection con=null;
                String url1="jdbc:mysql://localhost:3306/pcs";
                Class.forName("com.mysql.jdbc.Driver");
                con=(java.sql.Connection) DriverManager.getConnection(url1,"root","root");
        PreparedStatement pst1=con.prepareStatement("Select * from videos");
         ResultSet rss=pst1.executeQuery();
                while(rss.next()){
                    
                    s1=rss.getString(1);
                    s2=rss.getString(2);
                    if(s1.contains(key)||s2.contains(key)){s1=s1.trim();System.out.println("S1->"+s1);%>
                        <a href="videoss.jsp?videoid=<%=s1%>.mp4" style="text-decoration:none;"><%=s1%></a><br>
            <% 
                    }
                 }
            %>
         </div>
    </div>
        <div id="comment" class="review" style="overflow:scroll;">
            Reviews:
            <%
                
                java.sql.Connection conn=null;
                String url="jdbc:mysql://localhost:3306/pcs";
                Class.forName("com.mysql.jdbc.Driver");
                conn=(java.sql.Connection) DriverManager.getConnection(url,"root","root");
                PreparedStatement pst=conn.prepareStatement("Select emp_id,comment from videos_review where video=?");
                String video=request.getParameter("videoid");
                session.setAttribute("present_video",video);
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
               &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="submit" value="submit">
            </form>
        </div>
    </div>
    <div class="footer">  </div>
 </div>
</body>
</html>