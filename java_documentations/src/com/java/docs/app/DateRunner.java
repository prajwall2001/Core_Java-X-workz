package com.java.docs.app;
import java.util.Date;
public class DateRunner {

	public static void main(String[] args) {
	Date date =new Date();
	long time= date.getTime();
    System.out.println("milliseconds: " + time);

    String dateString = date.toString();
    System.out.println(dateString);

     Date currentDate=new Date();
     Date clonedDate =(Date) currentDate.clone();
     System.out.println("Cloned date: " + clonedDate);
     
     boolean isEqual = currentDate.equals(clonedDate);
     System.out.println("Two dates are equal:" + isEqual);
     
     currentDate.getDay();
     System.out.println("Todays Date is: " + currentDate);
     
	}

}
