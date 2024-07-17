package jun2;

import java.util.ArrayList;

public class K2 
{
	ArrayList<K1> lista;
	
	public K2()
	{
		lista = new ArrayList<K1>();
	}
	
	public void Add(K1 k)
	{
		lista.add(k);
	}
	
	public void Sortiraj()
	{
		lista.sort(null); // null znaci da ce koristi ono CompareTo da sortira
	}
}
