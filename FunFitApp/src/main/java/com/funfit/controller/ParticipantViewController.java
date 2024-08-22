package com.funfit.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.funfit.model.Participant;
import com.funfit.service.ParticipantService;

/**
 * Servlet implementation class ParticipantViewController
 */
@WebServlet("/ParticipantViewController")
public class ParticipantViewController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ParticipantViewController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ParticipantService ps = new ParticipantService();
		List<Participant> listofparticipants = ps.findAllParticipants();
		HttpSession hs = request.getSession();
		//request.setAttribute("listofparticipantt",listofparticipants);		// request scope 
		hs.setAttribute("listofparticipants",listofparticipants);			// session scope 
		//RequestDispatcher rd = request.getRequestDispatcher("view_participants.jsp");
		//rd.forward(request, response);
		response.sendRedirect("view_participants.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
