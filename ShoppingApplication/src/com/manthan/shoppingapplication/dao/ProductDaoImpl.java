package com.manthan.shoppingapplication.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.manthan.shoppingapplication.bean.ProductInfoBean;
import com.manthan.shoppingapplication.bean.UserInfoBean;
import com.manthan.shoppingapplication.dbconnection.CreateConnection;

public class ProductDaoImpl implements ProductDao {

	@Override
	public ProductInfoBean searchProduct(String productName) {
		Connection con= new CreateConnection().createConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ProductInfoBean productInfoBean =null;
		
		String query = " select * from Product_Info where Product_Name=?";
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, productName);

			rs = pstmt.executeQuery();

			if(rs.next()) {
				productInfoBean=new ProductInfoBean();
				productInfoBean.setProductId(rs.getInt("Product_ID"));
				productInfoBean.setProductName(rs.getString("Product_Name"));
				productInfoBean.setProductCost(rs.getDouble("Product_Cost"));
				productInfoBean.setProductColor(rs.getString("Product_Color"));
				productInfoBean.setDescription(rs.getString("Description"));
				productInfoBean.setNumberOfProducts(rs.getInt("Number_Of_Products"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return productInfoBean;
	} // end of searchProduct

}
