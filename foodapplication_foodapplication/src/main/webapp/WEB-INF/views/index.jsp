<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="pl">
<head>
<link
	href="https://unpkg.com/bootstrap@4.1.1/dist/css/bootstrap.min.css"
	rel="stylesheet" />
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<nav class="navbar navbar-dark bg-dark">
		<a class="navbar-brand" href="#">LOGOWANIE: </a>
	</nav>
	</br>
	<div class="container">
	<form>
		<div class="card">
			<div class="card-header">Zaloguj się:</div>
			<div class="card-body">
				<div class="form-group">					
				<input type="text" name="username" class="form-control" placeholder="Wpisz nazwę użytkownika:"> </br> 
			</div>
			<div class="form-group">
				<input type="text"
					name="password" class="form-control" placeholder="Wpisz hasło użytkownika:"> </br>
					</div>
			</div>
			<div class="card-footer">
			<button type="submit" class="btn btn-dark btn-block">Loguj się</button>
			</div>
		</div>
	</form>
	</div>
</body>
</html>