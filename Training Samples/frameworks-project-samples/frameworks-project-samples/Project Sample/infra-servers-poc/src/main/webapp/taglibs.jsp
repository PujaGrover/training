<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<link rel="shortcut icon" href="${contextPath}/resources/images/favicon.png" type="image/x-icon">
<link rel="stylesheet" type="text/css" href="${contextPath}/resources/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="${contextPath}/resources/css/buttons.dataTables.min.css">
<link rel="stylesheet" type="text/css" href="${contextPath}/resources/css/common.css">
<link rel="stylesheet" type="text/css" href="${contextPath}/resources/css/jquery.dataTables.min.css">
<link rel="stylesheet" type="text/css" href="${contextPath}/resources/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="${contextPath}/resources/css/oxygen.css">
<link rel="stylesheet" type="text/css" href="${contextPath}/resources/css/passion_one.css">

<script src="${contextPath}/resources/js/jquery-1.12.4.js"></script>
<script src="${contextPath}/resources/js/jquery.dataTables.min.js"></script>
<script src="${contextPath}/resources/js/dataTables.buttons.min.js"></script>
<script src="${contextPath}/resources/js/buttons.flash.min.js"></script>
<script src="${contextPath}/resources/js/jszip.min.js"></script>
<script src="${contextPath}/resources/js/pdfmake.min.js"></script>
<script src="${contextPath}/resources/js/vfs_fonts.js"></script>
<script src="${contextPath}/resources/js/buttons.html5.min.js"></script>
<script src="${contextPath}/resources/js/buttons.print.min.js"></script>
<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
<script src="${contextPath}/resources/js/buttons.colVis.min.js"></script>
