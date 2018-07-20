/**
 * 
 */
package jdbcUPDATE_DATA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @author 		Konstantin Frolov
 * Student No.	R00144177
 * email		konstantin.frolov@mycit.ie
 */
public class Driver {

	/**
	 * 
	 * 1. Get Connection
	 * 2. Create a Statement
	 * 3. Execute SQL Update Statement
	 * 
	 */
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/demo1?autoReconnect=true&useSSL=false";
		String user = "root";
		String password = "root";
		
		try {
			// 1. Get Connection
			Connection myConn = DriverManager.getConnection(url, user, password);
			
			// 2. Create a Statement
			Statement myStatement = myConn.createStatement();
			
			// 3. Execute SQL Update Statement
			String query = "UPDATE employees "
					+ "set Email = 'david.brown@mail.com' "
					+ "WHERE PersonID = 9";
			myStatement.execute(query);
			
			System.out.println("Updated sucsesfuly :)");
			
		}catch(Exception exc){
			System.out.println("Oops !!!");
			System.out.println(exc.getMessage());
		}
		
	}

}
