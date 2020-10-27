<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

.login-page {
  width: 360px;
  padding: 8% 0 0;
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
#input7,#input8,#input9{
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
select
{
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

.form input {
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
  margin-bottom:10px;
  border: 0;
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
function Check(val){
 var element=document.getElementById('form1');
 var element1=document.getElementById('form2');
 var element2=document.getElementById('form3');
 if(val==='pick a criteria' )
	 {
   element.style.display='none';
 element1.style.display='none';
 element2.style.display='none';
	 }
 else  if(val==="state")
	 {
   element.style.display='block';
   element1.style.display='none';
   element2.style.display='none';
	 }
 else  if(val==="insurancePlan")
 {
element.style.display='none';
element1.style.display='block';
element2.style.display='none';
 }
 else
	 {
	 element.style.display='none';
	 element1.style.display='none';
	 element2.style.display='block';
	 }
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
<div class="login-page">
<h2 align="center">Physician Search</h2>
  <div class="form">
 
  <select name="formselct" onchange="Check(this.value);">
  <option>pick a criteria</option>
  <option value="state">state</option>
  <option value="insurancePlan">plan</option>
  <option value="depatment">department</option>
  </select>
   <div id="form1" style="display:none;">
  <form:form action="${pageContext.request.contextPath}/searchedphysicianstate"  method="get" modelAttribute="physicianreg" >
<form:select path="state">
<form:option value="maharastra" label="Maharashtra"></form:option>
<form:option value="delhi" label="Delhi"></form:option>
<form:option value="karnataka" label="Karnataka"></form:option>
<form:option value="orisa" label="Odisha"></form:option>
<form:option value="punjab" label="Punjab"></form:option>
</form:select>
 
  
         <button>login</button>
         </form:form>
         </div>
         <div id="form2" style="display:none;">
  <form:form action="${pageContext.request.contextPath}/searchedphysician"  method="get" modelAttribute="physicianreg" >

<form:select path="insurancePlan">
<form:option value="yes" label="Yes"></form:option>
<form:option value="no" label="No"></form:option>

</form:select>
 
         <button>login</button>
         </form:form>
         </div>
         <div id="form3" style="display:none;">
         <form:form action="${pageContext.request.contextPath}/searchedphysiciandepartment"  method="get" modelAttribute="physicianreg" >
<form:select path="department">
<form:option value="Cardiologist" label="Cardiologist"></form:option>
<form:option value="Surgeon" label="Surgeon"></form:option>
<form:option value="Dermatologist" label="Dermatologist"></form:option>
<form:option value="Psychiatrist" label="Psychiatrist"></form:option>

</form:select>
 
  
         <button>login</button>
         
        </form:form>
        </div>
  </div>
</div>
</body>
</html>