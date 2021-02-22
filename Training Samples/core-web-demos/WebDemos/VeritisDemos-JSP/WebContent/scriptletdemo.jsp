<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<%-- This is Commented Line which wont show on the screen --%>
<%! public int factorial(int n){
	int fact=1;
	for(int i=1;i<=n;i++)
		fact=fact*i;
	
	return fact;
	}
%>

<%

	for(int i=1;i<=7;i++)
	{
		out.println("factorial of "+i+" is "+factorial(i)+"<br>");		
	}
%>


</body>
</html>