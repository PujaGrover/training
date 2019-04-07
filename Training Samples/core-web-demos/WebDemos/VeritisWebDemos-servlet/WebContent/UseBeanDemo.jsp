<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="person" class="com.veritis.jsp.Person" scope="session" />
<jsp:setProperty property="firstName" name="person" value="United IT"/>
<jsp:setProperty property="lastName" name="person" value="Solutions Inc.."/>
<jsp:setProperty property="city" name="person" value="Irving"/>
<jsp:setProperty property="ssn" name="person" value="123-45-6789"/>

<%
out.println("First Name : "+person.getFirstName()+"<br>");
out.println("Last Name : "+person.getLastName()+"<br>");
out.println("City Name : "+person.getCity()+"<br>");
out.println("SSN  : "+person.getSsn()+"<br>");
%>


<br> We are using Get Property to Get the values from Person Bean<br>
First Name : <jsp:getProperty property="firstName" name="person" /><br>
Last Name  : <jsp:getProperty property="lastName" name="person" /><br>
City Name  : <jsp:getProperty property="city" name="person" /><br>
SSN        : <jsp:getProperty property="ssn" name="person"/><br>
</body>
</html>