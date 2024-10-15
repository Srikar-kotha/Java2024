package LAB;

import java.util.Scanner;

class person
{
	String firstname;
	String lastname;
	int age;
	
	person(String Fname,String Lname,int Age)
	{
		this.firstname=Fname;
		this.lastname=Lname;
		this.age=Age;
		
	}
	public String phone() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the phone number");
		String num=sc.nextLine();
		while(num.length()!=10)
		{
			System.out.println("Enter a 10 digit valid phone number");
		}
		return num;
	
	}
	public void display()
	{
		System.out.println("phone number is "+phone());
	}
	public enum gender
	{
		Male('M'),
		Female('F');
	private final char code;
	
	gender(char code)
	{
		this.code=code;	
	}
	public static gender fromCode(char code)
	{
        switch (code) 
        {
            case 'M':
                return Male;
            case 'F':
                return Female;
            default:
                throw new IllegalArgumentException("Invalid code: " + code);
        }
    }
	   public String getDescription() 
	   {
	        return this == Male ? "This is a male." : "This is a female.";
	    }
	}	
	
}
public class LAB78910 {
	
	public static void main(String args[]) {
		//6th question --A
		
		person obj = new person("srikar","kotha",22);
		
		System.out.println("The first name is "+obj.firstname);
		System.out.println("The last name is "+obj.lastname);
		System.out.println("The age of "+obj.firstname+ " "+obj.lastname+" is "+obj.age);
		
		obj.display();

		
	}
	

}
