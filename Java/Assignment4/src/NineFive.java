import java.util.*;
public class NineFive {

	public static void main(String[] args) {
		System.out.println("This program uses the Java GregorianCalendar class in Java's API ");
		System.out.println("It will print out the current date as well as print out the date of the value " +
		 "1234567898765L.");
		
		GregorianCalendar Cal = new GregorianCalendar(); 
		int month = Cal.get(Calendar.MONTH)+1;
		int day = Cal.get(Calendar.DAY_OF_MONTH);
		int year = Cal.get(Calendar.YEAR);
		System.out.print("The Current Date is ");
		System.out.println(month + "/" + day + "/" + year);
		Cal.setTimeInMillis(1234567898765L); 

		month = Cal.get(Calendar.MONTH)+1;
		day = Cal.get(Calendar.DAY_OF_MONTH);
		year = Cal.get(Calendar.YEAR);
		System.out.print("The Date after 1234567898765L Millis is ");
		System.out.println(month + "/" + day + "/" + year);
	}

}
