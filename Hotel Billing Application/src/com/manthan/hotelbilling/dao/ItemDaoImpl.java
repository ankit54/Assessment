package com.manthan.hotelbilling.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.manthan.hotelbilling.bean.ItemInfoBean;
import com.manthan.hotelbilling.dbConnection.DBConnection;

public class ItemDaoImpl implements ItemDao {

	@Override
	public List<ItemInfoBean> showAll() {
		Connection con=new DBConnection().createConnection();
		Statement stmt = null;
		ResultSet rs = null;
		List<ItemInfoBean> allItems=new ArrayList<ItemInfoBean>();
		ItemInfoBean itemInfoBean=new ItemInfoBean();
		try {
			//ISSUE SQL QUERY 
			String query = " select * from Hotel_Bill";
			stmt = con.createStatement();


			rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				itemInfoBean.setItemCode(rs.getInt("Item_Code"));
				itemInfoBean.setFoodName(rs.getString("Food_Name"));
				itemInfoBean.setPrice(rs.getDouble("Price"));
				
				allItems.add(itemInfoBean);

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
			if (stmt != null) {
				try {
					stmt.close();
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
	
		return allItems;
	}// end of showAll
	
	

	public boolean addFoodItem(ItemInfoBean itemInfoBean) {
		Connection con=new DBConnection().createConnection();
		PreparedStatement pstmt = null;

		boolean isAdded=false;
		try {
			//ISSUE SQL QUERY 
			String query = " insert into Hotel_Bill values (?,?,?)";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, itemInfoBean.getItemCode());
			pstmt.setString(2, itemInfoBean.getFoodName() );
			pstmt.setDouble(3, itemInfoBean.getPrice());
			

			int n = pstmt.executeUpdate();
			if(n>0) {

				isAdded=true;

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			//CLOSE JDBC OBJECTS
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
	}



	@Override
	public boolean removeFoodItem(int itemCode) {
		Connection conn=new DBConnection().createConnection();
		PreparedStatement pstmt=null;
		boolean isRemoved=false;
		
		String query = "delete from Hotel_Bill where Item_Code=?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, itemCode);
			
			int n = pstmt.executeUpdate();
			if(n>0) {
				isRemoved=true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return isRemoved;
	} // end of removeFoodItem()



	@Override
	public boolean modifyFoodItem(int itemCode, String foodName, double price) {
		Connection con=new DBConnection().createConnection();
		PreparedStatement pstmt = null;
		boolean isModified=false;
		String query = " update Hotel_Bill set Food_Name=?,Price=? where Item_Code=? ";
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, foodName);
			pstmt.setDouble(2, price );
			pstmt.setInt(3, itemCode);
			
			int n = pstmt.executeUpdate();
			if(n>0) {
				isModified=true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return isModified;
	}//end of modifyFoodItem()



	@Override
	public double generateTotalPrice(List<Integer> orderedItems) {
		Connection con=new DBConnection().createConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		Double totalPrice=0.0;
		for (Integer oItems : orderedItems) {
			String query = " select price from Hotel_Bill where Item_Code =?";
			try {
				pstmt = con.prepareStatement(query);
				pstmt.setInt(1, oItems);
				rs=pstmt.executeQuery();
				
				while(rs.next()) {
					totalPrice=totalPrice+rs.getDouble("Price");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}	
		}
		return totalPrice;
	}// end of generateBill()



	@Override
	public List<ItemInfoBean> generateBill(List<Integer> orderedItems) {
		Connection con=new DBConnection().createConnection();
		PreparedStatement pstmt=null;
		List<ItemInfoBean> listOfItems=new ArrayList<ItemInfoBean>();
		ItemInfoBean itemInfoBean=null; 
		ResultSet rs=null;
		System.out.println(orderedItems);
		String query = " select * from Hotel_Bill where Item_Code =?";
		try {
		pstmt = con.prepareStatement(query);
		for (Integer oItems : orderedItems) {
			
				pstmt.setInt(1, oItems);
				rs=pstmt.executeQuery();
				
				while(rs.next()) {
					itemInfoBean=new ItemInfoBean();
					itemInfoBean.setItemCode(rs.getInt("Item_Code"));
					itemInfoBean.setFoodName(rs.getString("Food_Name"));
					itemInfoBean.setPrice(rs.getDouble("Price"));
					
					listOfItems.add(itemInfoBean);
				}
				
			}
		}catch (SQLException e) {
				e.printStackTrace();
			}	
		return listOfItems;
	}

}
