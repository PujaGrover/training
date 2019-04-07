<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h1>Spring MVC Hello World Example</h1>

<table border="2">
<tr>
	<th>Emp No</th>
	<th>Emp Name</th>
	<th>Desgination</th>
	
</tr>
	<c:forEach var="emp" items="${empList}">
		<tr>
			<td>${emp.empno}</td>
			<td>${emp.ename}</td>
			<td>${emp.job}</td>
		</tr>
	</c:forEach>
</table>

</body>
</html>