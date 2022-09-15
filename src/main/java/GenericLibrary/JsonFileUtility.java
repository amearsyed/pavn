package GenericLibrary;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;

public class JsonFileUtility {
	public String jsonfile(String key) throws Exception
	{
    FileReader fr=new FileReader(Ipathconstant.JSONFILEPATH);
		
		JSONParser jp=new JSONParser();
		Object obj=jp.parse(fr);
		
		HashMap hp=(HashMap)obj;
		String value = (String)hp.get(key);
		return value;
	}

}
