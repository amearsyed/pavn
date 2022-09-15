package DataDriven;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class commonDatafromxmlTest {
	@Test
	public void readingfronxml(XmlTest xml)
	{
		String URL=xml.getParameter("url");
		String USERNAME=xml.getParameter("username");	
		String PASSWORD=xml.getParameter("password");

		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);

	}
}
