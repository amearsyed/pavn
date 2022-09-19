package AMEAR;

public class Swaping {
	public static void main(String[] args) {
		String s1="black";
		String s2="white";
		s1=s1+s2;
		s2=s1.substring(0, s1.length()-s2.length());
		System.out.println(s2);
		s1=s1.substring(s2.length());
		System.out.println(s1);
	}

}
