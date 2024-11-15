package FileHandling;

import java.io.File;
import java.io.FileReader;

public class FileReaderExample {
	public static void main(String[] args) {

		try {
			File file = new File("writer_out.txt");
			FileReader reader = new FileReader(file);
			int i = 0;
			while ((i = reader.read()) != -1)
				System.out.print((char) i);
			
			
			reader.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
