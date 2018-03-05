package easy;

public class MinCostClimbingStairs {

	public static void main(String[] args) {

		System.out.println(new MinCostClimbingStairs().minCostClimbingStairs(new int[] {10,15,20}));
	}

	int minCostClimbingStairs(int[] a) {
		int size = a.length;
		int temp[] = new int[size];
		int i=0;
		temp[0] = a[0];
		temp[1] = a[1];
		for(i=2;i<size;i++)
		{
			temp[i] = a[i] + (temp[i-2] < temp[i-1] ? (temp[i-2]): temp[i-1]);
		}
		return temp[i-1]>temp[i-2]?temp[i-2]: temp[i-1];
	}

}
