package p2;

import p1.twodim;

class threedim
{
	int x,y,z;
    
    threedim()
    {
	twodim two = new twodim();	
    	//twodim();
    	z=0;
    	return;
    }

    threedim(int a,int b,int c)
    {
		twodim two = new twodim(a,b);
		 
    	//twodim(a,b);
    	z=c;
    	return;
    }

    public void tostring()
    {
    	System.out.println("co-ordinate is: ("+x+","+y+","+z+")");
    	return;
    }


}