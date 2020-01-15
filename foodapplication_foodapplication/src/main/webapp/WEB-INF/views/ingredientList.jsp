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
		<a class="navbar-brand" href="#">WARTOŚĆ KALORYCZNA: </a>
	</nav>
	<div class="container">
		</br>
		<table class="table table-striped table-bordered"
			id="datatable_ingredient">
			<thead>
				<tr class="thead-dark">
					<th>Nazwa:</th>
					<th>Kalorie:</th>
					<th>Białko:</th>
					<th>Tłuszcz:</th>
					<th>Węglowodany:</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${ingredient}" var="e">
					<tr>
						<td>${e.name}</td>
						<td>${e.calories}</td>
						<td>${e.protein}</td>
						<td>${e.fat}</td>
						<td>${e.carb}</td>
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
							$("#datatable_ingredient")
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