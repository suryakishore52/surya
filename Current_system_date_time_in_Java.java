package webdriverExamples;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Current_system_date_time_in_Java {

	public static void main(String[] args) {
		
// create object of simpledateformat class and decide the format
	DateFormat dateFormat  = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	
	// get current date time with date( )
	Date date = new Date();
	
	// now format the date
	String date1 = dateFormat.format(date);
	
	//print the date
	System.out.println(date1);
	
	
	}

}
