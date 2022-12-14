package p1;

public class twodim
{
	public int x,y;
	//public int y;

	public twodim()
	{
		x=0;
		y=0;
		return;
	}
    
    public twodim(int a,int b)
    {
    	x=a;
    	y=b;
    	return;
    }

    public void tostring()
    {
    	System.out.println("co-ordinate is: ("+x+","+y+")");
    	return;
    }



}