package com.funfit.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.funfit.model.Batch;
import com.funfit.service.BatchService;

/**
 * Servlet implementation class BatchViewController
 */
@WebServlet("/BatchViewController")
public class BatchViewController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BatchViewController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BatchService bs = new BatchService();
		List<Batch> listofbatches = bs.findAllBatches();
		HttpSession hs = request.getSession();
		//request.setAttribute("listofproduct",listofbatches);		// request scope 
		hs.setAttribute("listofbatches",listofbatches);			// session scope 
		//RequestDispatcher rd = request.getRequestDispatcher("view_product.jsp");
		//rd.forward(request, response);
		response.sendRedirect("view_batches.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
