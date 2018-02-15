
public class MinCostClimbingStairs2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cost[] = {10,15,20};
		  int [] mc = new int[cost.length + 1];
	        mc[0] = cost[0];
	        mc[1] = cost[1];
	        
	        for(int i = 2; i <= cost.length; i++){
	            int costV = (i==cost.length)?0:cost[i];
	            mc[i] = Math.min(mc[i-1] + costV, mc[i-2] + costV);
	        }
	       System.out.println(mc[cost.length]);
	    }
		
}

