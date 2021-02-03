package cl.veterinaria.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.veterinaria.web.models.Dog;

/**
 * Servlet implementation class dog
 */
@WebServlet("/dogs")
public class ShowDogs extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowDogs() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name   = (request.getParameter("name")!=null)?request.getParameter("name"):"Sin nombre";
		String breed  = (request.getParameter("breed")!=null)?request.getParameter("breed"):"Sin raza";
		String weight = (request.getParameter("weight")!=null)?request.getParameter("weight"):"0";
		
		int numberweight = Integer.parseInt(weight); 
		
		Dog dog = new Dog(name,breed, numberweight);
		
		request.setAttribute("dog", dog);
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/dog.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
