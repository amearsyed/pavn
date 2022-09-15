package DataDriven;
import java.io.FileInputStream;
import java.util.Properties;
import org.testng.annotations.Test;

public class ReadProperties {
	@Test
	public void reading() throws Exception {
		FileInputStream fis=new FileInputStream("./amear.properties");
		Properties p=new Properties();
		p.load(fis);
		String USERNAME=p.getProperty("username");
		System.out.println(USERNAME);
		
	}
	
}

