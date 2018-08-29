package com.rvr.searchApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookieServ")
public class CookieDemo extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		
		
		
		Cookie c1=new Cookie("name", "roshan");
		c1.setMaxAge(7*24*60*60);
		Cookie c2=new Cookie("address", "dreamsPg");
		Cookie c3=new Cookie("email", "roshanvrazak@gmail.com");
		
		
		resp.addCookie(c1);
		resp.addCookie(c2);
		resp.addCookie(c3);
		out.print("Cookies added");
		
		
		
		
	}
}
