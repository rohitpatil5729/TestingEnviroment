package StringDetails;

public class Reversestring {
	public static void main(String[] args) {
		String a="rohit";
		String output="";
		for(int a1=a.length()-1;a1>=0; a1--)
		{
			 
			char c1=a.charAt(a1);
			  output=output+c1 ;
			
		}
		System.out.println(output);
		
		
		
	}

}
