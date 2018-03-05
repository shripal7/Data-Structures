package easy;

import java.util.HashMap;
import java.util.Map;

//
//s = "anagram", t = "nagaram", return true.
//s = "rat", t = "car", return false.
//

public class ValidAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	boolean isAnagram(String s, String t) {
		if(s.length() != t.length())
			return false;
		Map<Character, Integer> first = new HashMap();
		Map<Character, Integer> second = new HashMap();
		for(int i=0;i<s.length();i++)
		{
			if(first.containsKey(s.charAt(i)))
			{
				first.put(s.charAt(i), first.get(s.charAt(i))+1);
			}
			else
			{
				first.put(s.charAt(i), 1);
			}

			if(second.containsKey(t.charAt(i)))
			{
				second.put(t.charAt(i), second.get(t.charAt(i))+1);
			}
			else
			{
				second.put(t.charAt(i), 1);
			}

		}
		if(first.equals(second))
			return true;

		return false;
	}
}
