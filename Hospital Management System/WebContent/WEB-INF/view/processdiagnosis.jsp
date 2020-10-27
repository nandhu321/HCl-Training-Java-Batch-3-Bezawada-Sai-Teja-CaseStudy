<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">

.register {
  width: 360px;
  padding: 1% 0 0;
  margin: auto;
}
.form {
  position: relative;
  z-index: 1;
  background: #FFFFFF;
  max-width: 360px;
  margin: 0 auto 100px;
  padding: 45px;
  text-align: center;
  box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);
}
#input {
  font-family: "Roboto", sans-serif;
  outline: 0;
  background: #f2f2f2;
  width: 100%;
  border: 0;
  margin: 0 0 15px;
  padding: 15px;
  box-sizing: border-box;
  font-size: 14px;
}
#input7 {
  font-family: "Roboto", sans-serif;
  outline: 0;
  background: #f2f2f2;
  width: 100%;
  border: 0;
  margin: 0 0 15px;
  padding: 15px;
  box-sizing: border-box;
  font-size: 14px;
}
.form button {
  font-family: "Roboto", sans-serif;
  text-transform: uppercase;
  outline: 0;
  background: #4CAF50;
  width: 100%;
  border: 0;
  margin-bottom:10px;
  padding: 15px;
  color: #FFFFFF;
  font-size: 14px;
  -webkit-transition: all 0.3 ease;
  transition: all 0.3 ease;
  cursor: pointer;
}
.form button:hover,.form button:active,.form button:focus {
  background: #43A047;
}
body {
margin:0;
  background: #76b852; /* fallback for old browsers */
  background: -webkit-linear-gradient(right, #76b852, #8DC26F);
  background: -moz-linear-gradient(right, #76b852, #8DC26F);
  background: -o-linear-gradient(right, #76b852, #8DC26F);
  background: linear-gradient(to left, #76b852, #8DC26F);
  font-family: "Roboto", sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;      
}
.error {
font:bold;
color: red;
	
}
.navbar {
	
  overflow: hidden;
  background-color: #333;
}
.navbar h2{

  font-size: 16px;
  color: white;
  
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;

}
.navbar .a1 {
  float: left;
  font-size: 16px;
  color: white;
  
  
  padding: 14px 16px;
  text-decoration: none;
}


.navbar .a1 {
  float: left;
  font-size: 16px;
  color: white;
  
  
  padding: 14px 16px;
  text-decoration: none;
}

.dropdown h3{
float:right;
}
.dropdown {
  float: left;
  overflow: hidden;
}

.dropdown .dropbtn {
  font-size: 16px;  
  border: none;
  outline: none;
  color:white;
  padding: 14px 16px;
  background-color: inherit;
  font-family: inherit;
  margin: 0;
}

.navbar a:hover, .dropdown:hover .dropbtn {
  background-color: red;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  float: none;
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  text-align: left;
}

.dropdown-content a:hover {
  background-color: #ddd;
}

.dropdown:hover .dropdown-content {
  display: block;
}
.navbar .logout
{
float: right;
  font-size: 16px;
  color: white;
  
  
  padding: 14px 16px;
  text-decoration: none;
}


</style>
<script type="text/javascript">
function CheckColors(val){
 var element=document.getElementById('input7');
 if(val==='pick a choice' || val ==="no")
   element.style.display='none';
 else  
   element.style.display='block';
}
function Check(val){
	 var element1=document.getElementById('input8');
	 if(val==='pick a choice' || val ==="no")
	   element1.style.display='none';
	 else  
	   element1.style.display='block';
	}



</script> 
</head>
<body>

<div class="navbar">
  <a class="a1" href="/Sample/profile">Home</a>
   
  <div class="dropdown">
    <button class="dropbtn">Operation
      <i class="fa fa-caret-down"></i>
    </button>
     
   
    <div class="dropdown-content">
      <a href="/Sample/patient?">Patient</a>
      <a href="/Sample/physician?">Physician</a>
      <a href="/Sample/diagnosis">Diagnosis</a>
       <a href="/Sample/searchdiagnosis?">History</a>
    </div>
    	 
    
   
  </div> 
  <h2 style="margin:0; padding-left:34%;     color:#FFFFFF; display:inline-block;" >Capital Hospitals</h2>
  <a  href="/Sample/logout" class="logout">Logout</a>
</div>

<div class="register">
<h2 align="center">Diagnosis Details Registration</h2>
<div class="form">
<form:form id="login-form" action="${pageContext.request.contextPath}/saveDiagnosis"  method="post" modelAttribute="diagnosisreg">

<form:input path="pid" id="input" placeholder="Patient Id" />
<form:errors path="pid" cssClass="error"></form:errors>
<form:input path="symptoms" id="input" placeholder="Symptoms"/>
<form:errors path="symptoms" cssClass="error"></form:errors>

<form:input path="diagnosisProvided" id="input" placeholder="Diagnosis Provided"/>
<form:errors path="diagnosisProvided" cssClass="error"></form:errors>

<form:input path="eid" id="input" placeholder="Admistered by doctor id"/>
<form:errors path="eid" cssClass="error"></form:errors>

<form:input path="dod" id="input" placeholder="Date of Diagnosis"/>
<form:errors path="dod" cssClass="error"></form:errors>




<form:label path="followUpRequired">Follow Up Required</form:label>
<form:select id ="input" onchange="CheckColors(this.value);" path="followUpRequired"> 
		<form:option value="pick a choice"></form:option> 
        <form:option value="yes" label="yes"/>  
        <form:option value="no" label="no"/>  
        </form:select>
  <form:input type="text" path="dof" id="input7" placeholder="Date of followup" style="display:none;"/>
 <form:input path="billAmount" id="input" placeholder="Bill Amount"/>
<form:errors path="billAmount" cssClass="error"></form:errors>
 <form:input path="cardNumber" id="input" placeholder="Card Number"/>
<form:errors path="cardNumber" cssClass="error"></form:errors>
 <form:input path="modeOfPayment" id="input" placeholder="Mode of Payment"/>
<form:errors path="modeOfPayment" cssClass="error"></form:errors>
   <button>Register</button>
   <button type="reset">Reset</button>
</form:form>
</div>
</div>
   
 </body>
 
</html>