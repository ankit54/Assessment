package com.manthan.shoppingapplication.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.manthan.shoppingapplication.bean.UserInfoBean;
import com.manthan.shoppingapplication.dbconnection.CreateConnection;

public class UserDaoImpl implements UserDao {
	
	@Override
	public boolean registerUser(UserInfoBean userInfoBean) {
		Connection con=new CreateConnection().createConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		boolean isAdded=false;
		try{
			pstmt=con.prepareStatement("insert into User_Info values (?,?,?,?)");
	
			pstmt.setInt(1,userInfoBean.getUserId());
			pstmt.setString(2, userInfoBean.getUserName());
			pstmt.setString(3,userInfoBean.getEmail());
			pstmt.setString(4,userInfoBean.getPassword());
			
			int n=pstmt.executeUpdate();
	
			if(n>0) {
				isAdded=true;
			}


	} catch (Exception e) {
		e.printStackTrace();
	}finally {
			//CLOSE JDBC OBJECTS
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}//end of finally
		return isAdded;
	} // end of registerUser()

	@Override
	public UserInfoBean authenticateUser(String email, String password) {
		Connection con= new CreateConnection().createConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		UserInfoBean userInfoBean=null;

		try {
			//ISSUE SQL QUERY 
			String query = " select * from User_Info where Email=? and Password=?";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, email);
			pstmt.setString(2, password);

			rs = pstmt.executeQuery();

			if(rs.next()) {
				userInfoBean=new UserInfoBean(); //creating object of EmployeeInfoBeans
				userInfoBean.setUserId(rs.getInt("User_ID"));
				userInfoBean.setUserName(rs.getString("User_Name"));
				userInfoBean.setEmail(rs.getString("Email"));
				userInfoBean.setPassword(rs.getString("Password"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			//CLOSE JDBC OBJECTS
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}//end of finally
		return userInfoBean;
		
	}
}//end of class
