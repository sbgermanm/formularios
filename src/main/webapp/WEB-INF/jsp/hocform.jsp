<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../layout/taglib.jsp"%>


<!-- http://www.mkyong.com/spring-mvc/spring-mvc-dropdown-box-example/ -->

<form:form commandName="hoc" class="form-horizontal formulario_hoc" role="form">
	<c:if test="${param.success eq true}">
		<div class="alert alert-success">Registration successfull!</div>
	</c:if>
	<div class="form-group">
		<label for="nombrenino" class="col-sm-2 control-label">Nombre
			niño</label>
		<div class="col-sm-10">
			<form:input path="nombreNino" class="form-control" />
			<form:errors path="nombreNino" />
		</div>
	</div>

	<div class="form-group">
		<label for="edadnino" class="col-sm-2 control-label">Edad niño</label>
		<div class="col-sm-10">
			<form:input path="edad" class="form-control" />
			<form:errors path="edad" />
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
		<label for="nombrepapa" class="col-sm-2 control-label">Nombre
			papa</label>
		<div class="col-sm-10">
			<form:input path="nombrePadre" class="form-control" />
		<form:errors path="nombrePadre" />
		</div>
	</div>



	<div class="form-group">
		<label for="portatil" class="col-sm-2 control-label">Portatil</label>
		<div class="col-sm-10">
			<label class="radio-inline"> <form:radiobutton
					path="portatil" value="true" /> Si
			</label> <label class="radio-inline"> <form:radiobutton
					path="portatil" value="false" /> No
			</label>
			<form:errors path="portatil" />
		</div>
	</div>


	<div class="form-group">
		<label for="email" class="col-sm-2 control-label">Email</label>
		<div class="col-sm-10">
			<form:input path="email" cssClass="form-control" />
		<form:errors path="email" />
		</div>

	</div>

	<div class="form-group">
		<label for="telefono" class="col-sm-2 control-label">Teléfono</label>
		<div class="col-sm-10">
			<form:input path="telefono" cssClass="form-control" />
		<form:errors path="telefono" />
		</div>
	</div>




	<div class="form-group">
		<div class="col-sm-offset-2 col-sm-10">
			<button type="submit" class="btn btn-default">Inscribeme</button>
		</div>
	</div>
</form:form>

<script type="text/javascript">
$(document).ready(function() {
	
	$(".formulario_hoc").validate(
		{
			rules: {
				nombreNino: {
					required : true,
					minlength : 2
				},
				nombrePadre: {
					required : true,
					minlength : 2
				},
				edad: {
					required : true,
					digits: true,
					range: [0, 99]
				},
				portatil: {
					required : true
				},
				telefono: {
					required : true,
					digits: true,
					minlength : 9,
					maxlength : 13
				},
				email: {
					required : true,
					email: true
				}
			},
			highlight: function(element) {
				$(element).closest('.form-group').removeClass('has-success').addClass('has-error');
			},
			unhighlight: function(element) {
				$(element).closest('.form-group').removeClass('has-error').addClass('has-success');
			},
			messages: {
				nombreNino: {
					required: "Debe meter un nombre",
					minlength: "El nombre debe tener 2 caracteres al menos"
				}, 
				nombrePadre: {
					required: "Debe meter un nombre",
					minlength: "El nombre debe tener 2 caracteres al menos"
				}, 
				edad: {
					required: "Debe poner una edad",
					digits: "Solo pueden ser digitos",
					range: "Solo admitimos niños con menos de 100 años"
				}
			}
		}
	);
});
</script>