package com.manthan.empwebapp.servletjsp;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.empwebapp.beans.EmployeeInfoBeans;
import com.manthan.empwebapp.dao.EmployeeDAO;
import com.manthan.empwebapp.dao.EmployeeDAOImpl;
@WebServlet("/seeAllEmployeeServletJsp")
public class SeeAllEmployeeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);
		if(session!=null) {
			
			EmployeeDAO dao=new EmployeeDAOImpl();
			List<EmployeeInfoBeans> al = dao.seeAllEmployee();
			if(al!=null) {
				req.setAttribute("seeEmployee", al);
			}
			else {
				req.setAttribute("seeEmployee", "Employee Id not found ");
			}
			req.getRequestDispatcher("/seeAllEmployeeForm").forward(req, resp);
		}
		else {
			req.setAttribute("msg", "Please login first!");
			req.getRequestDispatcher("/loginForm").forward(req, resp);
		}
	}
}
