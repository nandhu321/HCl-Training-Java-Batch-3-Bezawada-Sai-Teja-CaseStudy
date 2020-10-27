<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/formpatient">
<input type="submit" value="Add Pateint">
</form>
<form action="${pageContext.request.contextPath}/formphysician">
<input type="submit" value="Add Physician">
</form>
<form action="${pageContext.request.contextPath}/listpatients">
<input type="submit" value="View Patients">
</form>
<form action="${pageContext.request.contextPath}/listphysicians">
<input type="submit" value="View Physicians">
</form>
</body>
</html>