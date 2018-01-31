package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//s = "leetcode"
//return 0.
//
//s = "loveleetcode",
//return 2.

public class FirstUniqueCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new FirstUniqueCharacterInString().firstUniqChar("loveleetcode"));


	}

	int firstUniqChar(String s) {

		Map<Character, Integer> finder = new HashMap();
		for(int i=0;i<s.length();i++)
		{
			if(finder.containsKey(s.charAt(i)))
			{
				finder.put(s.charAt(i), s.length()+3);
			}
			else
			{
				finder.put(s.charAt(i), i);
			}
		}
		for(int i=0;i<s.length();i++)
		{
			if(finder.get(s.charAt(i)) < s.length())
			{
				return i;
			}
		}
		return -1;
	}

}
