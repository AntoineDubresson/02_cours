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
<title>Ajout Produit</title>
</head>
<body>
	<%@ include file="template/header.html"%>

	<div class="container">
		<h1 style="color: red; text-align: center">Formulaire d'ajout</h1>

		<form class="form-horizontal" method="post" action="addProduit">
			<div class="form-group">
				<label for="idDesignation" class="col-md-2 control-label">Designation</label>
				<div class="col-md-5">
					<input type="text" class="form-control" id="idNom"
						placeholder="Designation" name="pDesignation">
				</div>
			</div>
			<div class="form-group">
				<label for="idDescription" class="col-md-2 control-label">Description</label>
				<div class="col-md-5">
					<input type="text" class="form-control" id="idDescription"
						placeholder="Description" name="pDescription">
				</div>
			</div>
			<div class="form-group">
				<label for="idPrix" class="col-md-2 control-label">Prix</label>
				<div class="col-md-5">
					<input type="number" step="0.01" class="form-control" id="idPrix"
						placeholder="Prix" name="pPrix" required>
				</div>
			</div>
			<div class="form-group">
				<label for="idQuantite" class="col-md-2 control-label">Quantité</label>
				<div class="col-md-5">
					<input type="number" class="form-control" id="idQuantite"
						placeholder="Quantite" name="pQuantite" required>
				</div>
			</div>
			<div class="form-group">
				<label for="idSelectionne" class="col-md-2 control-label">Selectionne</label>
				<div class="col-md-5">
					<input type="checkbox" class="form-control" id="idSelectionne"
						 name="pSelectionne" >
				</div>
			</div>
			<div class="form-group">
				<label for="idPhoto" class="col-md-2 control-label">Photo</label>
				<div class="col-md-5">
					<input type="text" class="form-control" id="idPhoto"
						placeholder="/img..." name="pPhoto" required>
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-info">Ajouter</button>
				</div>
			</div>
		</form>
	</div>

</body>
</html>