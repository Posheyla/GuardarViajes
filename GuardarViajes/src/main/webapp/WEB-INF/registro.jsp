<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Registro libro</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
		<link rel="stylesheet" type="text/css" href="css/index.css">
	</head>
	<body>
		<main role="main">
			<div class="container mt-4 p-3">
				<h1>Registro</h1>
				<form:form method="POST" action ="/gastos/agregar" modelAttribute="gasto">
					<div class="form-group mb-2">
						<form:label class="form-label" path="nombre" for="nombre">
							Nombre:
						</form:label>
						<form:input class="form-control" path="nombre" type="text" name="nombre" id="nombre" />
						<form:errors path="nombre"/>
					</div>
					
					<div class="form-group mb-2">
						<form:label class="form-label" path="tienda" for="tienda">
							Tienda:
						</form:label>
						<form:input class="form-control" path="tienda" type="text" name="tienda" id="tienda" />
						<form:errors path="tienda"/>
					</div>
					
					<div class="form-group mb-2">
						<form:label class="form-label" path="monto" for="monto">
							Precio:
						</form:label>
						<form:input class="form-control" path="monto" type="text" name="monto" id="monto" />
						<form:errors path="monto"/>
					</div>
					
					<div class="form-group mb-2">
						<form:label class="form-label" path="descripcion" for="descripcion">
							Descripcion:
						</form:label>
						<form:input class="form-control" path="descripcion" type="text" name="descripcion" id="descripcion" />
						<form:errors path="descripcion"/>
					</div>
					
					<button class="btn btn-primary" type="submit">
						Registrar gasto
					</button>
				</form:form>
			</div>
		</main>
		<script src="/webjars/jquery/jquery.min.js"></script>
		<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	</body>
</html>