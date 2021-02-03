package cl.codingdojo.web.controllers;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.Random;
import java.util.Date;
/**
 * Servlet implementation class ShowRandom
 */
@WebServlet("/showrandom")
public class ShowRandom extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShowRandom() {
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
		HttpSession session = request.getSession();
		session.setAttribute("usuario", session);
		
		//Click Button
		String cont = (request.getParameter("contador") != null && request.getParameter("contador") != "")? request.getParameter("contador"): "-1";
		int numbercontador = Integer.parseInt(cont);
		

		if (numbercontador > 0) {
			
			String clickS = (session.getAttribute("click")!=null && session.getAttribute("click")!="")? (String) session.getAttribute("click"): "0"; 
			
			
			int click = Integer.parseInt(clickS);
			int sum = numbercontador + click;	
			
			String suma = String.valueOf(sum); 
			
			session.setAttribute("click", suma);
			
			
			String frase = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			Random r = new Random();
			
			String llave = "";

			for (int i = 1; i < 11; i++) {
				
				int numeroRandom = r.nextInt(frase.length()); // #FFFFFF

				String letra = frase.substring(numeroRandom, numeroRandom + 1);

				llave += letra;

			}

			session.setAttribute("key", llave);
			session.setAttribute("lastAccess", new Date());

		}

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
