package Udemy;

public class BinarySearchIterative {

	public int search(int[] a, int s, int l, int elem)
	{
		while(s <= l)
		{
			int m = (s + l)/2;
			if(a[m] == elem)
				return m;
			if(a[m] > elem)
			{
				l = m-1;
				System.out.println("here"+ a[m]);
			}
			else
			{
				s = m+1;
				
			}
			
		}
		return -1;
	}
	
	
}
