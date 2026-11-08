package arrays;

public class CountPositiveNegativeAndZero {
	public static int[] countPosNegZero(int[] arr)
	{
		int Pos = 0;
		int Neg = 0;
		int Zero = 0;
		for (int num:arr)
		{
			if (num<0)
			{
				Pos++;
			}
			else if (num>0)
			{
				Neg++;
			}
			else
			{
				Zero++;
			}
		}
		return new int[] {Pos , Neg , Zero};
	}
	public static void main(String[] args) 
	{
		int[] r = countPosNegZero(new int[] { 5, -3, 0, 8, -1, 0, 2 });
		System.out.println(" positive-"+r[0] + " negative-" + r[1] + " Zero-" + r[2]);   // 3 2 2
		
	}
}
