package FileHandling;

import java.io.FileOutputStream;

public class FOSExample {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("output.txt");
			String s= "This is a new textsssss\n for writing file.";

			byte[] b = s.getBytes();
			fos.write(b);
			fos.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
