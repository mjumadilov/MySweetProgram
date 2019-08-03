package OCApractice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q15Date {

	public static void main(String[] args) 
	{
		LocalDate date1=LocalDate.now();
		LocalDate date2=LocalDate.of(2018,4,15);
		LocalDate date3=LocalDate.parse("2018-04-15",DateTimeFormatter.ISO_DATE);
		System.out.println("date-1:"+date1);
		System.out.println("date-2:"+date2);
		System.out.println("date-3:"+date3);
	}
}
//date-1:2019-07-12
//date-2:2018-04-15
//date-3:2018-04-15