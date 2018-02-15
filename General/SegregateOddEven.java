//Similar to Quick sort as suggested by SPK
public class SegregateOddEven {

	public static void main(String[] args) {

		Integer a[] = {1,4,3,2,5};
		segregateoddeven(a);
	}
	public static void segregateoddeven(Integer a[]) {
		
		for(int i=-1,j=0; j<a.length;j++) {
			if(a[j]%2 == 0) {
				i++;
				int c = a[j];
				a[j] = a[i];
				a[i] = c;
			}
			
		}
		for(int i: a) {
			System.out.println(""+i);
		}
	}
	
}
