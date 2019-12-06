package com.manthan.shoppingapplication.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manthan.shoppingapplication.bean.UserInfoBean;
import com.manthan.shoppingapplication.dao.UserDao;
import com.manthan.shoppingapplication.dao.UserDaoImpl;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet{
	public static UserDao dao=new UserDaoImpl() ;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int userId =Integer.parseInt(req.getParameter("userId"));
		String userName=req.getParameter("userName");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		UserInfoBean userInfoBean=new UserInfoBean();
		userInfoBean.setUserId(userId);
		userInfoBean.setUserName(userName);
		userInfoBean.setEmail(email);
		userInfoBean.setPassword(password);
		
		if(dao.registerUser(userInfoBean)) {
			req.setAttribute("registeredMsg", "User Registered!!... Login to Continue");
			req.getRequestDispatcher("/login").forward(req, resp);
		}else {
			req.setAttribute("registredMsg", "User not registered");
			req.getRequestDispatcher("/register").forward(req, resp);
		}
	}
}
