package com.cg.eis.bean;
import com.cg.eis.pl.input_user;

public class employee extends input_user {
	
	private long emp_id;
	private String emp_name;
	private long emp_sal;
	private String role;
	private String insurance_scheme;
	
	
	
	public static void main(String[] args) {
		employee emp=new employee();
		emp.getdetails();
		emp.show();
	}
	

}
