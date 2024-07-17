package jun;

public class MojInteger 
{
	private int value;
	
	public MojInteger(int value) {this.value = value;}
	
	public void change(int newValue) {this.value = newValue;}
	
	@Override
	public String toString()
	{
		return String.valueOf(value);
	}
}
