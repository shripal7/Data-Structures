package easy;

public class BestTimeToBuyAndSell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new BestTimeToBuyAndSell().maxProfit(new int[] {2,2,5}));
	}

	public int maxProfit(int[] prices)
	{
		int max=0;
		for(int i=0;i<prices.length-1;i++)
		{
			for(int j=i+1;j<prices.length;j++)
			{
				if( max < (prices[j] - prices[i]))
				{
					max = prices[j] - prices[i];
				}
				
			}
		}
		return max;
	}
	
	public int maxProfit2(int[] prices)
	{
		int max=0;
		for(int i=0;i<prices.length;i++)
		{
			
		}
		return -1;
	}
}
