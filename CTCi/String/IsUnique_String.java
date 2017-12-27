package CTCi;

import java.util.HashMap;

public class IsUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x = "abcde";
		HashMap<Character, Integer> checker = new HashMap();
		for(int i=0;i<x.length();i++)
		{
			if(checker.get(x.charAt(i))!=null)
			{
				System.out.println("duplicate: "+x.charAt(i));
				return ;
			}
			else
				checker.put(x.charAt(i), 1);
			
		}
		
	}
	

}
