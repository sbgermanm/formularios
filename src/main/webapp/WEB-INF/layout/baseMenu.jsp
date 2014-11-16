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
<link rel="stylesheet"
	href="/redist/bootstrap-3.2.0-dist/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet"
	href="/redist/bootstrap-3.2.0-dist/css/bootstrap-theme.min.css">

<script src="/redist/jquery/2.1.1/jquery-2.1.1.js"></script>

<!-- Latest compiled and minified JavaScript -->
<script src="/redist/bootstrap-3.2.0-dist/js/bootstrap.min.js"></script>




</head>
<body>

	<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
	<!-- Controlar el menu activo -->
	<%@ taglib uri="http://tiles.apache.org/tags-tiles-extras"
		prefix="tilesx"%>
	<tilesx:useAttribute name="current" />

	<div class="container">

		<!-- Static navbar -->
		<div class="navbar navbar-default" role="navigation">
			<div class="container-fluid">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse"
						data-target=".navbar-collapse">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="<spring:url value="/" />">JBA</a>
				</div>
				<div class="navbar-collapse collapse">
					<ul class="nav navbar-nav">

						<security:authorize access="hasRole('ROLE_ADMIN')">
							<li class="${current == 'resumen' ? 'active' : ''}"><a
								href='<spring:url value="/resumen.html" />'>Resumen</a></li>
						</security:authorize>


						<security:authorize access="hasRole('ROLE_ADMIN')">
							<li class="${current == 'prog' ? 'active' : ''}"><a
								href="<spring:url value="/taller_programacion.html" />">Taller programacion</a></li>
						</security:authorize>


					</ul>
				</div>
				<!--/.nav-collapse -->
			</div>
			<!--/.container-fluid -->
		</div>
		<!-- /.navbar -->

		<!-- 	cabecera -->
		<div class="page-header container center">
			<h3 class="text-center">
				<span class="label label-success"><tiles:getAsString
						name="title" /></span>
			</h3>
		</div>

		<tiles:insertAttribute name="body" />
		<br> <br>    




		<tiles:insertAttribute name="footer" />
	</div>
</body>
</html>