package easy;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		
		System.out.println(new SubArrayWithGivenSum().subArray(new int[] {1,2,3,4,5,6,7,8,9,10}, 15));
		System.out.println(new SubArrayWithGivenSum().subArray(new int[] {1,2,3,7,5},8));
	}
	
	boolean subArray(int[] nums, int res)
	{
		int size = nums.length;
		int[] sub = new int[size];
		sub[0] = nums[0];
		int temp = nums[0];
		for(int i=1;i<size;i++)
		{
			sub[i] = (sub[i-1]+nums[i] <= res ? sub[i-1]+nums[i]: nums[i]);
			if(sub[i] == res)
			{
				return true;
			}
			
		}
		return false;
	}
}


