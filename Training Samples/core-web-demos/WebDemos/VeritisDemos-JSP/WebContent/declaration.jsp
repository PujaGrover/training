<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%-- This is comment --%>
<%! public int factorial(int n){
		int fact=1;
		for(int i=1;i<=n;i++){
			fact=fact*i;
		}
		return fact;
	}
%>
<body>

<%= "Factorial of 6 is "+factorial(6) %>
</body>
</html>