import java.util.Scanner;

class complex
{
	int x;
	int y;

	complex()
	{
		x=0;
		y=0;
	}
    
    public void input()
    {
    	Scanner kb=new Scanner(System.in);		
    	System.out.println("Enter the real part:");
    	x=kb.nextInt();
    	System.out.println("Enter the imaginary part:");
    	y=kb.nextInt();
    	return;

    }

    public complex addition(complex c)
    {
        complex temp=new complex();
        temp.x=x+c.x;
        temp.y=y+c.x;
        return temp;
    }

    public complex multiplication(complex c)
    {
        complex temp=new complex();
        temp.x=((x*c.x)-(y*c.y));
        temp.y=((x*c.y)+(y*c.x));
        return temp;
    }

    public void tostring()
    {
    	System.out.println(x+"+"+y+"i");
    	return;
    }

	public static void main(String[] args) 
	{
		complex c1=new complex();
		complex c2=new complex();
        complex out=new complex();
        System.out.println("Enter the values for first complex number:");
        c1.input();
        System.out.println("The first complex number is:");
        c1.tostring();
        System.out.println("Enter the values for second complex number:");
        c2.input();
        System.out.println("The second complex number is:");
        c2.tostring();
        out=c1.addition(c2);
        System.out.println("The sum of both complex numbers is:");
        out.tostring();
        out=c1.multiplication(c2);
        System.out.println("The multipliction of both complex numbers is:");
        out.tostring();



		
	}

}
