package webdriverExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database{
public static void main (String args[]){
	try {
		//Class.forname("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con = DriverManager.getConnection("jdbc:odbc:dsn1");
		Statement st = con.createStatement();
		Thread.sleep(3000);
		ResultSet rs=st.executeQuery("select * from emptable");
		while(rs.next()) {
			System.out.println(rs.getString(2)+"\t"+rs.getString(3)+rs.getString(4)+"\t"+rs.getString(5));
		
	}	
	
	rs.close();
	st.close(); 
	con.close();
	
}
catch(Exception e)
{
	System.out.println("Error:" +e);
}
}
}

