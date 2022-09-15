package GenericLibrary;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileUtility {
	public String readdatafromproperty(String key) throws Exception
	{
		FileInputStream fis =new FileInputStream(Ipathconstant.PROPERTYFILEPATH);
		Properties p=new Properties();
		p.load(fis);
		 String value=p.getProperty(key);
		 return value;
		
		
	}

}
