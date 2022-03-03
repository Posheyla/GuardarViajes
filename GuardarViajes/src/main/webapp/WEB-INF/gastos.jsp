<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Gastos</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
		<link rel="stylesheet" href="/css/index.css" />
		
	</head>
	<body>
		<div class="container">
			<h1>Lista de gastos</h1>
		</div>
		<table class="table table-sm">
			<tr class="table-info">
				<th>Nombre</th>
				<th>Tienda</th>
				<th>Precio</th>
				<th>Descripcion</th>
			</tr>
			<c:forEach var="gasto" items="${listaGastos}">
				<tr>
					<td><c:out value="${gasto.getNombre()}"/></td>
					<td><c:out value="${gasto.getTienda()}"/></td>
					<td><c:out value="${gasto.getMonto()}"/></td>
					<td><c:out value="${gasto.getDescripcion()}"/></td>
				</tr>
			</c:forEach>
		</table>
		<form method="GET" action="/gastos/agregar">
			<div>
				<button class="btn btn-primary" type="submit">
					Nuevo gasto
				</button>
			</div>
		</form>
	</body>
</html>