<%-- 
    Document   : declerationdemo
    Created on : Dec 20, 2010, 8:42:13 PM
    Author     : vsaranu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%!
    public int factorial(int n){
        int fact=1;
        
                for(int i=1;i<=n;i++){
                    fact=fact*i;
                }
        return fact;
    }
 %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delaration Demo Page</title>
    </head>
    <body>
        <%="the factorial is "+factorial(6)%>

        

    </body>
</html>
