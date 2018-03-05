package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[] = new PlusOne().plusOne(new int[] {9,9});
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
			
	}

	int[] plusOne(int[] digits) {

		ArrayList<Integer> al = new ArrayList();
		int carry=1;
		int sum=0;
		for(int i=digits.length-1;i>=0;i--)
		{
			sum = digits[i]+carry;
			if(sum > 9)
			{
				al.add(sum%10);
				carry = sum/10;
			}
			else
			{
				al.add(sum);
				carry=0;
			}
		}
		if(carry > 0)
		{
			al.add(carry);
		}
		Collections.reverse(al);
		return al.stream().mapToInt(Integer::intValue).toArray();
	}

	int[] plusOne2(int[] digits) {

		ArrayList<Integer> al = new ArrayList();
		int carry=1;
		int sum=0;
		int transformed[] = new int[digits.length];
		for(int i=digits.length-1;i>=0;i--)
		{
			transformed[i] = digits[i]+carry;
			if(sum > 9)
			{
				digits[i] = digits[i] + carry;
				carry = digits[i]/10;
			}
			else
			{
				transformed[i] = digits[i];
				carry=0;
			}
		}
		if(carry > 0)
		{
			transformed[digits.length] = carry;
		}
		Collections.reverse(al);
		return al.stream().mapToInt(Integer::intValue).toArray();
	}

}
