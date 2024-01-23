package com.arthraj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OperationsServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int num1=Integer.parseInt(req.getParameter("num1"));
		int num2=Integer.parseInt(req.getParameter("num2"));
		String operator=(String)req.getParameter("operation");
		float result=0;
		
		if(operator.equals("Addition")) {
			result=num1+num2;
		}
		else if(operator.equals("Subtraction") ){
			result=num1-num2;
		}
		else if(operator.equals("Multiplication")) {
			result=num1*num2;
		}
		else if(operator.equals("Division")){
			result=num1/num2;
		}
		
		PrintWriter out=res.getWriter();
		out.println("Result of "+num1+" "+operator+" "+num2+" = "+result);
		
	}
}
