package com.manthan.shoppingapplication.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.shoppingapplication.bean.ProductInfoBean;
import com.manthan.shoppingapplication.dao.ProductDao;
import com.manthan.shoppingapplication.dao.ProductDaoImpl;


@WebServlet("/SearchProductServlet")
public class SearchProductServlet extends HttpServlet {
	public static ProductDao dao=new ProductDaoImpl() ;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session=req.getSession(false);
		if(session!=null) {
			String productName=req.getParameter("productName");
			ProductInfoBean productInfoBean=dao.searchProduct(productName);
			if(productInfoBean!=null) {
				req.setAttribute("productInfoBean",productInfoBean );
				req.getRequestDispatcher("./searchProduct").forward(req, resp);
			}else {
				req.setAttribute("productMsg", "Product Not Found!!");
				req.getRequestDispatcher("./searchProduct").forward(req, resp);
			}
		}else {
			req.setAttribute("loginMsg", "Please!!! Login First");
			req.getRequestDispatcher("/login").include(req, resp);
		}
		
	}
}
