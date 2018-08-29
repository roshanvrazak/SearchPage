package com.rvr.searchApp;

import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/attributeCtx")
public class AttributeExample extends HttpServlet {
	protected void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp)
			throws javax.servlet.ServletException, java.io.IOException {
		Dog d=new Dog();
		d.setName("Scooby");
		d.setColor("black");
		d.setBreed("Husky");
		
		ServletContext ctx=getServletContext();
		ctx.setAttribute("dog", d);
		
		PrintWriter out=resp.getWriter();
		out.print("Dog is stored in ServletContext");
		
	};

}
