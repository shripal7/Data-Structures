import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;

public class FindRestaurant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] x1 = {"vacag","KFC"};
				String[] x2 = {"fvo","xrljq","jrl","KFC"};
				System.out.println(new FindRestaurant().findRestaurant(x1, x2).length);
		
	}
	
	 public String[] findRestaurant(String[] list1, String[] list2) {
	      HashMap<String, Integer> h1 = new HashMap<>();
		 for(int i=0;i<list1.length;i++)
		 {
		if(!h1.containsKey(list1[i]))	 
		{
			h1.put(list1[i], i);
		}
		 }
		 
		 int min = list1.length + list2.length;
		 HashMap<String, Integer> h2 = new HashMap();
		 java.util.List<String> x3 = new ArrayList();
		 for(int i=0;i<list2.length;i++)
		 {
			 
			 if(h1.containsKey(list2[i]))
			 {
				 h1.put(list2[i], i+ h1.get(list2[i]));
				 if(min > h1.get(list2[i]))
				 {
					 min = h1.get(list2[i]);
					 x3 = new ArrayList();
					 x3.add(list2[i]);
				 }
				 else if(min == h1.get(list2[i]))
				 {
					 x3.add(list2[i]);
				 }
			 }
			
		 }
	 
		 return x3.toArray(new String[x3.size()]);
	    }

}
