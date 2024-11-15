package FileHandling.objects;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWriterExample {

	public static void main(String[] args) {
		Employee employee1 = new Employee(1, "Test 1", "Programmer", "India");
		Employee employee2 = new Employee(2, "Test 2", "Manager", "US");
		String filename = "file.ser";

		// Serialization
		try {
			// Saving of object in a file
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			// Method for serialization of object
			out.writeObject(employee1);
			out.writeObject(employee2);

			out.close();
			file.close();

			System.out.println("Object has been serialized");

		}

		catch (IOException ex) {
			ex.printStackTrace();
			System.out.println("IOException is caught");
		}
	}
}
