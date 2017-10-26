package CTCI;

import java.util.HashMap;

/* given two string, check permutation */
public class CheckPermutationString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new CheckPermutationString().permutation("abra","raaa"));
	}
	
	public boolean permutation(String a, String b)
	{
		if(a.length() == b.length())
		{
			int i;
			//HashMap<, Integer> a_store = new HashMap<>();
			HashMap a_store = new HashMap<>();
			HashMap b_store = new HashMap<>();
			for( i=0;i<a.length();i++)
			{
				//a_store.add(a[i],1);
				if(a_store.get(a.charAt(i)) != null)
				{
				int count = (int) a_store.get(a.charAt(i));
				a_store.put(a.charAt(i), count++);
				}
				else
				{
					a_store.put(a.charAt(i), 1);
				}
				 	 	
				if(b_store.get(b.charAt(i)) != null)
				{
				int count = (int) b_store.get(b.charAt(i));
				b_store.put(b.charAt(i), count++);
			}
				else
				{
					b_store.put(b.charAt(i), 1);
				}
			
		}
			if(a_store.equals(b_store))
			{
				System.out.println("Same String");
			}
			else {
				System.out.println("Not permutation!");
			}
		}
		else
			System.out.println("Not permutation!");
		return true;
	}

}
