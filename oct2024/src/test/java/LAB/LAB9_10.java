package LAB;

import java.util.Scanner;

public class LAB9_10 {
	int opt;
	String input;
	
	public int Input() 
	{
		Scanner sc = new Scanner(System.in);
		String input=sc.nextLine(); 
		System.out.println("Enter the operation-"
				+ "(for self --1,"
				+ "odd to # --2,"
				+ "duplicate--3,"
				+ "odd to uppercase--4");
		int opt=sc.nextInt();
		return opt;
	}
	
	public String User() 
	{
		switch(opt) {
		case 1:
			return (input+input); 
		case 2:
			String new_string="";
			for (int i=0;i<=input.length();i++) {
				
				if(i%2==1) 
				{
				new_string=new_string+"#";	
				}else 
				{
					new_string=new_string+input.charAt(i);
				}
			}
			return new_string;
		case 3:
			String new_string1="";
			for(int i=0;i<=input.length();i++) 
			{
				char c = input.charAt(i);
				
			}
			
			
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
