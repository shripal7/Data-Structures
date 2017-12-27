package CTCi;

import java.util.HashMap;

public class CheckPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x1 = "abcd";
		String x2 = "bace";
		if(x1.length()!=x2.length())
		{
			System.out.println("Not permutation");
			//return from here
		}
		HashMap<Character, Integer> x1_storage = new HashMap();
		HashMap<Character, Integer> x2_storage = new HashMap();
		
		for(int i=0;i<x1.length();i++)
		{
			if(x1_storage.get(x1.charAt(i))!=null)
				{
						int count = x1_storage.get(x1.charAt(i));
						x1_storage.put(x1.charAt(i),count++);
				}
			else
			{
				x1_storage.put(x1.charAt(i), 1);
			}
			if(x2_storage.get(x2.charAt(i))!=null)
			{
				int count = x2_storage.get(x2.charAt(i));
				x2_storage.put(x2.charAt(i),count++);
			}
			else
			{
				x2_storage.put(x2.charAt(i), 1);
			}
			
		}
		
		if(x1_storage.equals(x2_storage)) {
			System.out.println("Permutation");
			return ;
		}
		else
		{
			System.out.println("Not permutation");
		}
	}

}
