<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<jsp:include page="taglibs.jsp" />

<!DOCTYPE html>
<html lang="en">
    <head> 
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Add New Server</title>
	</head>
	<body>
	<div class="page-header">
	<a href="${contextPath}/">
		<img alt="Brand" src="${contextPath}/resources/images/aalogo.png"
			style="float: left; height: 75px; margin-right: 50px;" /></a>
		<h1 class="title">RPT - Edit LAB Server</h1>
		<c:if test="${pageContext.request.userPrincipal.name != null}">
        <form id="logoutForm" method="POST" action="${contextPath}/logout">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>
        <h5 class="title">Welcome ${pageContext.request.userPrincipal.name} | <a onclick="document.forms['logoutForm'].submit()" style="color:red;">Logout</a></h5>
      </c:if>
		<br>
	</div>
		<c:if test="${not empty message}">
			<div class="alert alert-success">
 				 <strong>Success!</strong> ${message}
			</div>
		</c:if>
		<div class="container">
		<a href="${contextPath}/">
				<div class="form-group ">
							<button class="btn btn-primary btn-lg login-button"><i class="fa fa-list"></i> Servers</button>
						</div>
		</a>
		</div>
		<div class="container">
			<div class="row main">
				<div class="main-login main-center">
				<h2 style="text-align:center;">Edit Server Details</h2>
					<form:form id="serverForm" modelAttribute="server" action="${contextPath}/file/updateserver" method="post" enctype="multipart/form-data">
						<form:hidden path="id" />
						<div class="form-group">
							<label for="name" class="cols-sm-2 control-label">Server Name</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-info" aria-hidden="true"></i></span>
									<form:input class="form-control" path="serverName" type="text" />
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="email" class="cols-sm-2 control-label">Hardware Type</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-info" aria-hidden="true"></i></span>
									<form:input class="form-control" path="hardwareType" type="text" />
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="username" class="cols-sm-2 control-label">Application</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-info" aria-hidden="true"></i></span>
									<form:input class="form-control" path="application" type="text" />
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="password" class="cols-sm-2 control-label">Green IP</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-info" aria-hidden="true"></i></span>
									<form:input class="form-control" path="greenIp" type="text" />
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="confirm" class="cols-sm-2 control-label">Grey IP</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-info" aria-hidden="true"></i></span>
									<form:input class="form-control" path="greyIp" type="text" />
								</div>
							</div>
						</div>
						
							<div class="form-group">
							<label for="password" class="cols-sm-2 control-label">ILO IP</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-info" aria-hidden="true"></i></span>
									<form:input class="form-control" path="iloIp" type="text" />
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="confirm" class="cols-sm-2 control-label">Data Center</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-info" aria-hidden="true"></i></span>
									<form:input class="form-control" path="datacenter" type="text" />
								</div>
							</div>
						</div>
						
						<div class="form-group">
							<label for="confirm" class="cols-sm-2 control-label">OS</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-info" aria-hidden="true"></i></span>
									<form:input class="form-control" path="os" type="text" />
								</div>
							</div>
						</div>
						
						<div class="form-group">
							<label for="confirm" class="cols-sm-2 control-label">IDD File </label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-upload" aria-hidden="true"></i></span>
									<input class="form-control" name="iddfile" type="file" />
									<c:if test="${not empty server.content}">
										<a href="${contextPath}/file/download/${server.id}" style="color:white;">${server.fileName}</a>
									</c:if>
								</div>
							</div>
						</div>
						
						
						<div class="form-group ">
							<form:button class="btn btn-primary btn-lg btn-block login-button">Update</form:button>
						</div>
						
					</form:form>
				</div>
			</div>
		</div>
	</body>
</html>