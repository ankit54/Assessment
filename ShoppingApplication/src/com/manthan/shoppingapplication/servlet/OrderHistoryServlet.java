package com.manthan.shoppingapplication.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.shoppingapplication.bean.OrderInfoBean;
import com.manthan.shoppingapplication.bean.UserInfoBean;
import com.manthan.shoppingapplication.dao.OrderDao;
import com.manthan.shoppingapplication.dao.OrderDaoImpl;
@WebServlet("/OrderHistoryServlet")
public class OrderHistoryServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session=req.getSession(false);
		if(session!=null) {
			UserInfoBean userInfoBean=(UserInfoBean)session.getAttribute("userInfoBean");
			int userId=userInfoBean.getUserId();
			OrderDao dao=new OrderDaoImpl();
			List<OrderInfoBean> orderInfoBeans=dao.orderHistory(userId);
			req.setAttribute("orderHistory", orderInfoBeans);
			req.getRequestDispatcher("./home").forward(req, resp);
		}else {
			req.setAttribute("msg", "Login First!!");
			req.getRequestDispatcher("./login").forward(req, resp);
		}
		
		
		
	}
}
