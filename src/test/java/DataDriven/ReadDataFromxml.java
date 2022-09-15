package DataDriven;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class ReadDataFromxml {
	@Test
	public void readdatafromxml(XmlTest xml)
	{
		String URL=xml.getParameter("url");
		System.out.println(URL);
	}
}
