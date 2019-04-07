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
		<h1 class="title">RPT - Add a New LAB Server</h1>
		<c:if test="${pageContext.request.userPrincipal.name != null}">
        <form id="logoutForm" method="POST" action="${contextPath}/logout">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>
      <h5 class="title">Welcome ${pageContext.request.userPrincipal.name} | <a onclick="document.forms['logoutForm'].submit()" style="color:red">Logout</a></h5>
    </c:if>
		<br>
	</div>
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
				<h2 style="text-align:center;">Server Details</h2>
					<form:form id="serverForm" modelAttribute="server" action="addserver" method="post" enctype="multipart/form-data">
						
						<div class="form-group">
							<label for="name" class="cols-sm-2 control-label">Server Name</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-info" aria-hidden="true"></i></span>
									<input type="text" class="form-control" name="serverName" id="serverName"  placeholder="Enter Server Name"/>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="email" class="cols-sm-2 control-label">Hardware Type</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-info" aria-hidden="true"></i></span>
									<input type="text" class="form-control" name="hardwareType" id="hardwareType"  placeholder="Enter Hardware Type"/>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="username" class="cols-sm-2 control-label">Application</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-info" aria-hidden="true"></i></span>
									<input type="text" class="form-control" name="application" id="application"  placeholder="Enter Application"/>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="password" class="cols-sm-2 control-label">Green IP</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-info" aria-hidden="true"></i></span>
									<input type="text" class="form-control" name="greenIp" id="greenIp"  placeholder="Enter Green IP"/>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="confirm" class="cols-sm-2 control-label">Grey IP</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-info" aria-hidden="true"></i></span>
									<input type="text" class="form-control" name="greyIp" id="greyIp"  placeholder="Enter Grey IP"/>
								</div>
							</div>
						</div>
						
							<div class="form-group">
							<label for="password" class="cols-sm-2 control-label">ILO IP</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-info" aria-hidden="true"></i></span>
									<input type="text" class="form-control" name="iloIp" id="iloIp"  placeholder="Enter ILO IP"/>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="confirm" class="cols-sm-2 control-label">Data Center</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-info" aria-hidden="true"></i></span>
									<input type="text" class="form-control" name="datacenter" id="datacenter"  placeholder="Enter Data Center"/>
								</div>
							</div>
						</div>
						
						<div class="form-group">
							<label for="confirm" class="cols-sm-2 control-label">OS</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-info" aria-hidden="true"></i></span>
									<input type="text" class="form-control" name="os" id="os"  placeholder="Enter Operating System"/>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="confirm" class="cols-sm-2 control-label">IDD File</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-upload" aria-hidden="true"></i></span>
									<input type="file" class="form-control" name="iddfile" id="iddfile"  placeholder="Enter Password"/>
								</div>
							</div>
						</div>
						<div class="form-group ">
							<form:button class="btn btn-primary btn-lg btn-block login-button">Add Server</form:button>
						</div>
						
					</form:form>
				</div>
			</div>
		</div>
	</body>
</html>