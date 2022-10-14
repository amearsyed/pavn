package GenericLibrary;

import java.util.Date;
import java.util.Random;

public class Javautility {
	public static int generateRandomNumber()
	{
		Random r=new Random();
		int random=r.nextInt(1000);
		return random;
	}
	public static String dated() {
		Date currentDate =new Date();
		String date=currentDate.toString();
		System.out.println(date);
		
		 String str []=date.split(" ");
		 String date1=str[2];
		 String month=str[1];
		 String year=str[3];

		
		
		
		return date1+" "+month+" "+year;
		
		
		
	}
	public static int readdatafromex(String string, int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}

}