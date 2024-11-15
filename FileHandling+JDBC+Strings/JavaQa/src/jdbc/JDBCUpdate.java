package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class JDBCUpdate {
	
	private static final String DB = "test_nagp";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "Passw0rd0$#@";
	public static void main(String[] args) throws SQLException {
		Connection con = null;
		PreparedStatement preparedStatement = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + DB, USERNAME, PASSWORD);
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the id of the record to be updated: ");
			int id = Integer.parseInt(sc.nextLine());
			System.out.print("New name: ");

			String name = sc.nextLine();
			
            preparedStatement = con.prepareStatement("update Employee set name = ? where employee_id = ?");
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, id);
            int row = preparedStatement.executeUpdate();
			System.out.println("Count of rows updated: " + row);
			sc.close();
				
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
		
			preparedStatement.close();
			con.close();
		}
		
	}
}
