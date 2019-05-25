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
<title>Mostrar Datos</title>
</head>
<body>
<div class="container">
	<h1 style="text-align:center">Usuarios con nombres que empiezan con "J"</h1>
	
	<hr>

	<h3 style="text-align:center">${mensaje}</h3>
	
	<c:forEach items="${usuarioBuscado}" var="var">
	<h3 >Nombre: ${var.nombre}</h3>
	<h3 >ID: ${var.id}</h3>
	<hr>
	</c:forEach>
	
</div>
</body>
</html>