interface callback
{
	void callback(int param);
}

class client implements callback
{
	public void callback(int p)
	{
		System.out.println("callback called with "+p);
	}

	public static void main(String[] args) 
	{
		callback ob=new client();
		ob.callback(42);
		
	}
}