package easy;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new RemoveDuplicatesFromSortedArray().removeDuplicates(new int[] {1, 2, 3, 3, 4, 4}));
	}

	public int removeDuplicates(int[] nums) {

		int j=0;
		int i;
		 if(nums.length == 0)
	            return 0;
		int dup = 1;
		for(i=0;i<nums.length-1;i++)
		{
			if(nums[i] != nums[i+1])
			{
				nums[j++] = nums[i]; 
				dup++;
			}
			
		}
		nums[j] = nums[nums.length - 1];
		
		return dup;
	}

}
