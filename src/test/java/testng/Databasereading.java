package testng;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Databasereading {

	public static void main(String[] args) throws SQLException {

		 Driver dbdriver=new Driver();
		 DriverManager.registerDriver(dbdriver);
	Connection	connect= DriverManager.getConnection("jdbc:mysql://localhost:3306/advsel\",\"root\",\"root");
Statement statment=connect.createStatement();
ResultSet result=statment.executeQuery("select * from student;");
while(result.next())
{
	System.out.println(result.getString("id")+"\t"+result.getString("name")+"\t"+result.getString("address"));
}
connect.close();

		 
		 		
	}

}
