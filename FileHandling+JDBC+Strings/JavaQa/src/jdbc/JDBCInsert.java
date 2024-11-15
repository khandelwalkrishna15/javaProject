package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;


public class JDBCInsert {
	
	private static final String DB = "test_nagp";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "Passw0rd0$#@";
	private static Random random = new Random();
	public static void main(String[] args) throws SQLException {
		
		Connection con = null;
		PreparedStatement preparedStatement = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + DB, USERNAME, PASSWORD);
			
			System.out.println("Data in the employee table: ");
			int id = random.nextInt(10000, 99999);
			String name = createRandomString();
			String address =  createRandomString();
            preparedStatement = con.prepareStatement("insert into Employee values(?, ?, ?)");
            
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, address);
            
            int row = preparedStatement.executeUpdate();
            
			System.out.println("Count of rows updated: " + row);
				
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			preparedStatement.close();
			con.close();
		}
	}
	
	private static String createRandomString() {
		String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";
	    String numbers = "0123456789";
	    String alphaNumeric = upperAlphabet + lowerAlphabet + numbers;
	    StringBuilder sb = new StringBuilder();
	    int length = random.nextInt(5, 20);

	    for(int i = 0; i < length; i++) {
	      int index = random.nextInt(alphaNumeric.length());
	      char randomChar = alphaNumeric.charAt(index);
	      sb.append(randomChar);
	    }
		return sb.toString();
	}

}
