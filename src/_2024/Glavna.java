package _2024;

import jun.*;
import jun2.BinarySearch;
import jun2.LiveStock;

public class Glavna 
{
	public static void main(String[] args)
	{
		// Jun
		
		int[][] fibMat = jun.FibonaciMatrica.FibonaciMat(10);
		
		for (int i = 0; i < fibMat.length; i++)
		{
			for (int j = 0; j < fibMat[i].length; j++)
				System.out.print(fibMat[i][j] + " ");
			System.out.println();
		}
		
		MojInteger val2 = new MojInteger(0);
		int val1 = jun.UcitavacNiza.GetPrviIDrugi("niz.txt", val2);
		
		System.out.println(val1 + " " + val2);
		
		Thread fibo1 = new Fibo();
		fibo1.start();
		
		try {
			fibo1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		// ispadnu negativne brojke pred kraj jer brojevi postanu preveli za 64-bitni long
		// pa overflowuje
		
		Thread fibo2 = new Thread(new Fibo2());
		
		fibo2.start();
		
		try {
			fibo2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Jun
		
		
		
		// Jun2
		
		LiveStock svinja = LiveStock.Pig;
		LiveStock krava = LiveStock.Cow;
		
		System.out.println(svinja.GetSound() + " " + krava.GetSound());
		
		int[] niz = {1, 4, 6, 7, 10, 16, 24, 27, 36, 44, 60};
		
		int index;
		int el = 16;
		try 
		{
			index = BinarySearch.SearchReukurzivno(niz, el);		
			
			System.out.println(index);
			
			index = BinarySearch.SearchNeRekurzivno(niz, el);
			
			System.out.println(index);

		} catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		
		
		
		
		// Jun2
		
		
		
		
		
		
		
	}
}
