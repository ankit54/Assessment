package com.manthan.servletjsp;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.beans.StudentInfoBean;
import com.manthan.dao.StudentDao;
import com.manthan.dao.StudentDaoImpl;



@WebServlet("/loginStudentJsp")
public class LoginStudent extends HttpServlet{
	StudentDao dao=new StudentDaoImpl();
	int loginAttempts=3;
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username=(req.getParameter("username"));
		String password=(req.getParameter("password"));
		
		StudentInfoBean studentInfoBean=dao.auth(username, password);
		if(studentInfoBean!=null && loginAttempts>=0) {
			HttpSession session=req.getSession(true);
			session.setAttribute("studentInfoBean", studentInfoBean);
			req.getRequestDispatcher("/homePage").forward(req, resp);
		}else {
			if(loginAttempts==0) {
				req.setAttribute("invalidMessage", "Sorry!! your account has been locked by the Admin.");;
			
			}else {
				loginAttempts--;
				req.setAttribute("invalidMessage", "Invalid id or password... You have "+loginAttempts+" attempts!!!");
			}
			req.getRequestDispatcher("/loginForm").forward(req, resp);
		}

	}
}
