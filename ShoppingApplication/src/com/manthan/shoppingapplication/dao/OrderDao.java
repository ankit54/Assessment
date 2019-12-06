package com.manthan.shoppingapplication.dao;

import java.util.List;

import com.manthan.shoppingapplication.bean.OrderInfoBean;

public interface OrderDao {
	public boolean orderPlaced(int productId,int userID);
	public List<OrderInfoBean> orderHistory(int userId);
}
