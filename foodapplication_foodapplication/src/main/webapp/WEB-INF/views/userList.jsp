<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pl">
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/v/bs4/dt-1.10.20/datatables.min.css" />
<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css"
	rel="stylesheet">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!----------------------------------------------------------------- NAV START ----------------------------------------------------------->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<a class="navbar-brand" href="#"> <i class="fa fa-list"
			style="color: white"></i> LISTA UŻYTKOWNIKÓW
		</a>
		
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href="/">Główna
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="/recipe/list">Przepisy</a></li>
				<li class="nav-item"><a class="nav-link" href="/forum/topic">Forum</a></li>
				<li class="nav-item"><a class="nav-link"
					href="/ingredient/list">Kaloryczność</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> Kalkulatory </a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="/calculator/bmi">BMI</a>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item" href="/calculator/ppm">Podstawowa
							przemiana materii</a>
					</div></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"><i class="fa fa-user"
						style="color: white"></i> Profil </a>
					<div class="dropdown-menu dropdown-menu-right"
						aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="/sign">Logowanie</a>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item" href="/user/add">Rejestracja</a>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item" href="/user/list">Lista użytkowników</a>
					</div></li>
			</ul>
		</div>
	</nav>
	
	
	<!----------------------------------------------------------------- NAV END ----------------------------------------------------------->
	
	
	<div class="container">
		</br>
		<table class="table table-striped table-bordered" id="datatable_user">
			<button onclick="window.location.href = '/user/add'"
				class="btn btn-dark pull-right">
				<i class="fa fa-plus" style="color: white"></i> Dodaj nowego
				użytkownika
			</button>
			<thead>
				<tr class="thead-dark">
					<th>Nazwa :</th>
					<th>email:</th>
					<th>hasło:</th>
					<th>EDYTUJ | USUŃ</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="e">
					<tr>
						<td>${e.username}</td>
						<td>${e.password}</td>
						<td>${e.email}</td>
						<td><a class="btn btn-success" href="/user/edit/${e.id}">Edytuj</a>
							<a class="btn  btn-danger" href="/user/delete/${e.id}">Usuń</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>


	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
	<script
		src="https://cdn.datatables.net/v/bs4/dt-1.10.20/datatables.min.js"></script>
	<script>
		$(document)
				.ready(
						function() {
							$("#datatable_user")
									.DataTable(
											{
												"language" : {
													"url" : "//cdn.datatables.net/plug-ins/9dcbecd42ad/i18n/Polish.json"
												}
											});
						})
	</script>
</body>
</html>