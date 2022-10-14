package Testyantra;

public class Practice {
	public static void main(String[] args) {
		String s="Amear";
		int count=0;
		 String str=s.toLowerCase();
		for(int i=0; i<str.length();i++)
		{
			char ch=str.charAt(i);
		
			if(ch=='a'|| ch=='e'||  ch=='i'|| ch=='o'|| ch=='u') {
				count++;	
			}
		}
		if(count>=11) 
			System.out.println(count);
	
	}
}
