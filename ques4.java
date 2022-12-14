import java.util.Scanner;

class underage extends Exception
{
	public underage(int age)
	{
		System.out.println("UnderAge: "+age);
	}
}

class exceptiondemo
{
	public static void test(int age)
	{
		try
		{
			if(age<18)
				throw new underage(age);
			else
				System.out.println("Valid Age");
		}
		catch(underage e)
		{
			System.out.println("Exception type: "+e);
		}
	}

	public static void main(String[] args) 
	{
		int age;
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the age: ");
		age=kb.nextInt();
		test(age);
		return;
	}
}