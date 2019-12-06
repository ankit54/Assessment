package com.manthan.shoppingapplication.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.shoppingapplication.bean.UserInfoBean;
import com.manthan.shoppingapplication.dao.UserDao;
import com.manthan.shoppingapplication.dao.UserDaoImpl;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	static UserDao dao=new UserDaoImpl();
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("userName");
		String password=req.getParameter("password");
		
		UserInfoBean userInfoBean=dao.authenticateUser(email, password);
		if(userInfoBean!=null) {
			HttpSession session=req.getSession(true);
			session.setAttribute("userInfoBean", userInfoBean);
			req.getRequestDispatcher("/home").forward(req, resp);
		}else {
			req.setAttribute("invalidMessage", "Invalid id or password");
			req.getRequestDispatcher("/login").forward(req, resp);
		}

	}
}
