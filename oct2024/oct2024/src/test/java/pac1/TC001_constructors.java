package pac1;

public class TC001_constructors
{
	int x;
	int y;
	
	TC001_constructors(int a , int b)
	{
		this.x=a;
		this.y=b;
	}
	public void add() 
	{
		System.out.println("addition:"+(x+y));
	}
   
}