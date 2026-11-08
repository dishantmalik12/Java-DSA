package arrays;

public class SumOfArray {
	public static long findSum(int[] arr)
	{
		if (arr==null || arr.length == 0)
		{
			throw new IllegalArgumentException("array must not be null");	
		}
		long sum =0 ;
		
		for (int num:arr)
		{
			sum +=num ;
		}
		return sum;
		
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println("Sum of all Element =" + findSum(arr));

	}

}
