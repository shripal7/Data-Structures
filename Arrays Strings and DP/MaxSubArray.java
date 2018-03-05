package easy;

public class MaxSubArray {

	public static void main(String[] args) {

		
		//System.out.println(new MaxSubArray().maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
		System.out.println(new MaxSubArray().maxSubArray(new int[] {1,2}));
	}
	
	 int maxSubArray(int[] nums) {
	        
		 int max;
		 max = nums[0];
		 int size = nums.length;
		 int sub[] = new int[size];
		 sub[0] = nums[0];
		 for(int i=1;i<size;i++)
		 {
			 sub[i] = nums[i] + (sub[i-1] > 0 ? sub[i-1]: 0);
			max = Math.max(max, sub[i]);
			
			
		 }
		 return max;
	    }

}
