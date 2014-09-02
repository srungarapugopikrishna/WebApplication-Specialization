<%-- 
    Document   : reg
    Created on : Sep 7, 2013, 6:32:24 PM
    Author     : G0pS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
<link href="cs.css" rel="stylesheet" type="text/css"> 
<script language="javascript" type="text/javascript">
    function username(){
        var uname=document.regform.uname.value;
        if(uname==""){
            alert("Field shoul be filled");
            document.regform.uname.focus();
            return false;
        }
    }
    //Validation for the registration page
    function validate(){
        //EmpId Validation
        var empid=document.regform.empid.value;
            if(empid==""){
                alert("Emp Id should not be left empty");
                document.regform.empid.focus();
                return false;
            }
        //MailId Validation
        var mailid=document.regform.mailid.value;
        //Regular Expression to check for a valid Email ID aren't
        var regmail=/^[a-zA-Z0-9._-]+@[a-zA-Z]+\.[a-zA-Z]{2,6}$/;
            if(mailid==""){
                alert("Emp Id should not be left empty");
                document.regform.mailid.focus();
                return false;
            }
            //Checks for valid mail id by matching the mailid entered to the regular expression
            else if(!mailid.match(regmail)){
                alert("Enter Valid Mail-ID");
                document.regform.mailid.focus();
                return false;
            }
        var password=document.regform.password.value;
        var repassword=document.regform.repassword.value;
            if(password==""){
                alert("Enter password");
                document.regform.password.focus();
                return false;
            }
            if(repassword==""){
                alert("Re-Enter password");
                document.regform.repassword.focus();
                return false;
            }
            if(repassword!=password){
                alert("Password doesn't match");
                document.regform.repassword.focus();
                return false;
            }
          
        var phnum=document.regform.phnum.value;
            if(phnum==""){
                alert("Enter Ph Num");
                document.regform.phnum.focus();
                return false;
            }
            if(phnum.length!=10){
                alert("Enter Valid Ph Num");
                document.regform.phnum.focus();
                return false;
            }
    }
</script>
</head>
<body background="bgg.jpg">
    
<div class="main">
    <div class="minihead"></div>
    <div class="head" >
        <div class="logo">
             <a href="index.jsp"><img src="images/pcs.PNG" width="200" height="90"></a>
        </div>
        <div class="Utabs"></div>
        <div class="tabs">

        </div>
    </div>         
    <div class="middle_box">
    <div class="left"></div>
    <div class="mid">
        <table>
            <form name="regform" action="registration" method="get" onsubmit="return validate()">
            <tr>
                <td style="font-family: Calibri; color: #333;">Employee ID:</td>
                <td>
                    <input type="text" name="empid">
                </td>
            </tr>
            <tr>
                <td style="font-family: Calibri; color: #333;">Mail ID:</td>
                <td>
                    <input type="text" name="mailid">
                </td>
            </tr>
            <tr>
                <td style="font-family: Calibri; color: #333;">Password:</td>
                <td>
                    <input type="password" name="password">
                </td>
            </tr>
            <tr>
            <td style="font-family: Calibri; color: #333;">Re-Type Password:</td>
                <td>
                    <input type="password" name="repassword">
                </td>
            </tr>
            <tr>
                 <td style="font-family: Calibri; color: #333;">Ph Num:</td>
                 <td>
                     <input type="text" name="phnum">
                 </td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="submit" onClick="validate()">
                </td>
            </tr>
            </form>
        </table>
        
    </div>
    <div class="r1"></div>
</div>
    <div class="footer">  </div>
</div>
</body>
</html>