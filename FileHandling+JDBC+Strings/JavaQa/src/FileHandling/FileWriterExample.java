package FileHandling;

import java.io.File;
import java.io.FileWriter;

public class FileWriterExample {
	public static void main(String[] args) {
		try {
			File file = new File("writer_out.txt");
			FileWriter writer = new FileWriter(file);
			String s = "This is a new text "+System.lineSeparator()+" for writing file.";

			writer.write(s);
			writer.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
