package randomPractice;

import accessModifier.Default;
import accessModifier.Protected;

public class StringPractice {

	public static void main(String[] hurayra) {
		
		int a = 10;
		int b = 20;
		String c = "Natalia";
		String d = "Haque";
		int e = 10;
		String f = "Maddy";
		
		int name = 4;
		
		System.out.println(d.equalsIgnoreCase(f));
		System.out.println(d.equals(f));
		System.out.println(d.charAt(3));
		System.out.println(f.contains("Maddy"));
		System.out.println(d.substring(1,4));
		System.out.println(d.length());
 
		
		
		System.out.println(returnLength("Hurayra"));
		int m = returnLength("Hurayra");
		System.out.println(m);
		
		//Protected.lastName;
		
		String x =Default.lastName;
		//"Hurayra";

	}
	
	public static int returnLength(String text) {
		
		int i = text.length();
		return i;
		
	}
	
	


}