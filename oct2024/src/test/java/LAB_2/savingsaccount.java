package LAB_2;

import java.util.Scanner;

public class savingsaccount extends account {
	
	public savingsaccount(String name, int age, long bal) throws ageexception {
		super(name, age, bal);
		// TODO Auto-generated constructor stub
	}

	final private double min_bal=500;
	private double curr_bal;
	
	public double getCurr_bal() {
		return curr_bal;
	}

	public void setCurr_bal(double curr_bal) {
		this.curr_bal = curr_bal;
	}

	public double getMin_bal() {
		return min_bal;
	}
	@Override
	public void withdrawl() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the withdrawl amount :");
		double draw=sc.nextDouble();
		setBal(getBal()-draw);
		if(getBal()<=getMin_bal()) {
			System.out.println("You cannot withdraw the amount,the min_bal is "+min_bal);
			setBal(getBal()+draw);
		}

		
		}
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		savingsaccount sav_acc;
		try {
			sav_acc = new savingsaccount("smith",24,2000);
			sav_acc.show();
		} catch (ageexception e) {
			// TODO Auto-generated catch block
			System.out.println(e.mymessage());	
		}
		
		

	}

}
