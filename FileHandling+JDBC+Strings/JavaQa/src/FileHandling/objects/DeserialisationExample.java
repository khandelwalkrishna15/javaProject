package FileHandling.objects;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserialisationExample {
	public static void main(String[] args) {
		try {
			// Reading the object from a file
			FileInputStream file = new FileInputStream("file.ser");
			ObjectInputStream in = new ObjectInputStream(file);

			// Method for deserialization of object
			Employee emp1 = (Employee) in.readObject();
			System.out.println(emp1);
			Employee emp2 = (Employee) in.readObject();
			System.out.println(emp2);
			Employee emp3 = (Employee) in.readObject();
			System.out.println(emp3);
			in.close();
			file.close();

		}

		catch (IOException ex) {
			ex.printStackTrace();
			System.out.println("IOException is caught");
		}

		catch (ClassNotFoundException ex) {
			ex.printStackTrace();
			System.out.println("ClassNotFoundException is caught");
		}
	}
}
