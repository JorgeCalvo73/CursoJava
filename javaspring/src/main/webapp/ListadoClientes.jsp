<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Clientes</title>

<link rel="stylesheet" href="../recursos/css/bootstrap.min.css">
</head>
<body>

	<div class="text-center pager-header">
		<h2 class="mt-4 mb-4">Aplicación de gestión de Clientes 3000</h2>
	</div>

	<div class="navbar navbar-expand-sm bg-dark navbar-dark">

		<ul class="navbar-nav">
			<li class="nav-item active"><a class="nav-link" href="#">Clientes</a></li>
			<li class="nav-item"><a class="nav-link" href="#">Facturas</a></li>
			<li class="nav-item"><a class="nav-link" href="#">Empleados</a></li>
			<li class="nav-item"><a class="nav-link" href="#">Salir</a></li>
		</ul>
	</div>
	
	<div class="row">
		<div class="col-sm-12 offset-sm-0 col-md-8 offset-md-2">


			<table class="table table-hover table-striped">

				<thead>
					<tr>
						<th>Nombre</th>
						<th>Dirección</th>
						<th>Teléfono</th>
						<th>Correo E.</th>
						<th>Activo</th>


					</tr>

				</thead>

			</table>
		</div>
	</div>

	<div class="text-center mt-4 mb-4">
	
		<form method="get" action="formularioClientes">
			<input type="submit" class= "btn btn-primary" value= "Nuevo"/>
		</form>
	
	</div>




</body>
</html>