package easy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//"A man, a plan, a canal: Panama" is a palindrome.
//"race a car" is not a palindrome.

public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidPalindrome vp = new ValidPalindrome();
		System.out.println(vp.isPalindrome("ab"));
	}

	boolean isPalindrome(String s) {

		String actual = s;
		actual = actual.replaceAll("[[^a-zA-Z0-9]]", "");
		int size = actual.length();
		for(int i=0;i<size/2;i++)
		{
			if(actual.charAt(i) != actual.charAt(size-i-1))
				return false;

		}
		return true;
	}

}
