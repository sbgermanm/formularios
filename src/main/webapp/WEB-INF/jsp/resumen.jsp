<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../layout/taglib.jsp"%>


<table class="table table-bordered table-hover table-striped"><caption><h1>Taller de programacion</h1></caption>
	<thead>
		<tr>
			<th>niño</th>
			<th>edad</th>
			<th>curso</th>
			<th>papa</th>
			<th>portatil</th>
			<th>email</th>
			<th>teléfono</th>
			<th>fechaRegistro</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${apuntadoProg}" var="item">
			<tr>
				<td><c:out value="${item.nombreNino}" /></td>
				<td><c:out value="${item.nombrePadre}" /></td>
				<td><c:out value="${item.portatil}" /></td>
				<td><c:out value="${item.edad}" /></td>
				<td><c:out value="${item.email}" /></td>
				<td><c:out value="${item.telefono}" /></td>
				<td><c:out value="${item.curso}" /></td>
				<td><c:out value="${item.fechaRegistro}" /></td>
			</tr>
		</c:forEach>
	</tbody>
</table>