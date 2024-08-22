package com.funfit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.funfit.service.ParticipantService;

/**
 * Servlet implementation class ParticipantDeleteController
 */
@WebServlet("/ParticipantDeleteController")
public class ParticipantDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ParticipantDeleteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		// receive the value from form and convert to respective data types. 
		
		int pid =Integer.parseInt(request.getParameter("pid"));// convert string to int 
		
		
		// created service class object 
		ParticipantService ps = new ParticipantService();
		
		// pass the object and get the result 
		String result = ps.deleteParticipant(pid);
		pw.print(result);
		// created request dispatcher object and include the page 
		RequestDispatcher rd = request.getRequestDispatcher("delete_participant.jsp");
		// set the content in html format. 
		
		response.setContentType("text/html");
		rd.include(request, response);
	}

}
