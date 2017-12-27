package CTCi;

import java.util.HashMap;
import java.util.Map.Entry;

public class PalindromePermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String x = "taco Catw";
			String x_mod = x.trim().toLowerCase().replace(" ", "");
			HashMap<Character, Integer> x_storage = new HashMap();
			for(int i=0;i<x_mod.length();i++)
			{
				//System.out.println();
				if(x_storage.get(x_mod.charAt(i))!=null)
				{
					int count = x_storage.get(x_mod.charAt(i)) + 1;
					//System.out.println("He");
					
					x_storage.put(x_mod.charAt(i), count);
				}
				else
				{
					x_storage.put(x_mod.charAt(i), 1);
				}
				
			}
			int c = 0;
	
			 for (Entry<Character, Integer> me : x_storage.entrySet()) {
		        //  System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
				 if(me.getValue()%2 != 0)
				 {
					 c++;
					 if(c>1)
					 {
						 
						 System.out.println("Not Palindrome String");
						return ;
					 }
				 }
				 
		        }
			 System.out.println("Palindrome String");
	}

}
