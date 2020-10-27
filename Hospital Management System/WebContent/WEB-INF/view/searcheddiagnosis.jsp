<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page errorPage = "showerrorphysician.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>javaguides.net</title>
<style type="text/css">
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
table {
  border-collapse: collapse;
  width: 100%;
}

th, td {
  text-align: left;
  patientdding: 8px;
}

tr{background-color: #f2f2f2}

th {
  background-color: #4CAF50;
  color: white;
}
.navbar {
	
  overflow: hidden;
  background-color: #333;
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
   <h1 align="center" style="color: blue;">CAPITAL HOSITALS</h1>
   <hr/>

   
   
     <div align="center"  style="color:blue;" class="patientnel-title"><h3>Patient Details</h3></div>
   
     <table align="center" border="1"   class="table table-striped table-bordered">
      <tr>
       <th>First Name</th>
       <th>Last Name</th>
       <th>Email</th>
       <th>DateOfBirth</th>
       <th>Contact Number</th>
       <th>State</th>
       <th>Insurance Plan</th>
     
      </tr>

      
     
      
       <tr>
        <td>${patient.firstName}</td>
        <td>${patient.lastName}</td>
        <td>${patient.email}</td>
		<td>${patient.dob}</td>
		<td>${patient.contactNumber}</td>
		<td>${patient.state}</td>
		<td>${patient.insurancePlan}</td>
       
       
     
		</tr>
		 </table>
  
     <div align="center"  style="color:blue;" class="panel-title"><h3>Physician Details</h3></div>
   
     <table align="center" border="1"   class="table table-striped table-bordered">
     <tr>
     
       <th>Physician First Name</th>
       <th>Physician Last Name</th>
       <th>Department</th>
       <th>Qualification</th>
       <th>Experience</th>
      
      
      </tr>



      
       <tr>
        <td>${physician.physicianFName}</td>
        <td>${physician.physicianLName}</td>
        <td>${physician.department}</td>
		<td>${physician.qualification}</td>
		<td>${physician.yearsOfExperience}</td>
		
       
      

     </table>

     <div align="center"  style="color:blue;" class="panel-title"><h3>Diagnosis Details</h3></div>
    
     <table align="center" border="1"   class="table table-striped table-bordered">
      <tr>
     
       <th>Symptoms</th>
       <th>Diagnosis Provided</th>
       
       <th> Date of Diagnosis</th>
      
       <th>Bill Amount </th>
       <th>Card Number </th>
       <th>Mode Of Payment</th>
     
      </tr>

      
		
      
       <tr>
        
        <td>${diagnosis.symptoms}</td>
        <td>${diagnosis.diagnosisProvided}</td>
		
		<td>${diagnosis.dod}</td>
		
       <td>${diagnosis.billAmount}</td>
		<td>${diagnosis.cardNumber}</td>
       <td>${diagnosis.modeOfPayment}</td>
     
		
   

     </table>



 
</body>
</html>