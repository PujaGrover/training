<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<jsp:include page="taglibs.jsp" />
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Infra Excel File</title>
</head>
<body>
	<div class="page-header">
		<a href="${contextPath}/">
		<img alt="Brand" src="${contextPath}/resources/images/aalogo.png"
			style="float: left; height: 75px; margin-right: 50px;" />
			</a>
		<h1 class="title">RPT - LAB Servers Excel Files</h1>
		<c:if test="${pageContext.request.userPrincipal.name != null}">
        <form id="logoutForm" method="POST" action="${contextPath}/logout">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>
        <h5 class="title">Welcome ${pageContext.request.userPrincipal.name} | <a onclick="document.forms['logoutForm'].submit()" style="color:red">Logout</a></h5>
    </c:if>
		<br>
	</div>
	<div class="container">
		<form:form action="${contextPath}/file/processExcel" method="post"
			enctype="multipart/form-data">
			<div class="form-group">
				<h2>
					<span class="label label-primary" style="width: 35%;">Excel
						File 2003:</span>
				</h2>
				<br> <input name="excelfile" type="file" class="form-control"
					style="width: 30%; float: left;">
				<button class="btn  btn-success btn-block" type="submit"
					style="width: 25%; float: left;">Process Excel</button>
			</div>
		</form:form>
		<br> <br>
	</div>
	<br>
	<br>
	<div class="container">
		<form:form action="${contextPath}/file/processExcel07" method="post"
			enctype="multipart/form-data">
			<div class="form-group">
				<h2>
					<span class="label label-primary" style="width: 35%;">Excel
						File 2007:</span>
				</h2>
				<br> <input name="excelfile2007" type="file"
					class="form-control" style="width: 30%; float: left;">
				<button class="btn  btn-success" type="submit"
					style="width: 25%; float: left;">Process Excel2007</button>
			</div>
		</form:form>
	</div>
	<br>
	<br>
	<div style="float:left;margin-left:10%">
		<form:form action="${contextPath}/file/servers" method="get">
			<button class="btn btn-lg btn-warning btn-block" type="submit">Servers</button>
		</form:form>
	</div>
	<div  style="float:left;margin-left:25px">
		<form:form action="${contextPath}/file/addserver" method="get">
		<button class="btn btn-lg btn-warning btn-block"  type="submit" >Add New Server</button>
		</form:form>
	</div>
</body>
</html>