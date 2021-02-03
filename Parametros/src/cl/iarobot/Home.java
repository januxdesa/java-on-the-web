package cl.iarobot;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Home() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());

		String nombre = request.getParameter("name");
		String apellido = request.getParameter("last");
		String lenguaje = request.getParameter("language");
		String ciudad = request.getParameter("town");

		if (nombre == null) {
			nombre = "Unknown";
		}
		if (apellido == null) {
			apellido = "Unknown";
		}
		if (lenguaje == null) {
			lenguaje = "Unknown";
		}
		if (ciudad == null) {
			ciudad = "Unknown";
		}

		response.setContentType("text/html");
		// writes the response
		PrintWriter out = response.getWriter();
		out.write("<h1>Welcome, " + nombre + " " + apellido + " </h1>");
		out.write("<h3>You favorite language is: " + lenguaje + " </h3>");
		out.write("<h3>You hometown is: " + ciudad + " </h3>");

	}
	


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
