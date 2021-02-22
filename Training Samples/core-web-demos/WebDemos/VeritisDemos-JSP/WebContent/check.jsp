<%@page session="true" %>
<%
	boolean islogin=(Boolean)session.getAttribute("islogin");
	if(!islogin){
	throw (new Exception("My Security Exception"));
	}
  %>

		