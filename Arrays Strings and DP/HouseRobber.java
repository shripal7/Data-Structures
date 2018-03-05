package easy;

public class HouseRobber {

	public static void main(String[] args) {

		System.out.println(new HouseRobber().rob(new int[] {35,45,95,80,20,40}));
		System.out.println(new HouseRobber().rob(new int[] {}));
		System.out.println(new HouseRobber().rob(new int[] {1,3,1}));
		System.out.println(new HouseRobber().rob(new int[] {2,1,1,1}));
		System.out.println(new HouseRobber().rob(new int[] {2,1,1,2}));
		System.out.println(new HouseRobber().rob(new int[] {1,1,2,1}));
	}

	int rob(int[] nums) {
		int size = nums.length;
		if(size == 0)
			return 0;
		else if(size == 1)
			return nums[0];
		int[] temp = new int[size];
		int i;
		temp[0] = nums[0];
		temp[1] = nums[1];
		if(size == 2)
		{
			return Math.max(nums[0], nums[1]);	
		}
		temp[2] = (Math.max(nums[0]+nums[2], nums[1]));
		 if(size == 3)
		{
			return temp[2];
		}
		for(i=3;i<size;i++)
		{
			temp[i] = Math.max(temp[i-1], nums[i] + Math.max(temp[i-2], temp[i-3])); 
			
		}
		return temp[i-1];
	}
}
