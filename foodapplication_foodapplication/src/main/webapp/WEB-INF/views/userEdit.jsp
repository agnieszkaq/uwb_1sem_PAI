<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="pl">
<head>
<link
	href="https://unpkg.com/bootstrap@4.1.1/dist/css/bootstrap.min.css"
	rel="stylesheet" />
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<nav class="navbar navbar-dark bg-dark"> <a class="navbar-brand"
		href="#">EDYTUJ UŻYTKOWNIKA: </a> </nav>
	</br>
	<div class="container">
		<div class="card">
			<div class="card-header">Edycja użytkownika: ${user.username}</div>

			<div class="form-group">
				<form:form action="${pageContext.request.contextPath}/user/update"
					modelAttribute="user">
					<div class="card-body">
						<form:hidden path="username" class="form-control"
							value="${user.username}" />
						<small>Wpisz hasło:</small>
						<form:input path="password" class="form-control"
							placeholder="Wpisz hasło:" />
						<br /> <small>Wpisz email:</small>
						<form:input path="email" class="form-control"
							placeholder="Wpisz email:" />
						<br />

						<form:hidden path="id" />
					</div>
					<div class="card-footer">
						<button type="submit" class="btn btn-dark btn-block">Edytuj</button>
					</div>
				</form:form>

			</div>
		</div>
	</div>
</body>
</html>