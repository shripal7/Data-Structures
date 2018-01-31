package Udemy;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = selectionSort(new int[] {9, 3, 5, 6, 1, 2});
		for(int i=0;i<myArray.length;i++)
		{
			System.out.println(""+myArray[i]);
		}
		
	}

	int[] selectionSort(int[] is) {
		int min;
		int temp;
		for(int i=0;i<is.length;i++)
		{
			min = i;
			for(int j=i+1;j<is.length;j++)
			{
				if(is[min] >= is[j])
				{
					min = j;
				}
			}
			temp = is[min];
			is[min] = is[i];
			is[i] = temp;
		}
		return is;
	}

}
