package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSelect {
	
	private static final String DB = "test_nagp";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "Passw0rd0$#@";
	
	public static void main(String[] args) throws SQLException {
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + DB, USERNAME, PASSWORD);
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from employee");
			
			printResult(rs);
				
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			rs.close();
			stmt.close();
			con.close();	
		}
	}

	private static void printResult(ResultSet rs) throws SQLException {
		
		System.out.println("Data in the employee table: ");

		
		while (rs.next()) {
			int id = rs.getInt("employee_id");
			String name = rs.getString("name");
			String address = rs.getString("address");
			System.out.println(id + " " + name + " " + address);
		}
	}

}
