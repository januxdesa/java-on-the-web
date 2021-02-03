package cl.button.click.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ButtonClick
 */
@WebServlet("/")
public class ButtonClick extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ButtonClick() {
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

		HttpSession session = request.getSession();
		//

		String clickStr = (request.getParameter("click") != null && request.getParameter("click") != "") ? request.getParameter("click") : "0";
		int clickInt = Integer.parseInt(clickStr);

		String resetStr = (request.getParameter("reset") != null && request.getParameter("reset") != "")
				? request.getParameter("reset")
				: "0";

		if (resetStr.equals("reset")) {
			session.setAttribute("contador", null);
		}

		String contadorStr = (session.getAttribute("contador") != null && session.getAttribute("contador") != "") ? (String) session.getAttribute("contador") : "0";
		int numberbcsession = Integer.parseInt(contadorStr);

		// sumo los valores
		int sum = clickInt + numberbcsession;

		String suma = String.valueOf(sum);

		session.setAttribute("contador", suma);

		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/index.jsp");
		view.forward(request, response);

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
