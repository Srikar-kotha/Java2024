package pac1;

import java.util.Scanner;

class ageexception extends Exception  {
	
	private int age;
	ageexception(int a){
		age=a;
	}
	public String mymessage() {
		
		return age+"is invalid age";
	}
	public ageexception(String message) {
		super(message);
	}
}
class employee{
	String name;
	int age;
	/*public String toString()
	{
		
	}*/
void getdetails() throws ageexception{
	System.out.println("enter your name");
	Scanner sc= new Scanner(System.in);
	name = sc.next();
	System.out.println("enter the age");
	age = sc.nextInt();
	if(age<16)
		throw new ageexception(age);
	}
}

public class TC_ageException {
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		try {
			employee emp=new employee();
			emp.getdetails();
		} catch (ageexception e) {
			// TODO Auto-generated catch block
			System.out.println(e.mymessage());
		}
	}

}

