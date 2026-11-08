package arrays;

public class AverageofArray {
	public static double findAvg(int[] arr)
	{
		 if (arr == null || arr.length == 0) {
	            throw new IllegalArgumentException("Array must not be null or empty");
	        }
		 long sum =0 ;
		 for (int num:arr)
			{
				sum +=num ;
			}
		 int numOfElement = arr.length;
		
		 return (double)sum/numOfElement;
			

	}

	public static void main(String[] args) {
		  int[] arr = { 1, 2, 3, 4 };
	        System.out.println("Average = " + findAvg(arr));

	}

}
