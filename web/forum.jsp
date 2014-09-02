 <%@page import="java.net.URLConnection"%>
<%@page import="java.net.URL"%>
<%@page import="java.io.PrintStream"%>
<%@page import="java.io.FileOutputStream"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%-- 
    Document   : Main
    Created on : Sep 4, 2013, 10:45:50 PM
    Author     : G0pS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
<link href="cs.css" rel="stylesheet" type="text/css"> 
<title>Important</title>
 <script>
function showCustomer(str)
{
var xmlhttp;    
if (str=="")
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
    document.getElementById("txtHint").innerHTML=xmlhttp.responseText;
    }
  }
xmlhttp.open("GET","fom.?q="+str,true);
xmlhttp.send();
}
</script>

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
       
        </div>
    </div>  
    <div class="middle_box">
    <div class="l1"></div>
    <div class="forummatter" style="overflow:scroll;"><br> 
         
                <video id="myvideo" width="500" height="350" controls>
                  <%String videoid=request.getParameter("videoid");
                  videoid=videoid.trim();
                  %>
                    <source src="<%=videoid%>" type="video/mp4">

                </video><br>
        
                
        <%
        java.sql.Connection conn=null;
                String url="jdbc:mysql://localhost:3306/pcs";
                Class.forName("com.mysql.jdbc.Driver");
                conn=(java.sql.Connection) DriverManager.getConnection(url,"root","root");
                String video=request.getParameter("videoid");
                String[] Videoo = video.split("\\.");
              //  System.out.println("Video---->"+video);
                String ans="",ansid="";
                PreparedStatement pst=conn.prepareStatement("Select * from forumquestions");
               session.setAttribute("forumvideo",video);
   
                ResultSet rs=pst.executeQuery();
                while(rs.next()){
                   String v=rs.getString("VideoName");
                    String Ques=rs.getString("Question");
                    
                   if(v.equals(Videoo[0])){String Qid=rs.getString("Qid");
                   String emp=rs.getString("emp_id");
        %>        Emp_id:  <%=emp%><br>
                  Que:    <%=Ques%><br>
                   
               
        <%  
                     PreparedStatement ps1=conn.prepareStatement("Select * from forumanswers where Emp_id=?");
                     ps1.setString(1,Qid); 
                     ResultSet rs1=ps1.executeQuery();int id=10;
                     while(rs1.next())
                         {
                            System.out.println("Rs1--->");
                        ans=rs1.getString("Answer");ansid=rs1.getString("Qid");
                    %>  
                    Emp_id:  <%=ansid%><br>
                    Ans:     <%=ans%><br>
                        
                    <%}%> 
                       <form name="ForumAns" action="fans"  method="get"> 
                           <input type="hidden" name="Qid" value="<%=Qid%>">
                  &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp      Reply:: <input type="text" name="Ans"><br>
                  &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp      <input type="submit" value="submit">
                    </form>  
                    <%
                   } }
        %>
        </select>
        </form>
       <form name="ForumQue" action="fques" method="get">
     Ques:: <input type="text" name="Que"><br>
     <input type="submit" value="submit">
        </form> 
    </div>
    <div class="r1"><br><br><br><br> 
    </div>
    </div>
    <div class="footer">  </div>
</div>
</body>
</html>