package com.manthan.shoppingapplication.servlet;

import java.io.IOException;

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

@WebServlet("/OrderProductServlet")
public class OrderProductServlet extends HttpServlet {
	OrderDao dao=new OrderDaoImpl();
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	HttpSession session=req.getSession(false);
	if(session!=null){
		int productId=Integer.parseInt(req.getParameter("productId"));
		UserInfoBean userInfoBean=(UserInfoBean)session.getAttribute("userInfoBean");
		int userId=userInfoBean.getUserId();
		
		boolean isOrdered=dao.orderPlaced(productId, userId);
		if(isOrdered) {
			req.setAttribute("orderMsg", "Ordered PLaced!!");
			req.getRequestDispatcher("./home").forward(req, resp);
		}else {
			req.setAttribute("orderMsg", "Sorry!!.. Ordered not Placed. Please try to Order again!!");
			req.getRequestDispatcher("./orderProduct").forward(req, resp);
		}
		
	}else {
		req.setAttribute("msg", "Please!!! Login First");
		req.getRequestDispatcher("/login").include(req, resp);
	}//end of if-else() session
	
	
}
}
