package testng;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class readdatafromdatabse {

	public static void main(String[] args) throws SQLException {

		//step1: create an instance for driver
		//driver should be imported from com.mysql.cj.jdbc.driver
		//new driver() throws SqlException
		Driver dbDriver =new Driver();
		
		//step2: register to the dbdriver
		//DriverManager is in java.sql pakage
		DriverManager.registerDriver(dbDriver);
		
		//step3: Establish database connection
		//conection should be imported from java.sql.package
	Connection	connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/advsel","root","root");
	//step4: create statement
	 //statment should be imported fr4om java.sql pakage
	Statement statment= connect.createStatement();
	
	//step5: Execute query to fetch data
ResultSet result=statment.executeQuery("select * from student;");
while(result.next())
{
System.out.println(result.getString("id")+"\t"+result.getString("name")+"\t"+result.getString("address"));
}
//step6: close database

	connect.close();

	}
	
 
}


