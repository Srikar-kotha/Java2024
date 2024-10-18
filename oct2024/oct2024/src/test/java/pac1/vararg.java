package pac1;

public class vararg {
	
	void printdetails(String msg,int...numbers)
	{
		for(int i:numbers) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vararg obj = new vararg();
		obj.printdetails("hello", 100,200,300);

	}

}
