package LAB;
import java.time.*;
import java.util.Scanner;

public class Training_Period {
	
	private static final String SUNDAY = null;

	public static void main(String Args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the period : ");
		int period=sc.nextInt();
		int count = 1;
		
		LocalDate start_train = LocalDate.now();
		LocalDate date=start_train;
		
		while(count<period){
			
			DayOfWeek day = date.getDayOfWeek();
			
			if(day ==day.FRIDAY) {
				date = date.plusDays(3);
				count++;
				
			}
			else 
			{
				date = date.plusDays(1);
				count++;
			}
		}
		System.out.println("The training period will start on : "+start_train);
		
		System.out.println("The training period will end on : "+date);
		
		
		
		
		
	}

}
