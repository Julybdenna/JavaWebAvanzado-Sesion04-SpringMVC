<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring MVC Form Handling</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>
	<div class="container">
		<h2>Informaci&oacute;n de Registro de Grupo</h2>
		<table>
			<tr>
				<td>Codigo</td>
				<td>${codigo}</td>
			</tr>
			<tr>
				<td>Nombre</td>
				<td>${nombre}</td>
			</tr>
			<tr>
				<td>Descripcii&oacute;n</td>
				<td>${descripcion}</td>
			</tr>
		</table>
	</div>



</body>
</html>