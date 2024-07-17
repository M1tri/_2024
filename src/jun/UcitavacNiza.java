package jun;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UcitavacNiza 
{
	// prvi se vraca kao povratna vrednost, a poslednji preko MojInteger klase
	public static int GetPrviIDrugi(String fajl, MojInteger val2)
	{
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(fajl);
			br = new BufferedReader(fr);
			
			Integer dim = Integer.parseInt(br.readLine());
			
			if (dim == 0)
				throw new NultiNiz();
			
			int[] arr = new int[dim];
			for (int i = 0; i < dim; i++)
			{
				arr[i] = Integer.parseInt(br.readLine());
			}
			
			int val1 = arr[0];
			
			val2.change(arr[dim-1]);
			
			br.close();
			
			return val1;
			
		} catch (IOException e) {
			System.out.println("Greska pri radu sa fajlom");
		}
		catch (NultiNiz e)
		{
			System.out.println(e.getMessage());
		}
		
		catch (Exception e)
		{
			System.out.println("Nesto je krenulo po zlu");
		}
		finally
		{
			if (br != null)
			{
				try 
				{
					br.close();
					// java je tooooooolko rtd jezik da mora ovako
				} 
				catch (IOException e) 
				{
					System.out.println(e.getMessage());
				}			
			}
		}
		return 0;
	}
}
