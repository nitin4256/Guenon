package demoact;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.Driver;

/**
 * This class contains reusable methods to perform operations on database
 * 
 * @author HP
 *
 */
public class Databaseutility {
	private Connection connection;

	/**
	 * This method is used to initialize and establish database connection
	 * @param user
	 * @param url
	 * @param password
	 */
	public void databaseInitialization(String user, String url, String password) {
		Driver dbDriver = null;
		try {
			dbDriver = new Driver();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			DriverManager.registerDriver(dbDriver);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			connection = DriverManager.getConnection(url, user, password);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/** this method is used to read data from database
	 * @param query
	 * @param columnName
	 * @return
	 * @throws SQLException
	 */
	public List<String> readDataFromDatabase(String query, String columnName) throws SQLException {
		Statement statement = null;
		try {
			statement = connection.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ResultSet result = null;
		try {
			result = statement.executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		List<String> columnData = new ArrayList<>();
		while (result.next()) {
			columnData.add(result.getString(columnName));
		}
		return columnData;
	}

	/**
	 * This method is used to modify the data from database
	 * @param query
	 * @return
	 */
	public int modifyDatabase(String query) {
		Statement statement = null;
		try {
			statement = connection.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		int result = 0;
		try {
			result = statement.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	/**
	 * This method is use to closes database connection
	 */
	public void closeDatabase() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}