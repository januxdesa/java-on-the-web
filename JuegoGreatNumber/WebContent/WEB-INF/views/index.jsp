<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Game Great Number</title>
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

<!-- <c:out value="${ numeroOculto} "/> -->

		<div class="row text-center">
			<div class="col-sm-12">

				<h1> Welcome to the Great Number Game!  </h1>
				<br>
				<p>I am thinking of a number between 1 and 100</p>
				<p>Take a guess!</p>
				<p>You have <c:out value="${intentos}" /> tries</p>

				<div class="row ">
					<br>
				</div>


				<div class="row text-center "  style="height: 200px;">


					<c:if test="${ msg!='' }">
						<div class="col-sm-4 offset-sm-4 border rounded text-white bg-danger " >
								<br>
								<br>
								<h1 class=" align-middle "><c:out value="${msg}" /></h1> 
							
						</div>
					</c:if>



				</div>
				<br>
				<br>
				
				<div class="row">
					<div class="col-sm-4 offset-sm-4">
						<form action="home" method="POST">
							<c:if test="${ mostrarReset != 'true' }">
								<div class="form-group">
									<input type="number" name="numero" value="">
								</div>
								<div class="form-group">
									<button type="submit" class="btn btn-primary" value="submit">Submit</button>
								</div>
							</c:if>

							<c:if test="${ mostrarReset == 'true' }">
								<div class="form-group">
									<button type="submit" class="btn btn-primary" value="reset">Play Again!!!</button>
								</div>
							</c:if>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>