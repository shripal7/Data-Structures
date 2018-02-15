
public class PalindromeWithoutExtraSpace {
	
	public static void main(String[] args) {
		
		System.out.println(checker(123,0));
		
	}
	

	public static int checker(int num, int part)
	{
		if(num/10.0 != 0)
		{
			//if()
			part = part*10 + (num%10);
			num = num/10;
			return checker(num,part);
		}		
		return part;
	}
}
