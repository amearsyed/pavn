package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class ReadDataFormDataBaseTest {
	@Test
	public void readDataFromDB() throws SQLException
	{
		Connection con=null;
		try {
			//step-1 rigester the driver
			Driver drf=new Driver();
			DriverManager.registerDriver(drf);
			
			//step2: connect the database
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","root");
			
			//step3: create the statement
			Statement stmt = con.createStatement();
			
			
			//step4: execute the query
			ResultSet result = stmt.executeQuery("select * from students_info;");
			while(result.next())
			{
				System.out.println(result.getString(1)+" "+result.getString(2)+" "+result.getString(3)+" "+result.getString(4));
			}
			
			
			//step5: close the database
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
		//step5: close the database
			System.out.println("Connection is closed");
		con.close();
		}
		

	}
}

