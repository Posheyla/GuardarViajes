<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
	<body>
		<header>
			<div class="navbar navbar-dark bg-dark box-shadow">
				<div class="container d-flex justify-content-between">
					<a class="btn btn-secondary " href="/gastos">Volver</a>
				</div>
			</div>
		</header>
		<main role="main">
			<div class="container mt-4 p-3">
				<h1>Editar</h1>
				<form:form method="POST" action ="/gastos/${gasto.getId()}" modelAttribute="gasto">
				<input type="hidden" name="_method" value="put">
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
						Actualizar
					</button>
				</form:form>
			</div>
		</main>
		<script src="/webjars/jquery/jquery.min.js"></script>
		<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	</body>
</html>