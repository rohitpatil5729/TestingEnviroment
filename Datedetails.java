package StringDetails;

import java.util.Date;

public class Datedetails {
public static void main(String[] args) {
	Date d1=new Date();//date is predefined class which is present in java .util package so it is neccessary to import it

System.out.println(d1.getTime());
System.out.println(d1.getClass());
   Date d2=new Date(d1.getTime());
   System.out.println(d2);
   String current_time=d2.toString();
    String Year=current_time.substring(current_time.length()-4);
    System.out.println(Year);
    String Month=current_time.substring(4,8);
    System.out.println(Month);
    String date=current_time.substring(8,11);
    System.out.println(date);
}
}
