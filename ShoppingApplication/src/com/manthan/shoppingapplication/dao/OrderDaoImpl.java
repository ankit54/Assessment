package com.manthan.shoppingapplication.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.manthan.shoppingapplication.bean.OrderInfoBean;
import com.manthan.shoppingapplication.dbconnection.CreateConnection;

public class OrderDaoImpl implements OrderDao {

	@Override
	public boolean orderPlaced(int productId, int userId) {
		Connection con=new CreateConnection().createConnection();
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		ResultSet rs = null;
		boolean isOrdered=false;
		try {
			pstmt1=con.prepareStatement("select * from Product_Info where Product_ID=?");
			pstmt1.setInt(1,productId);
			rs=pstmt1.executeQuery();
			Double productCost=0.0;
			while(rs.next()) {
				productCost=rs.getDouble(3);
			}
			
			System.out.println("Cost: "+productCost);
			
			pstmt2=con.prepareStatement("INSERT INTO order_info (Product_ID, User_ID, Price) VALUES (?,?,?);");
			pstmt2.setInt(1, productId);
			pstmt2.setInt(2, userId);
			pstmt2.setDouble(3, productCost);
			
			int n=pstmt2.executeUpdate();
			if(n>0) {
				isOrdered=true;
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt1!=null) {
				try {
					pstmt1.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt2!=null) {
				try {
					pstmt2.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return isOrdered;
	}

	public List<OrderInfoBean> orderHistory(int userId){
		Connection con=new CreateConnection().createConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<OrderInfoBean> orderList=new ArrayList<OrderInfoBean>();
		OrderInfoBean orderInfoBean=new OrderInfoBean();
		try {
			pstmt=con.prepareStatement("select * from Order_Info where User_ID=?");
			pstmt.setInt(1,userId);
			
			rs=pstmt.executeQuery();
			while(rs.next()) {
				orderInfoBean.setOrderId(rs.getInt(1));
				orderInfoBean.setProductId(rs.getInt(2));
				orderInfoBean.setUserId(rs.getInt(3));
				orderInfoBean.setPrice(rs.getDouble(4));
				orderList.add(orderInfoBean);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return orderList;
	}

	
}
