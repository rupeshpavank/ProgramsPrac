package dateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateFormat {
	
	public static void main(String args[]) throws ParseException  {
		
		String str="09/28/2022";
		String str1="09/28/2023";
		
		SimpleDateFormat sfd=new SimpleDateFormat("MM/dd/yyyy");
		
		Date d1=sfd.parse(str);
		
		Date d2=sfd.parse(str1);
		
		long time=d2.getTime()-d1.getTime();
		
		long day=	TimeUnit.MILLISECONDS.toDays(time);
	
		System.out.println(day);
	

		
	}

}
