package methods;

public class Assignment8 {
	
//WAP FOR A CLASS HAVE BOTH STATIC AND NON STATIC METHODS
	
	
	 static void abc() 
	 { 
		 int a;
		 a=10;
		 System.out.println(a);
	 }
	 	
	 static void abcd() 
	 { 
		 int a;
		 a=10;
		 System.out.println(a);
	 }
	 void pqr() 
	 {
		 String r="Rohit";
		 System.out.println(r);
		 
	 }
	 void pqr(int a, int b) 
	 {
		int ab=a+b;
		 System.out.println(ab);
		 
	 }
public static void main(String[] args) {
	
	abc();
	abcd();
	Assignment8 a8=new Assignment8();
	a8.pqr();
	a8.pqr(1,3);
}

}
