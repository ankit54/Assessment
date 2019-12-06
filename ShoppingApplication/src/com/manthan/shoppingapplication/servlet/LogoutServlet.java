package com.manthan.shoppingapplication.servlet;



import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);
		if(session!=null) {
			session.invalidate();
			req.setAttribute("logoutMsg", "Logged out!!!");
			req.getRequestDispatcher("./login").forward(req, resp);
		}else {
			req.setAttribute("msg", "Login First!!");
			req.getRequestDispatcher("./login").forward(req, resp);
		}
	}
}

