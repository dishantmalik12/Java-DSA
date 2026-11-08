package arrays;

public class MaxElement {
	public static int findMax(int[] arr)
	{
		if (arr == null || arr.length == 0)
		{
			throw new IllegalArgumentException("Arrays must not be null or empty");
		}
		int max = arr[0];
		for (int num : arr )
		{
			if (num > max)
			{
				max = num;
			}	
		}
		return max;
	}
	
	public static void main(String[] args) {
	int [] arr = { 5, 8, 3, 2, 6, 9};

	System.out.println("max element -"+ findMax(arr));
	

	}

}
