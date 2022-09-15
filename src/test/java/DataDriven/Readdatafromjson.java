package DataDriven;
import java.io.FileReader;
import java.util.HashMap;
import org.json.simple.parser.JSONParser;
import org.testng.annotations.Test;

public class Readdatafromjson {
	@Test
	public void readfromjson() throws Throwable
	{
		//sTEP1:CONVERT THE JSON FILE INTO JSON OBJECT
		FileReader fr=new FileReader("./Amear.json");
		
		//STEP2:CONVERT THE JSON OBJECT INTO JAVA OBJECT
	    JSONParser jp=new JSONParser();
	    Object obj=jp.parse(fr);
	    
	    //STEP3:READ DATA BY USING HASHMAP
	    HashMap hp=(HashMap)obj;	
	    String URL=(String)hp.get("url");
		System.out.println(URL);
	}
}
