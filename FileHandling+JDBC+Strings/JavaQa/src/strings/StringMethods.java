package strings;
import java.util.Arrays;

public class StringMethods {
	public static void main(String[] args) {
		String test = "This is a test String";
		System.out.println(test.charAt(11));
		
		System.out.println(test.equalsIgnoreCase("this is a test string")); // true
		System.out.println(test.equals("This is a test String"));           // true
		System.out.println(test.equals("this is a test string"));           // false
		System.out.println(test.concat(" abc")); 
		
		
		System.out.println(test.endsWith(" String")); 
		System.out.println(test.endsWith(" Stridng")); 
		
		System.out.println(test.toUpperCase().startsWith("T")); 
		System.out.println(test.startsWith("This")); 
		
		System.out.println(test.length());
		System.out.println(test.replace("t","w"));
		System.out.println(test.replaceFirst("t","w"));
		
		System.out.println(Arrays.toString(test.split(" ")));
		
		System.out.println(test.substring(5));
		System.out.println(test.substring(5, 11));
		
		
		System.out.println(test.toLowerCase());
		System.out.println(test.toUpperCase());
		
		System.out.println("  \n\t test\n".trim());




	}
}
