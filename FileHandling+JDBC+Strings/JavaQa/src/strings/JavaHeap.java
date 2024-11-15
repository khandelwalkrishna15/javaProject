package strings;

public class JavaHeap {
	public static void main(String[] args) {
		String s1 = "Cat";
		String s2 = "Cat";
		System.out.println(s1 == s2);
		String s3 = new String(s1);
		System.out.println(s1 == s3);
		String s4 = s3.intern();
		System.out.println(s1 == s4);
		
		
		System.out.println(s1 + "  "+ s2);
	}
	
}


/**
String pool
s1 = Cat;
s2 --
**/