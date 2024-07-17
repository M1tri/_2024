package jun2;

public class K1 implements Comparable<K1> 
{
	int val;
	
	public K1(int v)
	{
		val = v;
	}

	@Override
	public int compareTo(K1 o) 
	{
		if (val > o.val)
			return 1;
		else if (val < o.val)
			return -1;
	
		return 0;
	}
	
	
}
