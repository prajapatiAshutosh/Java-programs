package p1;

public abstract class Shape
{
	public abstract void area();

}

package p2;
import p1.*;

public class Rectangle extends Shape
{
	int length=0;
	int breadth=0;

	public Rectangle(int l,int b)
	{
		length = l;
		breadth = b;
	}

	public void area()
	{
		System.out.println("The area of the Rectangle is: "+(length*breadth));
	}
}

package p3;
import p1.*;

public class Circle extends Shape
{
	int radius=0;

	public Circle(int r)
	{
		radius=r;
	}

	public void area()
	{
		System.out.println("The area of the circle is: "+(double)(3.14*radius*radius));
	}
}

package p;
import p1.*;
import p2.*;
import p3.*;
import java.util.Scanner;

class Demo
{
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Choose the shape: \n1.Rectangle\n2.Circle");
		int choice = kb.nextInt();
		Shape obmain;
		switch(choice)
		{
			case 1: Rectangle obrec = new Rectangle(3,4);
			        obmain = obrec;
			        obmain.area();
			        break; 
			case 2: Circle obcir = new Circle(3);
			        obmain = obcir;
			        obmain.area(); 
			        break;
			default: System.out.println("You have chose wrong option...");
		}
		
	}
}