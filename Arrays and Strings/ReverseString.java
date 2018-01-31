package easy;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(new ReverseString().reverseString("hello"));
	}
	
	String reverseString(String s) {
		
		char[] tempArray = s.toCharArray();
		char[] reversedArray = s.toCharArray();
		for(int i=0;i<tempArray.length;i++)
		{
			reversedArray[i] = tempArray[tempArray.length - i - 1];
		}
		return new String(reversedArray);
		
	    }

}
