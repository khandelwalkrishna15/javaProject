package arrays;

public class ArrayMethods {
	public static void main(String[] args) {
		char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
		// declaring a destination array
		char[] copyTo = new char[7];
		//[c,a,f,f,e,a,a]
		// copying array using System.arraycopy() method
		// Object src, int srcPos,Object dest, int destPos, int length
		System.arraycopy(copyFrom, 2, copyTo, 0, 5);
		// printing the destination array
		System.out.println(String.valueOf(copyTo));
		
		
	}
}
