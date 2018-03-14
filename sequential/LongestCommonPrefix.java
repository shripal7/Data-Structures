package sequential;

import java.util.Arrays;

//longest common substring
public class LongestCommonPrefix {

	public static void main(String[] args) {

		
		String[] strs = {"ac","aaa","aaba"};
		System.out.println(new LongestCommonPrefix().longestCommonPrefix(strs));
		Arrays.sort(strs);
		for(int i=0;i<strs.length;i++)
		{
			System.out.println(strs[i]);
		}
		
	}
	
String longestCommonPrefix(String[] strs) {
        
	int i;
	if(strs.length == 0)
		return "";
	String com = strs[0];
	StringBuilder temp = new StringBuilder();
	
	int j=0;
	for(i=0;i<strs.length-1;i++)
	{
		
		for(j=0;j<(strs[i].length()>strs[i+1].length()? strs[i+1].length(): strs[i].length());j++)
		{
			if(strs[i].charAt(j) == strs[i+1].charAt(j))
			{
				temp.append(strs[i].charAt(j));
			}
			else
				break;
				
		}
		if(temp.length() == 0)
		{
			return "";
		}
		if(temp.length()<com.length())
		{
			com = temp.toString();
		}
		temp.delete(0,j);
	}
	return com;
    }
}