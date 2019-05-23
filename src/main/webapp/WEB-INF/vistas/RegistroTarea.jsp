<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<!-- Bootstrap core CSS -->
	    <link href="css/bootstrap.min.css" rel="stylesheet" >
	    <!-- Bootstrap theme -->
	    <link href="css/bootstrap-theme.min.css" rel="stylesheet">
<title>Registro persona - Tarea</title>
</head>
<body>
<div class="container">
	<h1 style="text-align:center">Registrar Usuario</h1>
		<div id="login-box" class="mainbox col-md-6 col-md-offset-3">
			<form:form action="validarRegistro" method="POST" modelAttribute="usuario">	
				<label>Ingrese E-mail:</label>
				<form:input path="email" id="email" type="email" class="form-control" />
				<hr>
				<label>Ingrese contraseña: </label>
				<form:input path="password" id="password" type="password" class="form-control" />
				<hr>
				<label>Seleccione rol: </label>
				<form:select path="rol" id="rol" class="form-control">
					<form:option value="Usuario normal">Usuario normal</form:option>
					<form:option value="Usuario premium">Usuario premium</form:option>
					<form:option value="Usuario administrador">Usuario administrador</form:option>
	    		</form:select>
	    		<hr>
	    		<button type="submit" class="form-control">Registrar</button>
	    		<button type="reset" class="form-control">Reiniciar</button>
			</form:form>
		</div>
</div>		
<div class="footer" style="text-align:center; padding:15px">Taller Web I - Delgado, Karlen, Aguayo</div>
</body>
</html>