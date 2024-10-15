package LAB;

import java.util.Scanner;

public class LAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("First Name:Srikar");
		System.out.println("Last Name:Kotha");
		System.out.println("Gender:M");
		System.out.println("Age:20");
		System.out.println("Weight:62");
		
		//5 lab question
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		int x=sc.nextInt();
		System.out.println("my name is "+x);
		
		if(x>0)
		{
			System.out.println("The number is positive");	
		}
		else
		{
			System.out.println("The number is negative");
		}
	}

}
