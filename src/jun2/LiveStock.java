package jun2;

public enum LiveStock 
{
	Cow 
	{
		public String GetSound() {return "mooo"; }
	},
	Goat
	{
		public String GetSound() { return "meee"; }
	},
	Pig
	{
		public String GetSound() { return "oink"; }
	},
	Alpaca
	{
		public String GetSound() { return "uh-oh"; }
	};
	
	public abstract String GetSound();
}
