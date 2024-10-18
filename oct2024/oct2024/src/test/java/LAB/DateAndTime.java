package LAB;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;


public class DateAndTime {
	
	
	public static void main(String args[]) {
		Instant CurrentTime = Instant.now();
		LocalDate now=LocalDate.now();
		System.out.println("Today : "+now);
		System.out.println("Tommorrow : "+now.plusDays(1));
		System.out.println("Yestreday : "+now.minusDays(1));
		System.out.println("Yestreday : "+now.isLeapYear());
		
		ZonedDateTime Ct = ZonedDateTime.now();
		ZonedDateTime Ctc = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		System.out.println(Ctc);

		System.out.println("Time : "+Ct);
		
		//New
		LocalDate start = LocalDate.of(1947,Month.AUGUST,15);
		LocalDate end = LocalDate.now();
		Period period = start.until(end);
		
		System.out.println("Days : "+period.get(ChronoUnit.DAYS));
		System.out.println("Months : "+period.get(ChronoUnit.MONTHS));
		System.out.println("Years : "+period.get(ChronoUnit.YEARS));
		}

}
