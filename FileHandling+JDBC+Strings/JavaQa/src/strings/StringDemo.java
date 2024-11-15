package strings;

public class StringDemo {

	public static void main(String[] args) {
		String helloWorld = "Hello World";
		System.out.println(helloWorld);
		
		String newHello = new String("Hello New World");
		System.out.println(newHello);
		
		char[] helloArray = {'h', 'e', 'l', 'l', 'o', '.'};
		String helloString = new String(helloArray);
		System.out.println(helloString);
		
	}
}
