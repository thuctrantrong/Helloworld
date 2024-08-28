package vn.iotstar.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns= {"/login",})
public class login extends HttpServlet{

	private static final long serialVersionUID = 9006411414139298655L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		String site = new String("views/login.jsp");
		RequestDispatcher rd = req.getRequestDispatcher(site) ;
		rd.include(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name  = req.getParameter("uname");
		String pass = req.getParameter("psw");
		
		req.setAttribute("Username", name);
		req.setAttribute("Password", pass);
		RequestDispatcher rd = req.getRequestDispatcher("views/home.jsp");
		rd.forward(req,resp);
		
	}
	
}
