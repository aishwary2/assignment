package com.yash.jdbcdemo;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
       Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/car","root","admin");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from car_type");
        
        while(rs.next()) {
        	System.out.println("id :"+rs.getString(1)+"car type :"+rs.getString(2));
        }
       //st.executeUpdate("insert into carinfo values('34543sdgfd','Aishwary','maruti',1),('3443543dd','Aishwydd','hundai',2)");
        //st.executeUpdate("update car_type set value='tata' where id=2");
      // st.executeUpdate("delete from carinfo where type not in('maruti','hundai')");
    
       // st.executeQuery("SELECT carinfo.owner_name,engine.model_year FROM carinfo inner JOIN ENGINE ON carinfo.engine=engine.id");
       
       String sql="insert into carinfo values(?,?,?,?)";
   PreparedStatement ps=con.prepareStatement(sql);
   ps.setString(1, "dsfsfdfsd");
   ps.setString(2, "Hassdhsasdjd");
   ps.setString(3, "maruti");
   ps.setInt(4, 1);
   ps.addBatch();
   
   ps.setString(1, "dsfhjsssfgfsd");
   ps.setString(2, "Hsadasadsjd");
   ps.setString(3, "hundai");
   ps.setInt(4, 2);
   ps.addBatch();
   
   ps.setString(1, "dsfhjjsaa");
   ps.setString(2, "Hsadsddfsdsadd");
   ps.setString(3, "maruti");
   ps.setInt(4, 2);
   ps.addBatch();
   
   ps.setString(1, "dsf");
   ps.setString(2, "Hsadsfjd");
   ps.setString(3, "hundai");
   ps.setInt(4, 1);
   ps.addBatch();
   
   ps.setString(1, "dsfdfdfsd");
   ps.setString(2, "Hadsfsdhsjd");
   ps.setString(3, "hundai");
   ps.setInt(4, 1);
   ps.addBatch();
   ps.executeBatch();
    }
}
