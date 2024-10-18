package pac1;

public class TC_arrays {
	
	public static void main(String[] args) {
		String b[]= new String[2];
		int a[] = new int[5];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		b[0]="apple";
		b[1]="orange";
		
		System.out.println(a[1]);
		System.out.println(b[1]);
		
		int c[][]=new int[5][5];
		c[0][0]=1000;
		c[0][1]=2000;
		c[0][2]=3000;
		c[0][3]=4000;
		c[0][4]=5000;
		c[1][1]=6000;
		c[2][1]=7000;
		c[3][1]=8000;
		System.out.println(c[1][1]+c[0][2]);

		
		
	}
}