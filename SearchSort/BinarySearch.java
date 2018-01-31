package Udemy;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int binarysearch(int[] a, int small, int large, int elem)
	{
		int mid = 0;
		mid = (small + large)/2;
		int count = 0;
		if(small <= large)
		{
			if(a[mid] == elem)
			{
				return mid;
			}
			if(a[mid] < elem)
			{
				return binarysearch(a, mid+1, large, elem);
			}
			return binarysearch(a, small, mid-1, elem);
		}
		return -1;

	}
}
