package easy;

public class MaximumSumIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new MaximumSumIncreasingSubsequence().maxSum(new int[] {1,101,2,3,100,4,5}));
		System.out.println("Hey");
	}

	int maxSum(int[] nums)
	{
		
		int size = nums.length;
		int m = nums[0];
		int dp[] = new int[size];
		int i=0;
		int j=0;
		int sum = 0;//nums[0];
		while(i<size)
		{
			j = i+1;
			sum = nums[i];
			while(j<size)
			{
				sum = sum + (nums[j] > nums[i] ?  nums[j]: 0);
				j++;
			}
			if(m < sum)
			{
				m = sum;
			}
			i++;
		}
		return m;
	}
}
