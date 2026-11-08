package arrays;

public class MinElements {
	public static int findMin(int[] arr)
	{
		if (arr == null || arr.length == 0)
		{
			throw new IllegalArgumentException("Arrays must not be null or empty");
		}
		int min = arr[0];
		for (int num : arr )
		{
			if (num < min)
			{
				min = num;
			}	
		}
		return min;
	}

	public static void main(String[] args) {
	int [] arr = { 5, 8, 3, 2, 6, 9};

	System.out.println("max element -"+ findMin(arr));

	}

}
