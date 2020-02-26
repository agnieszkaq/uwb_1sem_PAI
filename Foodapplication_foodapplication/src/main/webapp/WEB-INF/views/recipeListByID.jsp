<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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

				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> Przepisy </a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="/recipe/list">Lista przepisów</a>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item" href="/recipe/add">Dodaj przepis</a>
					</div></li>

				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> Forum </a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="/forum/note">Posty</a>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item" href="/forum/add">Dodaj post</a>
					</div></li>

				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> Kalorycznosc </a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="/ingredient/category">Katogorie</a>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item" href="/ingredient/list">Wszystkie
							składniki</a>
					</div></li>

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
			<div class="col-sm-9">
				<div class="row">
					<div class="col-xs-8 col-sm-6">
						<img src="../../img/recipe/${recipe.id}.jpeg"
							class="card-img-top img-fluid rounded">
					</div>
					<div class="col-xs-2 col-sm-5">
						<h4>Przepis:</h4>
						<p class="card-text">${recipe.description}</p>
					</div>
					<div class="col-xs-1 col-sm-1 ">
						<a style="color: #fddddd;" id="heart"><i
							class="fas fa-heart fa-4x"></i></a>
					</div>
				</div>
			</div>
		</div>

		</br>

		<table
			class="table  table-striped table-bordered table-condensed tasks-table">
			<thead>
				<tr class="thead-dark">
					<th>Nazwa:</th>
					<th>Waga:</th>
					<th>Białko:</th>
					<th>Tłuszcz:</th>
					<th>Węglowodany:</th>
					<th>Kalorie:</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${weight}" var="e">
					<tr>
						<td>${e.ingredient.name}</td>
						<td>${e.weight}</td>
						<td>${e.ingredient.protein}</td>
						<td>${e.ingredient.fat}</td>
						<td>${e.ingredient.carb}</td>
						<td>${e.ingredient.calories*e.weight/100}</td>
					</tr>
				</c:forEach>
			</tbody>
			<thead>
				<tr class="thead-dark ">
					<th>SUMA:</th>
					<th></th>
					<th>${sumProtein}</th>
					<th>${sumFat}</th>
					<th>${sumCarb}</th>
					<th>${sumCalories}</th>
				</tr>
			</thead>
		</table>

		<c:if test="${not empty comment}">
			<h3>Komentarze:</h3>
		</c:if>

		<c:forEach items="${comment}" var="e">
			<tr>
				</br>
				<div class="card">
					<div class="card-header text-light bg-dark">${e.date}</div>
					<div class="card-body  bg-light">
						<blockquote class="blockquote mb-0">
							<p>
								<i class="far fa-comments"></i> ${e.text}
							</p>
							<footer class="blockquote-footer">
								<cite title="Source Title">${e.user.username}</cite>
							</footer>
						</blockquote>
					</div>
				</div>
			</tr>
		</c:forEach>

		</br>
		<form:form  method="post"
			action="${pageContext.request.contextPath}/recipe_comment/text">
			<div class="card">
				<div class="card-header text-light bg-success">Dodaj
					komentarz:</div>
				<div class="card-body  bg-light">
					</br> <input name="text"  class="form-control" placeholder="Komentarz..." /> </br>
					<button type="submit" class="btn btn-dark btn-block">Dodaj
						komentarz</button>
				</div>
			</div>
		</form:form>
	</div>



	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
	<script
		src="https://cdn.datatables.net/v/bs4/dt-1.10.20/datatables.min.js"></script>
	<script>
		clicked = true;
		$(document).ready(function() {
			$("#heart").click(function() {
				if (clicked) {
					$(this).css('color', '#ff9393');
					clicked = false;
				} else {
					$(this).css('color', '#fddddd');
					clicked = true;
				}
			});
		});

		var sumCal = 0;
		var sumProtein = 0;
		var sumCarb = 0;
		var sumFat = 0;

		var sum = 40;
	</script>
</body>
</html>
