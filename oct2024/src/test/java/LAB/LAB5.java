package LAB;

import java.util.Scanner;

class strexception extends Exception{
	String name;
	strexception(String first) {
		name=first;
	}	
public String mymessage() {
		
		return "The name is null";
	}
}
public class LAB5 {
	String firstname;
	String lastname;
	String gender ;
	int age;
	double weight;
	
	public void employee() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the First Name :");
		firstname=sc.nextLine();	
		System.out.println("Eneter the Last Name :");
		lastname=sc.nextLine();
		System.out.println("Eneter the Gender :");
		gender=sc.nextLine();
		System.out.println("Eneter the Age :");
		age=sc.nextInt();
		System.out.println("Eneter the Weight :");
		weight=sc.nextDouble();	
	}
	
	public void show() throws strexception {
		if(firstname=="") {
			throw new strexception(firstname);
		}
		if(lastname=="") {
			throw new strexception(lastname);
		}
		System.out.println("Gender :"+gender);
		System.out.println("Age :"+age);
		System.out.println("Weight :"+weight);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			LAB5 obj = new LAB5();
			obj.employee();
			obj.show();
		} catch (strexception e) {
			// TODO Auto-generated catch block
			System.out.println(e.mymessage());
		}
		
		
		
		//5 lab question
		
		/*Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		int x=sc.nextInt();
		System.out.println("my number is "+x);
		
		if(x>0)
		{
			System.out.println("The number is positive");	
		}
		else
		{
			System.out.println("The number is negative");
		}*/
	}

}
