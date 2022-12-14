import java.util.Scanner;

public class stack
{
	public static void main(String[] args)throws Exception
	{
		Scanner kb = new Scanner(System.in);
		int n, counter = -1,choice =1;
		String str;
		System.out.println("Enter the size of the stack: ");
		n = kb.nextInt();
		int arr[] = new int [n];

		try
		{
			for(;choice!=3;)
			{
				System.out.println("1.Push\n2.Pop\n3.Exit\nEnter the choice: ");
				choice = kb.nextInt();
				switch(choice)
				{
					case 1: if(counter!=arr.length)
					        {
					        	System.out.println("Enter the element to push in the stack: ");
					            n = kb.nextInt();
					            arr[++counter]=n;
					        }
					        else
					        	throw new Exception("overflow");
					        break;
					case 2: if(counter!=-1)
				            {
				            	System.out.println("The element popped out is: "+arr[counter--]);						
					        }
					        else
					        	throw new Exception("underflow");
					        break;
					case 3: System.out.println("Program executed succesfully without any error....");
					        break;
					default: System.out.println("You have chose a wrong choice.....");        
				}
			}
		}

		catch(Exception e)
		{
			System.out.println("Exception occured...");
		}
	}
} 