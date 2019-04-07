<%-- 
    Document   : include
    Created on : Jul 8, 2012, 10:59:07 AM
    Author     : RajithaVenkat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World We are in include JSP </h1>
        <jsp:include page="included.jsp"/>
        <h1><font color="red">We are in include page after coming back from included</font></h1>
    </body>
</html>
