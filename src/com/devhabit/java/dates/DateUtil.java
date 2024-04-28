/**
 * 
 */
package com.devhabit.java.dates;

import java.time.LocalDateTime;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

/**
 * 
 */
public class DateUtil {
	
	public static void main(String[] args) {

		LocalDateTime l1 = LocalDateTime.now();
		//add 3 days
		LocalDateTime l2 = l1.plusDays(3);
		System.out.println("new date after adding 3 days = " +l2);
		
		//substract 4 days
		
		LocalDateTime l3 = l2.minusDays(4);	
		
		System.out.println("new date after subtracting 4 days = " +l3);
		
		DateTimeZone timeZoneLondon = DateTimeZone.forID( "Europe/London" );
		DateTimeZone timeZoneKolkata = DateTimeZone.forID( "Asia/Kolkata" );
		DateTimeZone timeZoneNewYork = DateTimeZone.forID( "America/New_York" );
	
		DateTime nowLondon = DateTime.now( timeZoneLondon ); // Assign a time zone rather than rely on implicit default time zone.
		System.out.println("Date(London)  = " +nowLondon);		
		DateTime nowKolkata = nowLondon.withZone( timeZoneKolkata );
		System.out.println("Date(Kolkata)  = " +nowKolkata);

		DateTime nowNewYork = nowLondon.withZone( timeZoneNewYork );
		System.out.println("Date(NewYork)  = " +nowNewYork);
		
		DateTime nowUtc = nowLondon.withZone( DateTimeZone.UTC );  // Built-in constant for UTC.
		System.out.println("Date(UTC)  = " +nowUtc);
	}

}
