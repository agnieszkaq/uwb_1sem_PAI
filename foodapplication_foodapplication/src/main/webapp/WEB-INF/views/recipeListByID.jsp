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
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.7.2/css/all.css"
	integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr"
	crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!----------------------------------------------------------------- NAV START ----------------------------------------------------------->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<a class="navbar-brand" href="#"> <i
			class="fas fa-utensils
			style="color:white"></i> PRZEPIS na
			"${recipe.text}"
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
				<li class="nav-item"><a class="nav-link" href="/forum/note">Forum</a></li>
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
		<div class="row">
			<div class="col-sm-8">

				<div class="card">
					<img src="../../img/recipe/${recipe.id}.jpeg"
						class="card-img-top img-fluid">
					<div class="card-body">
						<h5 class="card-title">Przepis:</h5>
						<p class="card-text">${recipe.description}</p>
					</div>
					<div class="card-footer">
						<p class="card-text">
							<small class="text-muted"> Dodane przez: <span
								class="font-weight-bold">${recipe.user.username}</span></small>
						</p>
					</div>
				</div>

			</div>
			<div class="col-sm-4">
				<div class="card">
					<div class="card-body">
						<h5 class="card-title">Składniki:</h5>
						<p class="card-text">With supporting text below as a natural
							lead-in to additional content.</p>


						<c:forEach items="${weight}" var="e">
							<tr>
								
								<td>${e.weight}</td>
							</tr>
						</c:forEach>
					</div>
				</div>
			</div>
		</div>




	</div>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
	<script
		src="https://cdn.datatables.net/v/bs4/dt-1.10.20/datatables.min.js"></script>
	<script>
		</body>
		</html>
	