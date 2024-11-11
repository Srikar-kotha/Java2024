package LAB_2;

import java.util.Scanner;
import java.util.Random;

class ageexception extends Exception{
	private int age;
	ageexception(int a){
		age=a;	
	}
	public String mymessage() {
		return "The age of a person should be above 15 years";
	}
}
public class account 
{	
	Random random = new Random();
	private String name;
	private int age;
	private long acc_num;
	private double bal;
	//final double min_bal=500.00;
	private String acc_holder;
	int opt;
	
	public account(String name,int age,long bal) throws ageexception {
		if(age<15) {
			throw new ageexception(age);
		}
		this.age=age;
		this.acc_holder=name;
		this.acc_num=1000000000L+(long)(random.nextDouble()*9000000000L);
		this.bal=bal;	
		System.out.println("to deposit --1"
				+ "to withdraw opt --2");
		Scanner sc = new Scanner(System.in);
		int opt=sc.nextInt();
		if(opt==1)
			this.deposit();
		else
			this.withdrawl();
	}
	
	public void deposit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the deposit amount :");
		double dep=sc.nextDouble();
		bal=bal+dep;
		System.out.println("The current balance :"+bal);
	}
	
	public void withdrawl() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the withdrawl amount :");
		double draw=sc.nextDouble();
		bal=bal-draw;
		
	}
	public void show() {
		System.out.println("The account of person "+acc_holder+" aged "+age+" has an account where :");
		System.out.println("Account holder name :"+acc_holder);
		System.out.println("Account number :"+acc_num);
		System.out.println("Current balance :"+bal);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public double getBal() {
		return bal;
	}
	
	public void setBal(double bal) {
	
		this.bal=bal;
		
	}
	public long getAcc_num() {
		return acc_num;
	}

	public void setAcc_num(long acc_num) {
		this.acc_num = acc_num;	
	}

	public String getAcc_holder() {
		return acc_holder;
	}

	public void setAcc_holder(String acc_holder) {
		this.acc_holder=acc_holder;
	}
	
	public static void main(String args[]) 
	{
		account smith_acc;
		try {
			smith_acc = new account("smith",13,2000);
			smith_acc.show();
		} catch (ageexception e) {
			// TODO Auto-generated catch block
			System.out.println(e.mymessage());		}
		System.out.println();
		
		System.out.println();
		account kathy_acc;
		try {
			kathy_acc = new account("kathy",33,30000);
			kathy_acc.show();
		} catch (ageexception e) {
			// TODO Auto-generated catch block
			System.out.println(e.mymessage());		}
		System.out.println();
		
		
	}
	}

	


