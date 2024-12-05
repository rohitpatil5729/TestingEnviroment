package StringDetails;

public class StringMethods {
	
	
	public static void main(String[] args) {
		//length();trim();toLowerCase(),toUpperCase();substring(index);substring(start index,index ending
		//equals();
		
		String a1= "rohit patil1212 ";
	    String abc="rohitpatil@123";
		System.out.println(a1.length());// length();--Return type int(not say integer)
	System.out.println(abc.length());
	System.out.println(a1.toUpperCase());
	String r1="Rohit Patil 121211";
	System.out.println("r1.toLowerCase()");
	String rr= "i am rohit";
	String rr2="  i am rohit ";
	System.out.println(rr.trim());
	System.out.println(rr2.trim());
	System.out.println(rr.substring(2));//substring(indexing)-single parameter and its return type is string
	System.out.println(rr.substring(2,6));//substring(indexing 1, indexing 2)-two parameters and its return type is string

	//here in result indexing 2 values upto indexing -1
	String ab="rohit"; 
	String bc="Rohit";
	System.out.println(ab.equals(bc));
	System.out.println(ab.equalsIgnoreCase(bc));
	System.out.println(ab.  concat(bc));//due to this no space create 
	System.out.println(ab.concat(" ").concat(bc).concat(ab));//due to this space create
	System.out.println(ab.replace('o', 'a'));
	System.out.println(ab.replace("ohit","ohini"));
	String a11="KBP 1012 ROHITabcd";
	String a12=a11.replaceAll("[A-Z]","");//only remove capital alphabets
	System.out.println(a12);
	String a13="KBP 1012 ROHITabcd";
	String a14=a13.replaceAll("[a-z]","");//only remove  alphabets without capital
	System.out.println(a14);
	String a15=a13.replaceAll("[0-9]", "");
	System.out.println(a15);
	System.out.println(a15.length());
	String a4="satara";
	boolean a5=a4.matches("(.*)a(.*)");
	System.out.println(a5);
	boolean a6=a4.matches("......");
	System.out.println(a6);
	char a10=a4.charAt(1);
	System.out.println(a10);
	System.out.println(a4.indexOf('t'));
	System.out.println(a4.indexOf('t'));//only available method is indexOf(char) and method not available indexOfChar(char);
	
	
	
	
	
	
	}

}
