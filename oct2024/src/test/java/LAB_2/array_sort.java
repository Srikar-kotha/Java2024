package LAB_2;

import java.util.Arrays;

public class array_sort {
	
	
	
	
	public static void main(String[] args) {
		String products[]=new String[5];
		products[0]="iphone";
		products[1]="samsung";
		products[2]="vivo";
		products[3]="oneplus";
		products[4]="oppo";
		Arrays.sort(products);
		System.out.println(products[2]);
	}

}
