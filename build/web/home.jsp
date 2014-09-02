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
function  changeVideo(id)
{
 var xmlhttp;    
if (id=="")
  {
  document.getElementById("comment").innerHTML="";
  return;
  }
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
    document.getElementById("comment").innerHTML=xmlhttp.responseText;
    }
  }
xmlhttp.open("GET","coment.jsp",true);
 xmlhttp.send();
    
 video=document.getElementById("myvideo");
 video.src=id;
 
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
            <a href="Main.jsp"><img src="images/bhome.PNG"></a> 
        </div>
    </div>  
    <div class="middle_box">
    <div class="left"></div>
    <div class="mid">  
        <div id="mydiv" class="video">
            <video id="myvideo" width="500" height="350" controls>
              <%String videoid=request.getParameter("videoid");%>
                <source src="<%=videoid%>" type="video/mp4">
                     
            </video>
        Rate this video-<div id="example-2"></div>
        </div>
        
        <div class="freeuse"></div>
        <div class="videopreview" style="overflow:scroll;">
        <br><b><u>Recommended Videos</u></b><br><br>
        <%
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

                 %><br><div id="<%=files%>" onclick="changeVideo(this.id);" style="color:#000000" onmouseover="this.style.color = '#FF6600'" onmouseout="this.style.color = '#000000'"> <img src="<%=pic[0]%>" width="30" height="30">   <%=files%></div><%
              }
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
        </div>
    </div>
    <div class="footer">  </div>
 </div>
</body>
</html>