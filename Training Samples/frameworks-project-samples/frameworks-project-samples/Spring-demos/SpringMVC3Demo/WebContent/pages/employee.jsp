<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.veritis.spring.mvc3.domain.Emp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Emp e=(Emp)request.getAttribute("emp");
	out.println(e.getEmpno());
	out.println(e.getEname());
	out.println(e.getSal());
 %>
</body>
</html>