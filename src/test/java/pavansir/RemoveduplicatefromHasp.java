package pavansir;

import java.util.HashSet;

public class RemoveduplicatefromHasp {
	public static void main(String[] args) {
		String s[]= {"java",".net","java","csharp"};
		HashSet<String>hs=new HashSet<String>();
		for(String str:s)
		{
			if(hs.add(str))
			{
				System.out.println(str);	
			}
		}
		System.out.println("kjb v");


	}
}