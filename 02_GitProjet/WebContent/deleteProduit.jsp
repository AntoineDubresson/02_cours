<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="<c:url value='/ressources/js/jquery-3.4.1.js'/>"></script>
<script src="<c:url value='/ressources/js/bootstrap.min.js'/>"></script>
<link rel="stylesheet" href="ressources/css/bootstrap.min.css" />
<title>Page d'accueil</title>
</head>
<body>
	<%@ include file="template/header.html"%>

	<div class="container">
		<form class="form-horizontal" method="post" action="delProduit">
			<h1>Supprimer un produit</h1>
			<div class="form-group">
				<label for="idId" class="col-md-2 control-label">Id du
					produit : </label>
				<div class="col-md-5">
					<input type="number" class="form-control" id="idId"
						placeholder="Id" name="pId" requi>
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-info">Asta la Vista !</button>
				</div>
			</div>
		</form>
	</div>
</body>
</html>