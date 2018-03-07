package medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LengthOfLongestSubstring {

	public static void main(String[] args) {

		System.out.println(new LengthOfLongestSubstring().lengthOfLongestSubstring("dvdf"));
	}

	int lengthOfLongestSubstring(String s) {

		int size = s.length();
		String[] temp = new String[size];
		HashSet<Character> temp2 = new HashSet<>();
		int i=0;
		int j=0;
		int max = 0;
      
//		for(int i=0;i<size;i++)
//		{
//			if(temp2.contains(s.charAt(i)))
//			{
//				count = 0;
//				temp2.clear();
//			}
//			temp2.add(s.charAt(i));
//			count += 1;
//            if( count > max_c)
//                max_c = count;
//		}
//		return max_c;
		
		while(i<size)
		{
			if(!temp2.contains(s.charAt(i)))
			{
				temp2.add(s.charAt(i++));
				max = Math.max(max, temp2.size());
			}
			else
			{
				temp2.remove(s.charAt(j++));
			}
		}
	
		return max;
		
	}

}
