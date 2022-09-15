package DataDriven;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.junit.Test;

public class commondatafromjsonTest {
	@Test
	public void readdatafromjson() throws Exception 
	{
		FileReader fr=new FileReader("./commondata.json");
		
		JSONParser jp=new JSONParser();
		Object obj=jp.parse(fr);
		
		HashMap hp=(HashMap)obj;
		 String URL=(String)hp.get("url");
		 String USERNAME=(String)hp.get("username");
		 String PASSWORD=(String)hp.get("password");
			System.out.println(URL);
			System.out.println(USERNAME);
			System.out.println(PASSWORD);
		
		
		
	}

}
