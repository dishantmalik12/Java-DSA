package arrays;

public class LinearSearch {
	public static int  linearSearch(int[] arr , int target)
	{
		
		int len = arr.length;
		for (int i=0; i<len; i++)
		{
			if (arr[i]==target)
			{
				return i;
			}
		}return -1;
	}
	public static void main(String[] arg)
	{
		int[] arr = { 10, 15, 20, 25, 30 };
		System.out.println(linearSearch(arr, 25));   // 3
		System.out.println(linearSearch(arr, 99));   // -1
	}
}
