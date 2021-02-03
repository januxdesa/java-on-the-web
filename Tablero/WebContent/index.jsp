<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import = "java.util.Random"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tablero</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>

<body>

<%!
public String generaColores () {
	
	Random r = new Random();
	
	int color1 = r.nextInt(16777215);   // #FFFFFF 
	String hex1 = Integer.toHexString(color1);   
	
	return hex1;
	
}

public String salidaHtml(int i, int j, String hex1, String hex2) {
	
	int alternar = 0;
	String out = "";
	
	//String hex1 = this.colores();
	//String hex2 = this.colores();
	
	if (j % 2 == 0) { alternar = 0; } else { alternar = 1; }
	if (i % 2 == alternar) {
	     out = "<div class='negro' Style='background-color: #"+hex1+"'></div>";
	} else {
		 out = "<div class='rojo' Style='background-color: #"+hex2+"'></div>";
	}
	
	return out;
}


%>

<%
	String width = request.getParameter("width");
	String height = request.getParameter("height");

	
	
	if (width != null && height != null) {
		int w = Integer.parseInt(width);
		int h = Integer.parseInt(height);
	
	
		String hex1 = this.generaColores();
				
		String hex2 = this.generaColores();
		
		String hex3 = this.generaColores();
	
	%>
	<div class="container" >
	<div class="centrar">
	<h1  Style="color: #<%=hex3  %>" >Las medidas ingresadas son Width : <%=w%> y Height: <%=h%></h1>
	</div>
	<br>
	<div class="centrar">
		<h1>Tablero de Damas</h1>
	</div>
	<div class="centrar">
		<%  int alternar = 0;
			for (int j = 1; j <= h; j++) { 
			%>
			<div>
			<% 
				for (int i = 1; i <= w; i++) { 
				
					String outHtml = this.salidaHtml(i, j, hex1 , hex2);
					out.write(outHtml);

		 		} //fin fof
				%>
			</div>
		   <%
	     	} //fin for j
	%>
	</div>
	</div>
	<% } else { %>
		<div class="centrar">
			<h1>Debe ingresar los valores en width y height </h1>
		</div>
	<% } %>

</body>

</html>