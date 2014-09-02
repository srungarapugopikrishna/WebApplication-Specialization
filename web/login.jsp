<%-- 
    Document   : Main
    Created on : Sep 4, 2013, 10:45:50 PM
    Author     : G0pS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
<link href="cs.css" rel="stylesheet" type="text/css">
<script language="javascript" type="text/javascript">
    //Validation for the registration page
    function validate(){
        //EmpId Validation
        var username=document.login.username.value;
            if(username==""){
                alert("Enter User name");
                document.login.username.focus();
                return false;
            }
        var password=document.login.password.value;
            if(password==""){
                alert("Enter password");
                document.login.password.focus();
                return false;
            }
         
    }
</script>
</head>
<body>
<div class="main">
    <div class="minihead"></div>
    <div class="head" >
        <div class="logo">
             <a href="index.jsp"><img src="images/pcs.PNG" width="200" height="90"></a>
        </div>
        <div class="Utabs"></div>
        <div class="tabs">
            <a href="index.jsp" style="text-decoration:none;color: black">HOME</a> 
        </div>
    </div>  
    <div class="middle_box">
    <div class="left"></div>
    <div class="mid">
        <table>
            <form name="login" action="login" method="get" onsubmit="return validate()">
            <tr>
                <td style="font-family: Calibri; color: #333;">UserName:</td>
                <td>
                    <input type="text" name="username">
                </td>
            </tr>
            <tr>
                <td style="font-family: Calibri; color: #333;">Password:</td>
                <td>
                    <input type="password" name="password">
                </td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="submit" onClick="validate()">
                </td>
            </tr>
            </form>
            
        </table>
        <a href="reg.jsp">New User?</a>
    </div>
    
    <div class="r1"></div>
</div>
    <div class="footer">  </div>
</div>
    
</body>
</html>