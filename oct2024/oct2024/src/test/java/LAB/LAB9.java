package LAB;

import java.util.Scanner;

public class LAB9 {
	int opt;
	String input;
	
	public void Input() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		input=sc.nextLine(); 
		System.out.println("Enter the operation-"
				+ "(for self --1,"
				+ "odd to # --2,"
				+ "duplicate--3,"
				+ "odd to uppercase--4");
		opt=sc.nextInt();
		
	}
	
	public void User()
	{
		if (input == null || input.isEmpty()) {
            System.out.println("Input string is empty. Please enter a valid string.");
            return;
		}
		switch(opt) {
		case 1:
			System.out.println(input+input);
			break;
		case 2:
			String new_string="";
			for (int i=0;i<input.length();i++) {
				
				if(i%2==1) 
				{
				new_string=new_string+"#";	
				}else 
				{
					new_string=new_string+input.charAt(i);
				}
			}
			System.out.println(new_string);
			break;
		case 3:
			String new_string1="";
			for(int i=0;i<input.length();i++) 
			{
				char c = input.charAt(i);
				if(new_string1.indexOf(c)==-1) 
				{
					new_string1=new_string1+c;	
				}
			}
			System.out.println("The duplicated is : "+new_string1);
			break;
		default:
			String new_string2="";
			char c = 0;
			for(int i = 0;i<input.length();i++) {
				if(i%2==1) {
					c = input.charAt(i);
					new_string2=new_string2+(Character.toUpperCase(c));
				}
				else {
					new_string2=new_string2+input.charAt(i);
				}
			}
			System.out.println("The result is :"+new_string2);
			
			
			
		}
		
		
		
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		LAB9 obj = new LAB9();
		obj.Input();
		obj.User();
		

	}

}
