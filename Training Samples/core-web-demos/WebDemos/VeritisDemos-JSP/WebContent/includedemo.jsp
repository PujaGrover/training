<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>This is includdemo.jsp Page we are including other jsp below</h1><br>
<jsp:include page="displayheading.jsp"/><br>
<h1>This is after displayheading.jsp got called .....</h1>
</center>
</body>
</html>