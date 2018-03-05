package easy;

public class ClimbingStairs {

	public static void main(String[] args) {

		System.out.println(new ClimbingStairs().climbStairs(4));
	}

	int climbStairs(int n) {
		if(n < 2)
			return 1;
		
		int[] max = new int[n];
		max[0] = 1;
		max[1] = 2;
		int i;
		for(i=2;i<n;i++)
		{
			max[i] = max[i-1]+max[i-2];
		}
		return max[i-1];
	}
}
