package com.funfit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.funfit.model.Batch;
import com.funfit.service.BatchService;

/**
 * Servlet implementation class BatchUpdateController
 */
@WebServlet("/BatchUpdateController")
public class BatchUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BatchUpdateController() {
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
		int bid=Integer.parseInt(request.getParameter("bid"));
		String typeofbatch =request.getParameter("typeofbatch");
		String time =request.getParameter("time");
		
		
		// create Product java bean class object. 
		Batch b  = new Batch();
		b.setBid(bid);
		b.setTypeofbatch(typeofbatch);
		b.setTime(time);
		
		// created service class object 
		BatchService ps = new BatchService();
		
		// pass the object and get the result 
		String result = ps.updateBatch(b);
		pw.print(result);
		// created request dispatcher object and include the page 
		RequestDispatcher rd = request.getRequestDispatcher("update_product.jsp");
		// set the content in html format. 
		
		response.setContentType("text/html");
		rd.include(request, response);
	}

}
