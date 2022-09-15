package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class StorinfDatainjdbcTest {
	@Test
	public void storingdata() throws SQLException {
		Connection con=null;
		
		try {
			//step1:register the driver
			Driver dref=new Driver();
			DriverManager.registerDriver(dref);
			
			//step2:connect the database
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","root");
			
			 //step3:create the statement
			Statement stmt = con.createStatement();
			
			//step4:updateQuery
			int result = stmt.executeUpdate("insert into students_info(regno,firstname,middlename,lastname)values(10,'jam','jaammm','j')");
			
			if(result==1)
			{
				System.out.println("Data is inserted");
			}
			else 
			{
				System.out.println("Data is not updated");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally 
		{
			con.close();
			System.out.println("connection is closed");
		}
		
	}
}
