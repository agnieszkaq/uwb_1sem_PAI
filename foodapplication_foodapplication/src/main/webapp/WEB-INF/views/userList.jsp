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
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<nav class="navbar navbar-dark bg-dark">
		<a class="navbar-brand" href="#">LISTA UŻYTKOWNIKÓW: </a>
		<button onclick="window.location.href = '/user/add'"
			class="btn btn-dark">Dodaj nowego użytkownika</button>
	</nav>
	<div class="container">
		</br>
		<table class="table table-striped table-bordered" id="datatable_user">
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