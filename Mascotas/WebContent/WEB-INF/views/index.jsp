<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%> 
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script> -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css">


<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div  class="row">	</div>
		<div class="row">
		
			<div class="col-sm-6">
				<form  action="dogs" method="GET">
					<fieldset class="border">
						<legend> DOG </legend>
						<div class="form-group">
							<label for=" name ">Name:</label> <input type="text" id="name" name="name">
						</div>
						<div class="form-group">
							<label for="breed">Breed:</label> <input type="text" id="breed" name="breed">
						</div>
						<div class="form-group">
							<label for="weight">Weight:</label> <input type="text" id="weight" name="weight">
						</div>
						<div>
							<input type="submit" class="btn btn-primary" id="enviar">
						</div>

					</fieldset>
				</form>
			</div>
			<div class="col-sm-6">
				<form action="cats" method="GET">
					<fieldset class="border">
						<legend> CAT </legend>
						<div class="form-group">
							<label for=" name ">Name:</label> <input type="text" id="name" name="name">
						</div>
						<div class="form-group">
							<label for="breed">Breed:</label> <input type="text" id="breed" name="breed">
						</div>
						<div class="form-group">
							<label for="weight">Weight:</label> <input type="text" id="weight" name="weight">
						</div>
						<div>
							<input type="submit" class="btn btn-primary" id="enviar">
						</div>

					</fieldset>
				</form>
			</div>
		</div>
	</div>


</body>
</html>