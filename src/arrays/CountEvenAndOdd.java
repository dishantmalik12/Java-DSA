package arrays;

public class CountEvenAndOdd {
	
	public static int[] findEvenOdd(int[] arr){
		int countEven = 0;
		int countOdd = 0;
		for (int num:arr)
		{
			if (num%2==0)
			{
				countEven ++;
			}
			else
			{
				countOdd ++;
			}
		}
		return new int[] {countEven , countOdd};
		
	}
	public static void main(String[] args) {
	int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
	int[] result = findEvenOdd(arr);	
	 System.out.println("Even count - "+ result[0]);
	 System.out.println("odd count - "+ result[1]);
	}

}
