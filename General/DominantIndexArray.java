
public class DominantIndexArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {2,5,1,0,3};
		dominantIndex(a);
		
	}

public static int dominantIndex(int[] nums) {
	int max = nums[0];
	int index = 0;
	for(int i=1; i< nums.length; i++)
	{
		if(nums[i]>max)
		{
			max = nums[i];
			index = i;
		}
	}
	for(int i=0; i< nums.length; i++)
	{
		if(i!=index) {
			nums[i] = nums[i] * 2;
		}
	}
	
	for(int i=0;i<nums.length;i++)
	{
		if(nums[i] > max) {
			return -1;
		}
	}
	return index;
        
    }
}
