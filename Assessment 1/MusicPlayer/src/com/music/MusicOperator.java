package com.music;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import java.util.Random;


public class MusicOperator {

	public void searchSong(String songName) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			//LOAD THE DRIVER
			Class.forName("com.mysql.jdbc.Driver");

			//GET CONNECTION VIA DRIVER
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/musicplayer", "root", "root");

			//ISSUE SQL QUERY 
			String query = " select * from MusicFiles where Song_Title=?";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, songName);

			rs = pstmt.executeQuery();

			while(rs.next()) {

				System.out.println();
				System.out.println("********** Song Found **********");
				
				System.out.println("Song Id: "+rs.getInt(1)+"\t");
				System.out.println("Song Title: "+rs.getString(2)+"\t");
				System.out.println("Artist Name: "+rs.getString(3)+"\t");
				System.out.println("Album Name: "+rs.getString(4)+"\t");
				System.out.println("Song Location: "+rs.getString(5)+"\t");
				System.out.println("Description: "+rs.getString(6)+"\t");
				System.out.println();

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
	}//end of searchSong


	public void showAllSongs() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			//LOAD THE DRIVER
			Class.forName("com.mysql.jdbc.Driver");

			//GET CONNECTION VIA DRIVER
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/musicplayer", "root", "root");

			//ISSUE SQL QUERY 
			String query = " select * from MusicFiles";
			stmt = con.createStatement();


			rs = stmt.executeQuery(query);
			System.out.println();
			System.out.println("**********The Songs Are:**********");
			while(rs.next()) {

				System.out.println();
				System.out.print("Song Id: "+rs.getInt(1)+"\t");
				System.out.print("Song Title: "+rs.getString(2)+"\t");
				System.out.print("Artist Name: "+rs.getString(3)+"\t");
				System.out.print("Album Name: "+rs.getString(4)+"\t");
				System.out.print("Song Location: "+rs.getString(5)+"\t");
				System.out.print("Description: "+rs.getString(6)+"\t");
				System.out.println();

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
	}//end of showAllSongs


	public void addSong() {
		Connection con = null;
		PreparedStatement pstmt = null;


		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Song_ID: ");
		int songId=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Song_Title: ");
		String songTitle=sc.nextLine();
		System.out.println("Enter Artist_Name: ");
		String artistName=sc.nextLine();
		System.out.println("Enter Album_Name: ");
		String albumName=sc.nextLine();
		System.out.println("Enter Song_Location: ");
		String songLocation=sc.nextLine();
		System.out.println("Enter Song_Description: ");
		String description=sc.nextLine();




		try {
			//LOAD THE DRIVER
			Class.forName("com.mysql.jdbc.Driver");

			//GET CONNECTION VIA DRIVER
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/musicplayer", "root", "root");

			//ISSUE SQL QUERY 
			String query = " insert into MusicFiles values (?,?,?,?,?,?)";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, songId);
			pstmt.setString(2, songTitle );
			pstmt.setString(3, artistName);
			pstmt.setString(4, albumName);
			pstmt.setString(5, songLocation);
			pstmt.setString(6, description);


			int n = pstmt.executeUpdate();
			if(n>0) {

				System.out.println("Song Added");

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
	}//end of addSong


	public void updateSong() {
		Connection con = null;
		PreparedStatement pstmt = null;
		//ResultSet rs = null;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Song_ID: ");
		int songId=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the name of column: ");
		String col=sc.nextLine();
		System.out.println("Enter the value of "+col+": ");
		String colValue=sc.nextLine();




		try {
			//LOAD THE DRIVER
			Class.forName("com.mysql.jdbc.Driver");

			//GET CONNECTION VIA DRIVER
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/musicplayer", "root", "root");

			//ISSUE SQL QUERY 
			String query = " update MusicFiles set ?=? where Song_ID=? ";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, col);
			pstmt.setString(2, colValue );
			pstmt.setInt(3, songId);


			int n = pstmt.executeUpdate();
			if(n>0) {

				System.out.println("Song Updated");

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
	}//end of updateSong



	public void deleteSong() {
		Connection con = null;
		PreparedStatement pstmt = null;
		//ResultSet rs = null;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Song_ID: ");
		int songId=sc.nextInt();
		sc.nextLine();


		try {
			//LOAD THE DRIVER
			Class.forName("com.mysql.jdbc.Driver");

			//GET CONNECTION VIA DRIVER
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/musicplayer", "root", "root");

			//ISSUE SQL QUERY 
			String query = "delete from MusicFiles where Song_Id=?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, songId);


			int n = pstmt.executeUpdate();
			if(n>0) {

				System.out.println("Song Deleted");

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
	}//end of updateSong


	public String playSong(int songId) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		MusicInfo mi=new MusicInfo();
		mi=null;

		String songName=null;

		try {
			//LOAD THE DRIVER
			Class.forName("com.mysql.jdbc.Driver");

			//GET CONNECTION VIA DRIVER
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/musicplayer", "root", "root");

			//ISSUE SQL QUERY 
			String query = " select * from MusicFiles where Song_ID=?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, songId);

			rs = pstmt.executeQuery();

			while(rs.next()) {

				songName=rs.getString("Song_Title");

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
		return songName;
	}//end of playSong


	public void playAllSong() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		MusicInfo mi=new MusicInfo();
		mi=null;

		try {
			//LOAD THE DRIVER
			Class.forName("com.mysql.jdbc.Driver");

			//GET CONNECTION VIA DRIVER
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/musicplayer", "root", "root");

			//ISSUE SQL QUERY 
			String query = " select * from MusicFiles;";
			stmt = con.createStatement();


			rs = stmt.executeQuery(query);
			while(rs.next()) {				
				System.out.println("Playing "+rs.getString(2)+"........");

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
	}//end of playAllSongs


	public void playAllSongRandom() {
		Connection con = null;
		Statement stmt = null;
		
		ResultSet rs = null;
		

		Random random=new Random();

		int songCount=0;

		try {
			//LOAD THE DRIVER
			Class.forName("com.mysql.jdbc.Driver");

			//GET CONNECTION VIA DRIVER
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/musicplayer", "root", "root");

			//ISSUE SQL QUERY 
			String query = " select * from MusicFiles order by rand();";
			stmt = con.createStatement();

			rs = stmt.executeQuery(query);
			
			while(rs.next()) {

				System.out.println("Playing..."+rs.getString(2));

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
	}//end of searchSong


}// end of class
