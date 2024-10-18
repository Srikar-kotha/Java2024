package com.cg.eis.pl;

import java.util.Scanner;

public class input_user {
	private long emp_id;
	private String emp_name;
	private long emp_sal;
	private String role;
	private String insurance_scheme;
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public long getEmp_sal() {
		return emp_sal;
	}
	public void setEmp_sal(long emp_sal) {
		this.emp_sal = emp_sal;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getInsurance_scheme() {
		return insurance_scheme;
	}
	public void setInsurance_scheme(String insurance_scheme) {
		this.insurance_scheme = insurance_scheme;
	}
	public long getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(long emp_id) {
		this.emp_id = emp_id;
	}
	public void getdetails(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the emp_id : ");
		emp_id=sc.nextLong();
		System.out.println("enter the emp_name : ");
		emp_name=sc.next();
		System.out.println("enter the emp_sal : ");
		emp_sal=sc.nextLong();
		System.out.println("enter the role : ");
		role=sc.next();	
	}
	public void show() {
		System.out.println("enter the emp_id : "+emp_id);
		System.out.println("enter the emp_name : "+emp_name);
		System.out.println("enter the emp_sal : "+emp_sal);
		System.out.println("enter the role : "+role);
	}
	public static void main(String[] args) {
		
	}

}
