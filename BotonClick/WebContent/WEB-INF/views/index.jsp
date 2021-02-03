<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Button Click</title>
<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script> -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container text-center">
		<div class="row" Style="height: 200px">
			<br>
		</div>
		<div class="row justify-content-center align-items-center">
			<div class="col-sm-6 offset-sm-3">
				<form action="" method="GET">
					<input type="hidden" name="click" value="1">
					<button class="btn btn-danger" type="submit" value="submit">Click
						Me!!</button>
				</form>

				<h1>
					You have click
					<c:out value="${contador}" />
					Times
				</h1>
			</div>
		</div>
	</div>

	<form action="" method="GET">
		<input type="hidden" name="reset" value="reset">
		<button class="btn btn-danger" type="submit" value="submit">Reset</button>
	</form>
</body>
</html>