package DataDriven;

import org.testng.annotations.Test;

public class ReadfromCMDTest {
	
	@Test
	public void readfromcmdprompTest()
	{
		String URL=System.getProperty("url");
		String USERNAME=System.getProperty("username");
		String PASSWORD=System.getProperty("password");
		
		
		System.out.println("url is "+URL);
		System.out.println("username is "+USERNAME);
		System.out.println("password is "+PASSWORD);

		
	}
}
