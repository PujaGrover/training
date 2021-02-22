<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.veritis.jsp.demos.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<jsp:useBean id="p" class="com.veritis.jsp.demos.Person" scope="session"/>
<jsp:setProperty property="firstName" name="p" value="Veritis"/>
<jsp:setProperty property="lastName" name="p" value="Group Inc"/>
<jsp:setProperty property="city" name="p" value="Irving"/>

WE are printing using scriptlets <br><br><br>
<%
	out.println("Name is "+p.getFirstName()+" "+p.getLastName()+"<br>");
	out.println("This exist in "+p.getCity()+"<br>");
	
	p.setFirstName("Venkata");
	p.setLastName("Saranu");
	p.setCity("Plano");
	
%>

<br><br><br>We are printing using jsp getProperty <br>

<jsp:getProperty property="firstName" name="p"/><br>
<jsp:getProperty property="lastName" name="p"/><br>
<jsp:getProperty property="city" name="p"/><br>
</body>
</html>