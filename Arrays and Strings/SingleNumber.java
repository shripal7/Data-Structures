package easy;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	int singleNumber(int[] nums) {

		Map<Integer, Integer> id = new HashMap();
		int count;
		for(int i: nums)
		{
			if(id.containsKey(i))
			{
				id.remove(i);
			}
			else
			{
				id.put(i, 1);
			}
		}
		
		return -1;//mapToInt(Integer::id);
	}
}
