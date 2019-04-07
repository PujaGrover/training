<html>
<h1> Inner Page</h1>
<%@page session="true"%>
<%
String uname=request.getParameter("uname");
String passwd=request.getParameter("passwd");

 if (uname.equals(passwd)){
	
	session.setAttribute("islogin",true);
 }
else{ 
	session.setAttribute("islogin",false);
	
}
%>
<jsp:forward page="Inner2.jsp"/>
<h2>Welcome to Inner Page </h2>
</html>
