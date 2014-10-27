<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html >
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<!-- 	mobile -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	
	<title><tiles:getAsString name="title" /></title>

	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="/redist/bootstrap-3.2.0-dist/css/bootstrap.min.css">
	<!-- Optional theme -->
	<link rel="stylesheet" 	href="/redist/bootstrap-3.2.0-dist/css/bootstrap-theme.min.css">
	<script src="/redist/jquery/2.1.1/jquery-2.1.1.js"></script>
	<!-- Latest compiled and minified JavaScript -->
	<script src="/redist/bootstrap-3.2.0-dist/js/bootstrap.min.js"></script>


</head>
<body>
	<!-- 	cabecera -->
	<div  class="page-header container center">
	<h3 class="text-center"><span class="label label-success"><tiles:getAsString name="title" /></span></h3>
	</div>


	<tiles:insertAttribute name="body" />
	<br>
	<br>    
	
	
	 
		<tiles:insertAttribute name="footer" />
</body>
</html>