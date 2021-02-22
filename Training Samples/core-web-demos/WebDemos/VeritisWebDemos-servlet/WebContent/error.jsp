<%-- 
    Document   : error
    Created on : Feb 21, 2010, 11:48:37 AM
    Author     : vsaranu
--%>

<%@page  isErrorPage="true"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body><center>
        <h1>Hello The Exception is </h1>
        <font color="red" size="10">
         <%= exception.getMessage() %>

        </font>
        </center>
    </body>
</html>
