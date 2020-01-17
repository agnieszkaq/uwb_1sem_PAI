<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
		<div class="form-group">
			<form:form modelAttribute="login">
				<div class="card">
					<div class="card-header">Zaloguj się:</div>
					<div class="card-body">

						<form:input type="text" path="username" class="form-control"
							placeholder="Wpisz nazwę użytkownika:" />
						</br>

						<form:input type="text" path="password" class="form-control"
							placeholder="Wpisz hasło użytkownika:" />


					</div>
					<div class="card-footer">
						<button type="submit" class="btn btn-dark btn-block">Loguj
							się</button>
					</div>
				</div>
			</form:form>
			<div class="form-group"></div>
</body>
</html>