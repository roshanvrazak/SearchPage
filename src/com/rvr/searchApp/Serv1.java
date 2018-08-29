package com.rvr.searchApp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/serv1")
public class Serv1 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
/*		RequestDispatcher dis = req.getRequestDispatcher("/serv2");
		dis.include(req, resp);*/
		
		ServletContext ctx=getServletContext();
		RequestDispatcher rd=ctx.getRequestDispatcher("serv2");
		rd.forward(req, resp);

	}
}

