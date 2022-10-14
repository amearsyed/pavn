package AMEAR;

public class PracticesOcurrance {
	public static void main(String[] args) {
		String s="ameaaaara";
		String str = s.toLowerCase();
		char ch[] =str.toCharArray();
		for(int i=0; i<ch.length;i++) {
			int count=0;
			for(int j=0;j<ch.length;j++) {
				if(ch[i]==ch[j] && i>j) {
					break;

				}
				else if(ch[i]==ch[j]) {
					count++;

				}
			}
			if(count>=1)
			System.out.println(ch[i]+" "+count);
		}
	}

}
