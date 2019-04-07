<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<jsp:include page="taglibs.jsp"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<script type="text/javascript">
	$(document).ready(function() {
		$('#servers').DataTable({
        dom: 'Bfrtip',
         buttons: [
            {
                extend: 'copyHtml5',
                text:'<i class="fa fa-files-o"></i> Copy',
                exportOptions: {
                    columns: [0,1,2,3,4,5,6,7 ]
                }
            },
            {
                extend: 'excelHtml5',
                text: '<i class="fa fa-file-excel-o"></i> Excel',
                exportOptions: {
                    columns: [0,1,2,3,4,5,6,7 ]
                }
            },
            {
                extend: 'pdfHtml5',
                text: '<i class="fa fa-file-pdf-o"></i> PDF',
                exportOptions: {
                      columns: [0,1,2,3,4,5,6,7 ]
                }
            },
            {
                extend: 'print',
                text: '<i class="fa fa-print"></i> Print',
                exportOptions: {
                      columns: [0,1,2,3,4,5,6,7 ]
                }
            },
            {
                extend: 'colvis',
                text: '<i class="fa fa-caret-square-o-down"></i> Filter Columns'
            }
            
        ]
    });
    
    $("#success-alert").fadeTo(2000, 500).slideUp(500, function(){
               $("#success-alert").slideUp(500);
     });   
    
	});
</script>
<style>
.table-container {
	width: 500px;
}

tr.odd {
	background: #EDE4D4 !important;
}

tr.odd td.sorting_1 {
	background: #EDE4D4 !important;
}

tr.even td.sorting_1 {
	background: #fff !important;
}

table.dataTable tbody th, table.dataTable tbody td {
    padding: 2px 2px 1px 0px;
}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ServersList</title>
</head>
<body>
 <div class="page-header">
 <a href="${contextPath}/">
  <img alt="Brand" src="${contextPath}/resources/images/aalogo.png" style="float: left; height:75px;margin-right: 50px;" /></a><h1 class="title">    RPT - LAB Servers </h1>
  <c:if test="${pageContext.request.userPrincipal.name != null}">
        <form id="logoutForm" method="POST" action="${contextPath}/logout">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>
        <h5 class="title">Welcome ${pageContext.request.userPrincipal.name} | <a onclick="document.forms['logoutForm'].submit()" style="color:red">Logout</a></h5>
    </c:if>
  <br>
</div>
<div class="container">
	<c:if test="${not empty message}">
			<div id="success-alert" class="alert alert-success">
 				 <strong>Success!</strong> ${message}
			</div>
	</c:if>
<table id="servers" class="display cell-border" cellspacing="0" width="100%">
        <thead>
            <tr>
                <th>Server Name</th>
                <th>Hardware</th>
                <th>Application</th>
                <th>GreenIP</th>
                <th>GreyIP</th>
                <th>ILO</th>
                <th>Data Center</th>
                <th>OS</th>
                <th>Upload IDD</th>
                <th>Update</th>
                <th>Delete</th>
            </tr>
        </thead>
        <tbody>
        <c:forEach items="${servers}" var="server">
				<tr>
					<td>${server.serverName}</td>
					<td>${server.hardwareType}</td>
					<td>${server.application}</td>		
					<td>${server.greenIp}</td>
					<td>${server.greyIp}</td>
					<td>${server.iloIp}</td>		
					<td>${server.datacenter}</td>
					<td>${server.os}</td>		
					<td>
					<c:choose>
					<c:when test="${empty server.content}">
					<button class="btn btn-sm btn-primary btn-block" data-toggle="modal" data-target="#largeModal" style="margin-bottom: 1em;margin-top: -3px;display: block;">Upload IDD</button>
					<c:set var="serverid" value="${ server.id}" />
					</c:when>
					<c:otherwise>
					<a href="${contextPath}/file/download/${server.id}"><i class="fa fa-download fa-4" aria-hidden="true"></i></a>
					</c:otherwise>
					</c:choose>
						<!--  Modal Start Here -->
					<div id="largeModal" class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog">
								<div class="modal-dialog modal-lg">
									<div class="modal-content">
										<div class="modal-header">
											<button type="button" class="close" data-dismiss="modal"
												aria-hidden="true">×</button>
											<h4 class="modal-title">Upload Your IDD Doc File</h4>
										</div>
										<form:form action="${contextPath}/file/saveidd/${server.id}"
											method="post" enctype="multipart/form-data">
											<div class="modal-body">
												<div class="form-group">
													<label for="name" class="cols-sm-2 control-label">Please Select Your IDD File :</label>
													<div class="cols-sm-10">
														<div class="input-group">
															<span class="input-group-addon">
																<i class="fa fa-upload" aria-hidden="true"></i>
															</span>
														    <input name="file" type="file" class="form-control" style="width: 30%; float: left;">
														</div>
													</div>
												</div>
											</div>
											<div class="form-group">
												<p>We will upload this file and then you will see download option</p>
											</div>
											<div class="modal-footer">
												<button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
												<button class="btn  btn-success btn-block" type="submit"
													style="width: 25%; float: left;"><i class="fa fa-upload" aria-hidden="true"></i> Upload</button>
											</div>
										</form:form>
									</div>
								</div>
							</div> <!--  Modal End Here -->
					</td>
					<td>
							<form:form action="${contextPath}/file/editserver/${server.id}" method="get">
								<button class="btn btn-sm btn-warning btn-block"  type="submit" ><i class="fa fa-pencil-square-o" aria-hidden="true"></i> Edit</button>
							</form:form>
					</td>		
					<td>
							<form:form action="${contextPath}/file/deleteserver/${server.id}" method="get">
								<button class="btn btn-sm btn-error btn-block"  type="submit" ><i class="fa fa-trash-o" aria-hidden="true"></i> Delete</button>
							</form:form>
					</td>
				</tr>
			</c:forEach>
         </tbody>
    </table>
    </div>
    
    <div class="container">
		<form:form action="${contextPath}/file/addserver" method="get">
		<button class="btn btn-lg btn-warning btn-block"  type="submit"  style="width: 35%;">Add New Server</button>
		</form:form>
	</div>
	
</body>
</html>