/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeconversionbycountry;

/**
 *
 * @author anita
 */

import java.util.Calendar;
import java.util.TimeZone;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class TimeConversionByCountry{
	public static void main (String[] args){

		//this gives the time at the place presently staying
		Calendar localTime = Calendar.getInstance();

		int hour = localTime.get(Calendar.HOUR);
		int minute = localTime.get(Calendar.MINUTE);
		int second = localTime.get(Calendar.SECOND);
		int year = localTime.get(Calendar.YEAR);

		
		System.out.println("Here are all list of timezones for your reference: ");
		//the method provides all the available timezone
		String[] availableIDs = TimeZone.getAvailableIDs();
		for(String temp : availableIDs){
			System.out.println(temp);
		}

		System.out.println("Enter the name of the country: ");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		System.out.println("Enter the suitable timezone: ");
		String timezone = scan.next();

		
                 //Prints the local time
		System.out.println("Local time: " + hour+" : "+minute+" : " +second+" "+ year);
		
		//Create a calendar object for representing specified time zone
		Calendar requiredTime = new GregorianCalendar(TimeZone.getTimeZone(timezone));
		requiredTime.setTimeInMillis(localTime.getTimeInMillis());
		hour = requiredTime.get(Calendar.HOUR);
		minute = requiredTime.get(Calendar.MINUTE);
		second = requiredTime.get(Calendar.SECOND);
		year = requiredTime.get(Calendar.YEAR);

		System.out.println(name + " time: " + hour+" : "+minute+" : "+second+" "+ year);

		}
      



	}
