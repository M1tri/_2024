package jun;

public class FibonaciMatrica 
{
	public static int[][] FibonaciMat(int n)
	{
		int[][] fib = new int[n][];	
		
		for (int i = 0; i < n; i++)
		{
			if (i == 0)
			{
				fib[i] = new int[1];
				fib[i][0] = 1;
			}
			else if(i == 1)
			{
				fib[i] = new int[2];
				fib[i][0] = 1;
				fib[i][1] = 1; 
			}
			else
			{
				int len = fib[i-1].length + 1;
				fib[i] = new int[len];
				for (int j = 0; j < len - 1; j++)
				{
					fib[i][j] = fib[i-1][j];
				}
				fib[i][len-1] = fib[i][len - 2] + fib[i][len - 3];
			}
		}
		
		return fib;
	}
}
