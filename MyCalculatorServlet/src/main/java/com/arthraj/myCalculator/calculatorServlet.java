package com.arthraj.myCalculator;

// Servlets are java classes that are processed on the server.

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class calculatorServlet
 */
@WebServlet("/calculatorServlet")
public class calculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public calculatorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		double a = Double.parseDouble(request.getParameter("op1"));
		double b = Double.parseDouble(request.getParameter("op2"));
		
		String oper=request.getParameter("operator");
		out.println(oper);
		double res=0;
		if(oper.equalsIgnoreCase("add")) {
			res=a+b;
		}
		else if(oper.equalsIgnoreCase("sub")) {
			res=a-b;
		}
		else if(oper.equalsIgnoreCase("mul")) {
			res=a*b;
		}
		else {
			res=a/b;
		}
		out.println("Result is "+res);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
