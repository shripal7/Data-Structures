package easy;

import java.math.BigInteger;

//Input: 123
//Output:  321
//Example 2:
//
//Input: -123
//Output: -321
//Example 3:
//
//Input: 120
//Output: 21

public class ReverseInteger {

	public static void main(String[] args) {
		
		System.out.println(new ReverseInteger().reverse(0));
	}
	
int reverse(int x) {
		
		
		int re=0;
		int proxy = x;
		int count = 0;
		while(x != 0)
		{
			re = re*10 + x%10;
			count++;
			x = x/10;
		}
		if(proxy!=0 && proxy%10 != re/(int)(Math.pow(10, count-1)))
		{
			return 0;
		}

        return re;
        
    }
}
