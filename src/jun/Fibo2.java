package jun;

public class Fibo2 implements Runnable 
{
	@Override
	public void run()
	{
		stampaj(Thread.currentThread().getName());
	}
	
	private void stampaj(String name)
	{
		long f1 = 0;
		long f2 = 1;
		
		for (long i = 0; i < 100; i++)
		{
			System.out.println(name + " " + f2);
			
			long pom = f2;
			f2 = f1 + f2;
			f1 = pom;
		}
	}

}
