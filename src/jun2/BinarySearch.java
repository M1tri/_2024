package jun2;

public class BinarySearch 
{
	public static int SearchReukurzivno(int[] niz, int el) throws Exception
	{
		return SearchReukurzivno(niz, el, 0, niz.length);
	}
	
	private static int SearchReukurzivno(int[] niz, int el, int left, int right) throws Exception
	{
		if (left > right)
			throw new Exception("Nema ga");
		
		int middle = (left + right) / 2;
		
		if (niz[middle] == el)
			return middle;
		else if (niz[middle] < el)
		{
			return SearchReukurzivno(niz, el, middle + 1, right);
		}
		else
		{
			return SearchReukurzivno(niz, el, left, middle - 1);
		}
	}
	
	
	public static int SearchNeRekurzivno(int[] niz, int el) throws Exception
	{
		int left = 0;
		int right = niz.length - 1;
		
		while (left <= right)
		{
			int middle = (left + right) / 2;
			
			if (niz[middle] == el)
				return middle;
			else if(niz[middle] < el)
			{
				left = middle + 1;
			}
			else
			{
				right = middle - 1;
			}
		}
		
		throw new Exception("Nema ga!");
	}
	
}
