package string_injava;

public class array2d {

	public static void main(String[] args) {
		int worldcase[][]= { {23,45,4},
							{34,53,66,789,98},
							{24,345,45}};
		System.out.println(worldcase[0]);
		for(int i=0;i<worldcase.length;i++)
		{
			for(int j=0;j<worldcase[i].length;j++)
			{
				System.out.print(worldcase[i][j] + " ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		//Enhance for loop in 2d array
		for(int[] array: worldcase) {
			for(int element: array)
			{
				System.out.print(element+ " ");
			}
			System.out.println(" ");
		}
		int arr[][]=new int[5][];
		arr[0]=new int[4];
		arr[1]=new int[2];
		arr[2]=new int[3];
		arr[3]=new int[3];
		arr[4]=new int[4];
		
		System.out.println(" ");
		
		for(int[] array: arr) {
			for(int element: array)
			{
				System.out.print(element+ " ");
			}
			System.out.println(" ");
		}
	}
}