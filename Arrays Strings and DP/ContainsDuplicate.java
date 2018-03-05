package easy;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
	
	public static void main(String[] args) {
		
	}

	boolean containsDuplicate(int[] nums) {
        
		Map<Integer, Boolean> mp = new HashMap();
		for(int i=0;i<nums.length;i++)
		{
			if(mp.containsKey(nums[i]))
			{
				return true;
			}
			else
			{
				mp.put(nums[i], true);
			}
		}

		return false;
    }
}

