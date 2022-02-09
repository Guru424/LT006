package corejava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.LocalFileDetector;

public class CompareDates {
public static void main(String[] args) throws ParseException {
	
		//SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");
		String inputString1 = "27/09/2021";
		String inputString2 = "27/01/2022";
		//Date date1 = myFormat.parse(inputString1);
	   // Date date2 = myFormat.parse(inputString2);
		/*try {
		    Date date1 = myFormat.parse(inputString1);
		    Date date2 = myFormat.parse(inputString2);
		    long diff = date2.getTime() - date1.getTime();
		   long t= TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
		    System.out.println ("Days: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
		} catch (ParseException e) {
		    e.printStackTrace();
		}*/
	    
	    DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate f1=LocalDate.parse(inputString1,df);
		LocalDate f2=LocalDate.parse(inputString2,df);
				//Period.between(f1, f2).getDays();
				Long days=ChronoUnit.DAYS.between(f1, f2);
				System.out.println(days);
				
				if(days.equals(120)){
					
					
				}
	
}
}
