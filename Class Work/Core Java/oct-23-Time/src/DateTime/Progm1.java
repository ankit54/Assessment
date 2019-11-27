package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Progm1 {

	public static void main(String[] args) {
		LocalDateTime d=new LocalDateTime(null, null);
		System.out.println(d);
		
		DateTimeFormatter dt1=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println(d.format(dt1));
		
		DateTimeFormatter dt2=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println(d.format(dt2));
		
		
		
		
	}

	private static Date Date() {
		// TODO Auto-generated method stub
		return null;
	}

}
