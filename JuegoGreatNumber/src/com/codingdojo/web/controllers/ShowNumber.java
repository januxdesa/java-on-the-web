package com.codingdojo.web.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ShowNumber
 */
@WebServlet("/home")
public class ShowNumber extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShowNumber() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();

		String numero = (request.getParameter("numero") != null && request.getParameter("numero") != "") ? request.getParameter("numero") : "0";
		String reset = (request.getParameter("reset") != null && request.getParameter("reset") != "") ? request.getParameter("reset") : "noreset";
		
		String intentos = (String) session.getAttribute("intentos");
		int numeroIntentos = Integer.parseInt(intentos);
	
		String state = "false";
		
		
		
		int numberUser = Integer.parseInt(numero);
		
		if (numeroIntentos<=0 || reset=="reset" ) {
			session.setAttribute("usuario", session);
			Random r = new Random();
			//String msg = "";
			int numeroRandom = r.nextInt(99) + 1; 
			String numeroOculto = String.valueOf(numeroRandom); 
			session.setAttribute("numeroOculto", numeroOculto);		
			session.setAttribute("msg", "");	
			int intento = 7;
			intentos = String.valueOf(intento); 
			session.setAttribute("intentos", intentos);		
			
			session.setAttribute("mostrarReset", state);
			System.out.println("Primera Vez **********************");
			System.out.println("Numero ingresado " + numero );
			System.out.println("Numero de intentos " + intentos);
			System.out.println("Numero Oculto " + session.getAttribute("numeroOculto"));
			

		}
		else {
			String numeroO = (String) session.getAttribute("numeroOculto");
			int numeroOculto = Integer.parseInt(numeroO);
			String msg = "";
			state = "false";
			
			intentos = (String) session.getAttribute("intentos");
			numeroIntentos = Integer.parseInt(intentos);
			numeroIntentos -= 1;
			intentos = String.valueOf(numeroIntentos); 
			session.setAttribute("intentos", intentos);	
			
			 
			if (numeroIntentos==0) 
			{ 
				msg="Perdiste!! El numéro es " + session.getAttribute("numeroOculto"); 
				state = "true"; 	
			} 
			else {
				
				if (numeroOculto==numberUser) { 
					msg = "Ganaste!!!"; 	
					state = "true";
				}
				else if (numeroOculto > numberUser) {
					msg = "Más Alto"; 
					state = "false";
				}
				else if (numeroOculto < numberUser) {
					msg = "Más Bajo";
					state = "false";
				}
						
			
			}
				
			
			
			session.setAttribute("msg", msg);
			session.setAttribute("mostrarReset", state);
			
		}
		
		
		
		
		
		
		
		

		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/index.jsp");
		view.forward(request, response);
	}
	
	

}
