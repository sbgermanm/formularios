<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../layout/taglib.jsp"%>


<!-- http://www.mkyong.com/spring-mvc/spring-mvc-dropdown-box-example/ -->

<form:form commandName="hoc" class="form-horizontal" role="form">

	<div class="form-group">
		<label for="nombrenino" class="col-sm-2 control-label">Nombre
			niño</label>
		<div class="col-sm-10">
			<form:input path="nombreNino" class="form-control" />
		</div>
	</div>

	<div class="form-group">
		<label for="edadnino" class="col-sm-2 control-label">Edad niño</label>
		<div class="col-sm-10">
			<form:input path="edad" class="form-control" />
		</div>
	</div>

	<div class="form-group">
		<label for="curso" class="col-sm-2 control-label">Curso</label>
		<div class="col-sm-10">
			<form:select path="curso" class="form-control">
				<form:option value="3º primaria" />
				<form:option value="4º primaria" />
				<form:option value="5º primaria" />
				<form:option value="6º primaria" />
			</form:select>
		</div>
	</div>








	<div class="form-group">
		<label for="nombrenino" class="col-sm-2 control-label">Email</label>
		<div class="col-sm-10">
			<input type="email" class="form-control" id="inputEmail3"
				placeholder="Email">
		</div>
	</div>


	<div class="form-group">
		<label for="inputPassword3" class="col-sm-2 control-label">Password</label>
		<div class="col-sm-10">
			<input type="password" class="form-control" id="inputPassword3"
				placeholder="Password">
		</div>
	</div>

	<div class="form-group">
		<div class="col-sm-offset-2 col-sm-10">
			<div class="checkbox">
				<label> <input type="checkbox"> Remember me
				</label>
			</div>
		</div>
	</div>

	<div class="form-group">
		<div class="col-sm-offset-2 col-sm-10">
			<button type="submit" class="btn btn-default">Sign in</button>
		</div>
	</div>
</form:form>