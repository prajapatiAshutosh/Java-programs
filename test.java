// Java code for thread creation by extending
// the Thread class
import java.io.FileWriter;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

class printingEven extends Thread {
	public void run(int ar[])
	{

		try {
			// Displaying the even integer to console
			System.out.println("Displaying Even Integer to console!!");
			for (int i=0;i<ar.length;i++ ) 
			{
				if (ar[i]%2==0) {
					System.out.println(ar[i]+" ");
				}	
			}
		}
		catch (Exception e) {
			// Throwing an exception
			System.out.println("Exception is caught");
		}
	}
}

class writeOdd extends Thread {
	public void run(int ar[])
	{
		try {
			// Writing odd number to output.txt
			System.out.println("Writing Odd number to output.txt!!");
			FileWriter fw=new FileWriter("output.txt");
			for (int i=0;i<ar.length;i++ ) 
			{
				if (ar[i]%2==1) {
					fw.write(ar[i]+" ");
				}	
			}
			fw.close();
		}
		catch (Exception e) {
			// Throwing an exception
			System.out.println("Exception is caught");
		}
	}
}

// Main Class
public class test {
	public static void main(String[] args)
	{
//		Scanner kb = new Scanner(System.in);
//		System.out.print("Enter the size of array: ");
//		int size=kb.nextInt();
//		System.out.println("Enter the integer in the array: ");
//		int ar[] = new int[size];
//		for (int i=0;i<size ;i++ )
//		{
//			ar[i]=kb.nextInt();
//
//		}
//		printingEven thread1 = new printingEven();
//		thread1.run(ar);
//		thread1.start();
//		writeOdd thread2 = new writeOdd();
//		thread2.run(ar);
//		thread2.start();

	}
}
