import java.sql.Array;

public class MinCostClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {0,0,1,1};
		minCostClimbingStairs(a);
	}
	
public static int minCostClimbingStairs(int[] a) {
	
	int amount = a[0];
	int amount2 = a[1];
	int size = a.length;
	int index;
	for(int i=0;i<size;i++)
	{
		if(i+2<size && a[i+1]<a[i+2]) {
			index = i+1;
			
		}
		else if(i+1 == size-1)
		{
			index = i+1;
		}
		else {
			index = i+2;
		}
		if(index < size)
		{
		amount = amount + a[index];
		}i = index;
	}
	
	for(int i=1;i<size;i++)
	{
		if(i+2<size && a[i+1]<a[i+2]) {
			index = i+1;
			
		}
		else if(i+1 == size-1)
		{
			index = i+1;
		}
		else {
			index = i+2;
		}
		
		if(index < size)
		{
		amount2 = amount2 + a[index];
		}
		i = index;
	}

	System.out.println(amount);
	System.out.println(amount2);
	
	if(amount < amount2)
		return amount;
	else
	return amount2;
        
    }

}
