package easy;

public class MaximumSubArray {

	public static void main(String[] args) {

		System.out.println(new MaximumSubArray().maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
	}

	int maxSubArray(int[] nums) {
		
		int size = nums.length;
		int i;
		int[] temp = new int[size];
		temp[0] = nums[0];
		int max=nums[0];
		for(i=1;i<size;i++)
		{
			temp[i] = (temp[i-1]>0? temp[i-1]+nums[i]:nums[i]);
			System.out.println("temp:"+temp[i]);
			if(temp[i]>max)
			{
				max = temp[i];
			}
		}
		
		return max;
	}
	
}
