package jun;

public class Fibo extends Thread 
{
	@Override
	public void run()
	{
		stampaj();
	}
	
	private void stampaj()
	{
		long f1 = 0;
		long f2 = 1;
		
		for (long i = 0; i < 100; i++)
		{
			System.out.println(this.getName() + " " + f2);
			
			long pom = f2;
			f2 = f1 + f2;
			f1 = pom;
		}
	}

	
}
