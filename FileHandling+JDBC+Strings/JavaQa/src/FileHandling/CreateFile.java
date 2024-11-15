package FileHandling;

import java.io.File;

public class CreateFile {
	
	public static void main(String[] args) {
		try {
			File file = new File("File.txt");
			System.out.println("Created new file: "+ file.createNewFile());
			System.out.println("Created new file: "+ file.createNewFile());
			System.out.println("Deleted  file: "+ file.delete());
			System.out.println("Deleted  file: "+ file.delete());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
