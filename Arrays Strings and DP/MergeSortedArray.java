package easy;

import java.util.ArrayList;
import java.util.List;

public class MergeSortedArray {

	public static void main(String[] args) {

		int[] nums1 = new int[6];// {1,3,4,6};
		nums1[0] = 3; //{1,2,3,4};
		nums1[1] = 4;
		nums1[2] = 5;
		nums1[3] = 6;
		int[] nums2 = new int[] {1,2};
		new MergeSortedArray().merge(nums1, 4, nums2, 2);
		for(int i=0;i<nums1.length;i++)
			System.out.println(nums1[i]);
	}

	void merge(int[] nums1, int m, int[] nums2, int n) {

		int i = m-1;
		int j = n-1;
		int k= nums1.length-1;
		while(j>=0)
		{
			if( i>=0 && nums1[i] > nums2[j])
			{
				nums1[k] = nums1[i];
				i--;
			}
			else
			{
				nums1[k] = nums2[j];
				j--;
			}
			k--;
		}
		long x = 7;
		int pp = (int) x;
		//System.out.println(parseInt("2147483647",10));
		
		while(j >= 0)
		{
			nums1[k] = nums2[j];
			j--;
			k--;
		}

	}
}
