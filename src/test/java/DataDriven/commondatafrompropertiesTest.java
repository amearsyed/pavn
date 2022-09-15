package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

public class commondatafrompropertiesTest {
	@Test
	public void reading() throws Throwable
	{
		FileInputStream fis=new  FileInputStream("./commondata.properties");
		Properties p=new Properties();
		p.load(fis);
		String URL=p.getProperty("url");
		String USERNAME=p.getProperty("username");
		String PASSWORD=p.getProperty("password");

		System.out.println(URL);
		System.out.println(USERNAME);
		System.err.println(PASSWORD);
		
	}
}
