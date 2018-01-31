package easy;

public class MoveZeroes {

	public static void main(String[] args) {
		int[] nums = new int[] {0,1,0,1};
		new MoveZeroes().moveZeroes(nums);
		for(int i: nums)
		{
			System.out.println(i);
		}
	}

	void moveZeroes(int[] nums) {

		int k=0;		
		int j=0; 
		int temp; 
		boolean x = true;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i] == 0)
			{
				//swap with non empty number
				k = i;
				while(i < nums.length && nums[i]==0)
				{
					i++;
				}
				if(i>k && i < nums.length)
				{
					temp = nums[i]; //usually zero. But taking generic case for any other number is useful
					nums[i] = nums[k];
					nums[k] = temp;
					i = k;
				}

			}
		}
	}

}