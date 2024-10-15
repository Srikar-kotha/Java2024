package pac1;

public class TC001_Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=4;i++) 
		{
			switch(i) 
			{
			case 0:
				System.out.println("zero");
				break;
			case 1:
				System.out.println("one");
				break;
			case 2:
				System.out.println("two");
				break;
			default:
				System.out.println("others");
			}
		}
		int j;
		j=0;
		
		while(j<=4)
		{
			System.out.println("J value is "+j);
			j++;
		}
		int k;
		k=0;
		do
		{
			System.out.println("K value is "+k);
			k++;
			
		}
		while(k<=4);
			

	}

}
