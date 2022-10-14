package AMEAR;

public class Trying {
	public void m() {
		try {
			int a=10; 
			int b=0;
			int c=a/b;
			System.out.println(c);
			
		} catch (ArithmeticException  e) {
			System.out.println("Amear");
		}
	}
}
