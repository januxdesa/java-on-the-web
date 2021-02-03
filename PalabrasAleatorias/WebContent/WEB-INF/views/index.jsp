<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Word Random</title>
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



		<div class="row text-center">
			<div class="col-sm-12">

				<h1>
					You have generated a word
					<c:out value="${click}" />
					times
				</h1>

				<div class="row text-center ">
					<div class="col-sm-4 offset-sm-4 border rounded  border-primary ">

						<h1>
							<c:out value="${key}" />
						</h1>
					</div>
				</div>
				<div class="row ">
					<br>
				</div>
				<form action="showrandom" method="GET">
					<input type="hidden" name="contador" value="1">
					<button type="submit" class="btn btn-danger" value="submit">Generate</button>
					<!--  <button type="reset" value="Reset">Reset</button>  -->
				</form>

				<h1>The last time you generated a word was:</h1>
				
				
				
				<div class="row text-center ">
					<div class="col-sm-4 offset-sm-4 border rounded  border-primary ">


							<h5> <c:out value="${lastAccess}" /> </h5>
						
					</div>
				</div>
				
				
			</div>
		</div>
	</div>

</body>
</html>