<%-- 
    Document   : Main
    Created on : Sep 4, 2013, 10:45:50 PM
    Author     : G0pS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
<link href="cs.css" rel="stylesheet" type="text/css"> 
</head>
<body background="bgg.jpg">
    
<div class="main">
    <div class="minihead"></div>
    <div class="head" >
        <div class="logo">
             <a href="Main.jsp"><img src="images/pcs.PNG" width="200" height="90"></a>
        </div>
        <div class="Utabs"></div>
        <div class="tabs">
            <a href="Main.jsp" style="text-decoration:none;color:black">HOME&nbsp;&nbsp;&nbsp;&nbsp;</a><a href="home.jsp" style="text-decoration:none;color:black">VIDEOS</a>
        </div>
    </div>         
    <div class="middle_box">
    <div class="left"></div>
    <div class="mid">
        
       <form action="uploadfile.jsp" method="get">
            Video Name: <input type="text" name="video" /><br>
            Description:    <input type="text" name="desc" /><br>
            Enter tags with a comma(,) in between<br>
            Tags:<input type="text" name="tags" /><br>
             
            <input type="submit" />
</form>
    </div>
    
    <div class="r1"></div>
</div>
    <div class="footer">  </div>
</div>
</body>
</html>