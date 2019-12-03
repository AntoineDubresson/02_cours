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
<title>Page Supprimer Catégorie</title>
</head>
<body>
	<%@ include file="template/header.html"%>
	<h1 style="text-align: center;">Formulaire de supprimer Catégorie</h1>

	<form class="form-horizontal" method="post" action="suppC">

		<div class="form-group">
			<label for="idId" class="col-sm-4 control-label">ID *</label>
			<div class="col-sm-5">
				<input type="number" class="form-control" id="idId" placeholder="Id"
					name="pId" required>
			</div>
		</div>



		<div class="form-group">
			<div class="col-sm-offset-4 col-sm-10">
				<button type="submit" class="btn btn-info">Supprimer
					Catégorie</button>
			</div>
		</div>

		</div>
	</form>


</body>
</html>