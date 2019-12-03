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
<title>Page Ajout Catégorie</title>
</head>
<body>
	<%@ include file="template/header.html"%>
	<h1 style=" text-align: center;">Formulaire d'ajout
		Catégorie</h1>

	<form class="form-horizontal" method="post" action="ajoutC">

		<div class="form-group">
			<label for="idNom" class="col-sm-4 control-label">Nom</label>
			<div class="col-sm-5">
				<input type="text" class="form-control" id="idNom" placeholder="Nom"
					name="pNom">
			</div>
		</div>

		<div class="form-group">
			<label for="idPhoto" class="col-sm-4 control-label">Photo</label>
			<div class="col-sm-5">
				<input type="text" class="form-control" id="idPhoto"
					placeholder="Photo" name="pPhoto">
			</div>
		</div>

		<div class="form-group">
			<label for="idDescription" class="col-sm-4 control-label">Description</label>
			<div class="col-sm-5">
				<input type="text" class="form-control" id="idDescription"
					placeholder="Description" name="pDescription" required>
			</div>
		</div>

		<div class="form-group">
			<div class="col-sm-offset-4 col-sm-10">
				<button type="submit" class="btn btn-info">Ajouter
					Catégorie</button>
			</div>
		</div>
	</form>


</body>
</html>