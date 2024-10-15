package pac1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;


public class TC001_scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   LocalDate date = LocalDate.of(2024, 10, 14); // YYYY, MM, DD

	        // Get the day of the week
	        DayOfWeek dayOfWeek = date.getDayOfWeek();

	        // Print the day of the week
	        System.out.println("The day of the week for " + date + " is " + dayOfWeek);
	}

}
 