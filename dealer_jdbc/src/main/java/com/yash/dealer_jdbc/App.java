package com.yash.dealer_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

public class App 
{
	static Logger logger=Logger.getAnonymousLogger();
	public static void main( String[] args ) throws SQLException,ClassNotFoundException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/dealer","root","admin");


		//		String sql="insert into dealer_info values(?,?,?,?)";
		//		PreparedStatement ps=con.prepareStatement(sql);
		//		ps.setString(1, "345684sdz");
		//		ps.setString(2, "grocery");
		//		ps.setString(3, "Aishwary");
		//		ps.setString(4, "bread");
		//		ps.addBatch();
		//		
		//		ps.setString(1, "345684sdq");
		//		ps.setString(2, "foodhub");
		//		ps.setString(3, "Sany");
		//		ps.setString(4, "italian");
		//		ps.addBatch();
		//		
		//		ps.setString(1, "345684sde");
		//		ps.setString(2, "hundai");
		//		ps.setString(3, "Shivam");
		//		ps.setString(4, "car");
		//		ps.addBatch();
		//		
		//		ps.setString(1, "345684sdc");
		//		ps.setString(2, "stationary");
		//		ps.setString(3, "Aishs");
		//		ps.setString(4, "pen");
		//		ps.addBatch();
		//		
		//		ps.executeBatch();

		//		
		//		String sq="insert into product values(?,?,?)";
		//		PreparedStatement p=con.prepareStatement(sq);
		//		p.setString(1, "bread");
		//		p.setString(2, "1");
		//		p.setString(3, "kjshkjfhkjds hfjdshfdsf");
		//		p.addBatch();
		//		
		//		p.setString(1, "italian");
		//		p.setString(2, "2");
		//		p.setString(3, "kjshkjfhkjds hfjdshfdsf");
		//		p.addBatch();
		//		
		//		p.setString(1, "car");
		//		p.setString(2, "3");
		//		p.setString(3, "kjshkjfhkjds hfjdshfdsf");
		//		p.addBatch();
		//		
		//		p.setString(1, "pen");
		//		p.setString(2, "4");
		//		p.setString(3, "kjshkjfhkjds hfjdshfdsf");
		//		p.addBatch();
		//		
		//		p.executeBatch();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("SELECT * FROM dealer_info INNER JOIN product ON dealer_info.product=product.name");
		while(rs.next()) {
			logger.info("registration no "+rs.getString(1)+" Name Of Shop "+rs.getString(2)+" Owner Name "+rs.getString(3)
			+" Product Name "+rs.getString(4)+" Product Id "+rs.getString(6)+" Product Description "+rs.getString(7));
		}
		st.executeUpdate("update product set description='Food Hab description' where id=2");
		st.executeUpdate("delete from dealer_info where product ='not found'");

	}

}
