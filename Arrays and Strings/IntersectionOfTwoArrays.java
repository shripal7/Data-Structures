package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

//1,2,2,1 && 2,2 => 2,2
public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		
		int[] output = new IntersectionOfTwoArrays().intersect2(new int[] {1,2,2,1}, new int[] {2,2});
		for(int i: output)
		{
			System.out.println(i);
		}

	}


	public int[] intersect(int[] nums1, int[] nums2) {
		HashMap <Integer, Integer> objMap = new HashMap<Integer, Integer>();
		ArrayList <Integer> objArray = new ArrayList <Integer>();

		for (int i : nums1) {
			if(objMap.get(i) == null) {
				objMap.put(i, 1);
			} else {
				objMap.put(i, objMap.get(i) + 1);
			}
		}

		for (int j : nums2) {
			if(objMap.get(j) != null && objMap.get(j) > 0) {
				objArray.add(j);
				objMap.put(j, objMap.get(j) - 1);
			}
		}
		return objArray.stream().mapToInt(Integer::intValue).toArray();
	}
	
	public int[] intersect2(int[] num1, int[] num2)
	{
		Arrays.sort(num1);
		Arrays.sort(num2);
		int n1 = 0, n2 = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(n1 < num1.length && n2 < num2.length)
		{
			if(num1[n1] < num2[n2])
				n1++;
			else if(num1[n1] > num2[n2])
				n2++;
			else
			{
				list.add(num1[n1]);
				n1++;
				n2++;
			}
		}
		
		return list.stream().mapToInt(Integer:: intValue).toArray();
	}
}
