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
function changeImage()
{
element=document.getElementById('myimage')
if (element.src.match("b"))
  {
  element.src="a.jpg";
  }
else
  {
  element.src="b.jpg";
  }
}
 
function showHint(str)
{
var xmlhttp;
if (str.length==0)
  { 
  document.getElementById("txtHint").innerHTML="";
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
    document.getElementById("list").innerHTML=xmlhttp.responseText;
    }
  }
xmlhttp.open("GET","valuesearch.jsp?search="+str,true);
xmlhttp.send();
}
  </script>
 <style type="text/css">
.tooltip {
	display:none;
	position:absolute;
	border:1px solid #333;
	background-color:#161616;
	border-radius:5px;
	padding:10px;
	color:#fff;
	font-size:12px Arial;
}
</style>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function() {
        // Tooltip only Text
        $('.masterTooltip').hover(function(){
                // Hover over code
                var title = $(this).attr('title');
                $(this).data('tipText', title).removeAttr('title');
                $('<p class="tooltip"></p>')
                .text(title)
                .appendTo('body')
                .fadeIn('slow');
        }, function() {
                // Hover out code
                $(this).attr('title', $(this).data('tipText'));
                $('.tooltip').remove();
        }).mousemove(function(e) {
                var mousex = e.pageX + 20; //Get X coordinates
                var mousey = e.pageY + 10; //Get Y coordinates
                $('.tooltip')
                .css({ top: mousey, left: mousex })
        });
});
</script>
</head>
<body>
<script>
function changeImage1(rating)
{
  element=document.getElementById('img1')
  var pattern = /\bb.jpg/g;
 if (element.src.match(pattern)&&rating<1)
  { 
  element.src="a.jpg";
  }
else
  { 
  element.src="b.jpg";
  }
}
function changeImage2(rating)
{
element=document.getElementById('img2')
var pattern = /\bb.jpg/g;
 if (element.src.match(pattern)&&rating<2)
  {
  element.src="a.jpg";
  }
else
  {
  element.src="b.jpg";
  }
  changeImage1(rating);
}
function changeImage3(rating)
{
element=document.getElementById('img3')
var pattern = /\bb.jpg/g; 
 if (element.src.match(pattern)&&rating<3)
  {
  element.src="a.jpg";
  }
else
  {
  element.src="b.jpg";
  }
   
  changeImage2(rating);
}
function changeImage4(rating)
{
element=document.getElementById('img4')
var pattern = /\bb.jpg/g;
 if (element.src.match(pattern)&&rating<4)
  {
  element.src="a.jpg";
  }
else
  {
  element.src="b.jpg";
  }
   
  changeImage3(rating);
}
function changeImage5(rating)
{
element=document.getElementById('img5')
var pattern = /\bb.jpg/g;
 if (element.src.match(pattern)&&rating<5)
  {
  element.src="a.jpg";
  }
else
  {
  element.src="b.jpg";
  }
   
  changeImage4(rating);
}
</script>
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
            <form action=""> 
                <input type="text" id="txt1" onkeyup="showHint(this.value)" />
</form>

        </div>
        <div class="mid">  
            <div id="mydiv" class="video" style="overflow:scroll;">
                <video id="myvideo" width="500" height="350" controls>
                  <%String videoid=request.getParameter("videoid");
                  String [] vdio=videoid.split("\\.");
                  videoid=videoid.trim();
                  %>
                    <source src="<%=videoid%>" type="video/mp4">

                </video>
            Rate this video- 
            <%      String[]rate=new String[5];
            int noofvotes=0;
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
                        noofvotes=rss.getInt("Count");
                        rating=rss.getInt("Rating");
                        for(int i=0;i<5;i++){
                          if(i<rating){
                              rate[i]="b";
                          }
                         }
                    }
            %>
            <%----------------------Rating shold be placed---------------------------------------------%>
            <a href="Rating?value=1&video=<%=vdio[0]%>"><img id="img1" onmouseover="changeImage1(<%=rating%>)" onmouseout="changeImage1(<%=rating%>)" class="masterTooltip" title="1 out of 5 stars" src="<%=rate[0]%>.jpg"></a>
            <a href="Rating?value=2&video=<%=vdio[0]%>"><img id="img2" onmouseover="changeImage2(<%=rating%>)" onmouseout="changeImage2(<%=rating%>)" class="masterTooltip" title="2 out of 5 stars" src="<%=rate[1]%>.jpg"></a>
            <a href="Rating?value=3&video=<%=vdio[0]%>"><img id="img3" onmouseover="changeImage3(<%=rating%>)" onmouseout="changeImage3(<%=rating%>)" class="masterTooltip" title="3 out of 5 stars" src="<%=rate[2]%>.jpg"></a>
            <a href="Rating?value=4&video=<%=vdio[0]%>"><img id="img4" onmouseover="changeImage4(<%=rating%>)" onmouseout="changeImage4(<%=rating%>)" class="masterTooltip" title="4 out of 5 stars" src="<%=rate[3]%>.jpg"></a>
            <a href="Rating?value=5&video=<%=vdio[0]%>"><img id="img5" onmouseover="changeImage5(<%=rating%>)" onmouseout="changeImage5(<%=rating%>)" class="masterTooltip" title="5 out of 5 stars" src="<%=rate[4]%>.jpg"></a>
            <br>
            <%=noofvotes%> votes given.(Rating <%=rating%>) 
            <br>
            <a href="download?file=<%=vdio[0]%>"><img id="download" src="dwnload.jpg"></a>
            <br>
            
            <%----------------------Rating Finished---------------------------------------------%>          
             <% String videoo=request.getParameter("videoid");%>
        <a href="forum.jsp?videoid=<%=videoo%>">Forum</a><br><br>
        <b><u>Comments:</b></u>
                <%

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
                      %>
                      <br> <%=empid%>::<%=comment%><br>
                           <%=time%>
                <%
                    }
                %>
                <form name="comment" action="comment" method="get">
                    <input type="text" name="review"><br>
                   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="submit" value="submit">
                </form>
            </div>
        
            <div class="freeuse"></div>
            <div class="videopreview" id="list" style="overflow:scroll;">
            <br><b><u>Recommended Videos</u></b><br><br>
            <%
            PreparedStatement pst1=conn.prepareStatement("Select name from videos");
            ResultSet rs1=pst1.executeQuery();
            String[] pic={"",""};
//                     pic[0]=pic[0]+".png";
            while(rs1.next()){
            String files=rs1.getString("name");
            files=files+".mp4";
           // System.out.println("Files---"+files);
            %>
            <br><div style="color:#000000" onmouseover="this.style.color = '#FF6600'" onmouseout="this.style.color = '#000000'"> <a href="videoss.jsp?videoid=<%=files%>" style="text-decoration:none;"><img src="<%=pic[0]%>" width="30" height="30"> <%=files%> </a></div>
            <%}
            %>
            <%
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
//                     %><%
//                  }
//             }
//            }
            %> 
            
            </div>
        </div>
            <div id="comment" class="review" style="overflow:scroll;">
                <b><u>Description::</u></b><br>
                <%
                        
                  pst1=conn.prepareStatement("Select description from videos where name=?");
                  pst1.setString(1,vdio[0]);
                  System.out.println("VNaMe->->"+vdio[0]);
                   rs1=pst1.executeQuery();String description;
                   while(rs1.next()){
                   description=rs1.getString("description");
                   %><br>
                <%=description%>
                <%
                   }
                %> 
            </div>
        </div>
        <div class="footer">  </div>
     </div>
 


</body>
</html>