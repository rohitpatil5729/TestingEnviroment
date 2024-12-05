package StringDetails;

import java.util.Date;

public class Details0fClass {
public static void main(String[] args) {
	Date d1=new Date();
	System.out.println(d1);
	Date d2=new Date(d1.getTime()+(1000*60*60*24*2));//milisecond*second*minutes*hours*days
	System.out.println(d2);
	String Output=d1.toString();
	
	String Year=Output.substring(Output.length()-4);
	System.out.println(Year);
	String Month =Output.substring(4,7);
	System.out.println(Month);
	String Date=Output.substring(8,10);
	System.out.println(Date);
	
	String DateFormate1=Date.concat(Month).concat(Year);
	System.out.println(DateFormate1);
	String Formate2=Date.concat("/").concat(Month).concat("/").concat(Year);
	System.out.println(Formate2);
	String Formate3=Date.concat("-").concat(Month).concat("-").concat(Year);
	System.out.println(Formate3);
	
	
}
}
