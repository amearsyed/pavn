package pavansir;

public class Practicesss {
	public static void main(String[] args) {
//		int num=30;
//		for(int i=1;i<=30;i++)
//		{
//			int count=0;
//			for(int j=1;j<=30;j++)
//			{
//			if(i%j==0)
//			{
//				count++;
//			}
//		}
//		if(count==2)
//		{
//			System.out.println(i);
//		}
//	}
//	
//		int num=473;
//		int rem=0;
//		int temp=num;
//		int rev=0;
//		while(num>0)
//		{
//			 rem=num%10;
//			 rev=rev*10+rem;
//			 num=num/10;
//		}
//		if(temp==rev)
//		{
//			System.out.println("temp is a palindrome");
//		}
//		else
//		{
//			System.out.println("temp not is a palindrome");
//
//		}
//		
		
//	int a[]= {6,9,1,3,2};
//	int temp;
//	for(int i=0;i<a.length;i++)
//	{
//		for(int j=i+1;j<a.length;j++)
//		{
//			if(a[i]>a[j])
//			{
//				temp=a[i];
//				a[i]=a[j];
//				a[j]=temp;
//			}
//		}	
//	}
//		
//		for(int i=0; i<a.length;i++) {
//			System.out.println(a[i]+" ");
//		}
//		
//	
		
//		String str="the sun rises in the east";
//		String s[]=str.split(" ");
//		String res="";
//		for(String str1:s)
//		{
//			String str2 = str1.substring(0,1).toUpperCase();
//			String str3=str1.substring(1).toLowerCase();
//			 res=res+str2+str3+" ";
//		}
//		
//			System.out.println(re);
		
		
		String s="i am the god";
		String str[]=s.split(" ");
		String rev="";
		for(int i=str.length-1;i>=0;i--)
		{
			rev=rev+" "+str[i]+" ";
		}
		System.out.println(rev);	
		
	}
}
