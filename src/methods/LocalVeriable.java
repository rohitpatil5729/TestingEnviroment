package methods;

import java.lang.classfile.attribute.ModuleMainClassAttribute;

public class LocalVeriable {

	
	static void abc(int a,char c) {
		
		a  =10;//any variable inside any method those variables are local variable.
		         //local variable can never be distinguish between static or non static
		         //local variable dont have any default values
		         //local variable should be used after initilise it
		         //scope of the ant variable is only from start of the method to the end of the merthod
		System.out.println( a);
		
	}
	
	
	void abcd() {
		boolean abc=true;
		String a="rohit";
		
}
	
	public static void main(String[] args) {
		abc(1,'d');
	}
	
	
	int a=15;//any variable inside the class but out side the any method those variable is called as Global variable
	
	
	
	
	
	
	
	
	
	
	
}
