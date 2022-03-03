<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Seleccionar libro</title>
		
	</head>
	
	<body>
		<header>
			<div class="navbar navbar-dark bg-dark box-shadow">
				<div class="container d-flex justify-content-between">
					<a class="btn btn-secondary " href="/gastos">Volver</a>
				</div>
			</div>
		</header>
		<h1>Nombre: <c:out value="${gasto.getNombre() }"/></h1>
		<h3>Tienda: <c:out value="${gasto.getTienda()}"/></h3>
		<h3>Precio: <c:out value="${gasto.getMonto()}"/></h3>
	    <h3>Descripción: <c:out value="${gasto.getDescripcion()}"/></h3>

	</body>
</html>