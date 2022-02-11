package com.Servlet;
import java.io.*;
import java.sql.Date;
import javax.servlet.*;
public class Second_Servlet_Using_Generic_Servlet extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
     	System.out.println("Generic Servlet");
		resp.setContentType("text/html");
     	PrintWriter out = resp.getWriter();
     	out.print("Today = "+ new Date(0).toString());
	}

}
