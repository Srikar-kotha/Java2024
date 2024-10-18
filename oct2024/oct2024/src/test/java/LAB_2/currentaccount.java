package LAB_2;

import java.util.Scanner;

public class currentaccount extends account {
	public currentaccount(String name, int age, long bal) throws ageexception {
		super(name, age, bal);
		// TODO Auto-generated constructor stub
	}
	private double overdraft;
	double draw;
	//@Override
	public void withdrawl() {
		Scanner sc = new Scanner(System.in);
		System.out.println("set the overdraft limit :");
		setOverdraft(sc.nextDouble());
		System.out.println("Enter the withdrawl amount :");
		double draw=sc.nextDouble();
		if(draw<=getBal()+getOverdraft()) 
			setBal(getBal()-draw);
		else
			System.out.println("The overdraft limit is exceeded");	
	}
	public void draft() {
		if(draw<=getBal()+getOverdraft()) 
			return;	
		else {
			System.out.println("The overdraft limit is exceeded");	
		    return ;
		    }
		
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		try {
			currentaccount curr_acc=new currentaccount("smith",24,2000);
			curr_acc.show();
		} catch (ageexception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}

}
