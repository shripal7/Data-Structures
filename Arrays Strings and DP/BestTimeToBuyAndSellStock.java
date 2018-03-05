package easy;



//Input: [7, 1, 5, 3, 6, 4]
//Output: 5
//
//max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)
public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {

		//System.out.println(new BestTimeToBuyAndSell().maxProfit(prices));
		System.out.println(new BestTimeToBuyAndSellStock().maxProfit(new int[] {7, 1, 5, 3, 6, 4}));

	}

	public int maxProfit(int[] prices) {
		int size = prices.length;
		if(size == 0)
			return 0;
		int min=prices[0]; 
		int max = 0;
		int temp;

		for(int i=1;i<size;i++)
		{
			temp = (prices[i] - min)>0? (prices[i] - min): 0;
			if(prices[i] < min )
				min = prices[i];
			if(temp > max && temp!=0)
			{
				max = temp;
			}
		}
		return max;
	}

}
