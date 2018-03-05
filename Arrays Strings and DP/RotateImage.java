package easy;

public class RotateImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
			new RotateImage().rotate(matrix);
			System.out.println(matrix.length);
		
	}

	void rotate(int[][] matrix) {
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}

		for(int i =0 ; i<matrix.length; i++){
			for(int j = 0; j<matrix.length/2; j++){
				int temp = 0;
				temp = matrix[i][j];
				matrix[i][j] = matrix[i][matrix.length-1-j];
				matrix[i][matrix.length-1-j] = temp;
			}
		}


	}


}
