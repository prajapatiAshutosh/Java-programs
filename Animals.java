public abstract class Animals
{
	public abstract void cats();
	public abstract void dogs();
}

class Cats extends Animals
{
	public void cats()
	{
		System.out.println("Cats meow");
	}

	public void dogs(){}
}

class Dogs extends Animals
{
	public void cats(){}
	public void dogs()
	{
		System.out.println("Dogs bark");
	}
}

class demo
{
	public static void main(String[] args) 
	{
		Cats ob1 = new Cats();
		Dogs ob2 = new Dogs();
		ob1.cats();
		ob2.dogs();
		
	}
}