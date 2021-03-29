package webdriverExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database_testing_scripts {
	
	
	//1.Script to get the data from the Database – Database Testing:
	
	 public static void selectQuery() throws SQLException, ClassNotFoundException {	
		 
		 	String dbURL = "jdbc:sqlserver://ipAddress:portNumber/dbName";
		 		String username = myUserName;
		 		String password = myPassword;
		        //Load MS SQL JDBC Driver
		        Class.forName("net.sourceforge.jtds.jdbc.Driver");
		        //Creating connection to the database
		        Connection con = DriverManager.getConnection(dbURL,username,password);
		        //Creating statement object
		    	Statement st = con.createStatement();
		    	String selectquery = "SELECT * FROM <tablename> WHERE <condition>";
		        //Executing the SQL Query and store the results in ResultSet
		    	ResultSet rs = st.executeQuery(selectquery);
		    	//While loop to iterate through all data and print results
		    	while (rs.next()) {
		    		System.out.println(rs.getString("transaction_datetime"));
		    	}
		        //Closing DB Connection
		    	con.close();
	 }
	 
	//2.Script to update the data in the Database – Database Testing:
 	
 	public static void updateQuery() throws ClassNotFoundException, SQLException{
 		
 		String dbURL = "jdbc:sqlserver://ipAddress:portNumber/dbName";
 			String username = myUserName;
 	        String password = myPassword;
 	        String updatequery = "UPDATE <table_name> SET <column_name> = <some_value>";
 	        
 		Class.forName("net.sourceforge.jtds.jdbc.Driver");
 	   	Connection con = DriverManager.getConnection(dbURL,username,password);
 	    	Statement stmt = con.createStatement();
 	    	stmt.executeUpdate(updatequery);  
 	    	con.close();
 	     }
 	
 	//3.Script to delete the data in the Database – Database Testing:
 	
 	public static void deleteQuery() throws SQLException, ClassNotFoundException {	
 		
 		String dbURL = "jdbc:sqlserver://ipAddress:portNumber/dbName";
 			String username = myUserName;
 	        String password = myPassword;
 	        String query = "DELETE FROM <table_name>";		
 	        Class.forName("net.sourceforge.jtds.jdbc.Driver");
 	   	Connection con = DriverManager.getConnection(dbURL,username,password);
 	    	Statement stmt = con.createStatement();			
 	    	stmt.executeUpdate(query);
 	    	//Closing DB Connection
 	    	con.close();
 	     }	    	
		    	
}
