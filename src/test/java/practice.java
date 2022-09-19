
public class practice {
	public static void main(String[] args) {
		String str= "Password@123";
		if(checkuppercase(str)&&checklowercase(str)&&checklength(str)&&checkspecial(str)&&checknumber(str))
		{
			System.out.println("True");
		}
		else {
			System.out.println("false");
		}
	}


	public static boolean checkuppercase(String s1) 
	{
		boolean status=false;
		char ch[]=s1.toCharArray();
		if(Character.isUpperCase(ch[0]))
		{
			return true;
		}
		return status;
	}


	public static boolean checklowercase(String s1)
	{
		boolean status=false;
		char ch[]=s1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isLowerCase(ch[i]))
			{
				return true;
			}
		}
		return status;
	}


	public static boolean checklength(String s1)
	{
		boolean status=false;
		char ch[]=s1.toCharArray();
		if(s1.length()>=8)
		{
			return true;
		}
		return status;
	}


	public static boolean checkspecial(String s1)
	{
		boolean status=false;
		char ch[]=s1.toCharArray();
		for(int i=0;i<s1.length();i++)
		{
			if(!Character.isAlphabetic(ch[i])&&!Character.isDigit(ch[i]))
			{
				return true;
			}
		}
		return status;
	}


	public static boolean checknumber(String s1)
	{
		boolean status=false;
		char ch[]=s1.toCharArray();
		for(int i=0;i<s1.length();i++)
		{
			if(Character.isDigit(ch[i]))
			{
				return true;
			}
		}
		return status;
	}

}