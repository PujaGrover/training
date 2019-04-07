<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="../scripts/scripts.js" >
	
</script>
</head>
<body>
<form style="float: left;">
	Enter Email Address <input type="text" id="emailid" name="emailaddress" onBlur="javascript:validate(this);"/><div id="result"  style="float: right;" >Availability Check</div><br>
	Enter password <input type="password" id="password" name="password"/><br> 
	Re-Enter password <input type="password" id="rpassword" name="rpassword"/><br>
	<button>Register</button>
</form>
</body>
</html>