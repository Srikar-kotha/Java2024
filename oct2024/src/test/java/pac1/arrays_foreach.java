package pac1;

public class arrays_foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int j=0;
		int[] sqrs= {100,200,300,400,500};
		
		int arr[][]= {{2,3},{4,5}};
		int twodim[][]=new int[5][5];
		for(int j=0;j<5;j++) {
			for(int k=0;k<5;k++){
				twodim[j][k]=10000;
				System.out.println(twodim[j][k]);
				
		}
		}
System.out.println("two dimensional array :"+arr[0][0]);
	}

}
