package easy;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RotateArray ra = new RotateArray();
		int[] Array = ra.rotate(new int[] {1,2},1);
		for(int i=0;i<Array.length;i++)
			System.out.println(Array[i]);
		System.out.println("Alternate: ");
		int[] Array2 = ra.rotate3(new int[] {1,2,3,4,5,6,7},3);
		for(int i=0;i<Array2.length;i++)
			System.out.println(Array2[i]);

	}


	public int[] rotate(int[] nums, int k) {
		k = k%(nums.length);
		revereseArray(nums,0,nums.length-1);
		revereseArray(nums, 0, k-1);
		revereseArray(nums, k, (nums.length -1));

		return nums;
	}

	void revereseArray(int arr[], int start, int end)
	{
		int temp;
		if (start >= end)
			return;
		temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		revereseArray(arr, start+1, end-1);
	}



	int[] rotate3(int[] nums, int k)
	{
		k = k % nums.length;
		int count = 0;
		for (int start = 0; count < nums.length; start++) {
			System.out.println("count");
			int current = start;
			int prev = nums[start];
			do {
				int next = (current + k) % nums.length;
				int temp = nums[next];
				nums[next] = prev;
				prev = temp;
				current = next;
				count++;
			} while (start != current);
			
		}

		return nums;

	}
}
