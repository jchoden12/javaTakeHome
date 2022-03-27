package takeHome;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.Properties;

public class ReadFile {
	
	String path = "Data\\jc.properties";

	public static void main(String[] args) throws IOException {

		doesPathExist("Data\\jc.properties");
		
		System.out.println("hello");

	}

	public static void doesPathExist(String path)  {
		
		

		Properties prop = new Properties();
		File file = new File(path);
		FileInputStream fileImput = null;
		try {
			fileImput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			prop.load(fileImput);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Apple = " + prop.getProperty("Apple"));
		System.out.println("Table = " + prop.getProperty("Table"));
		System.out.println("Orange = " + prop.getProperty("Orange"));
		
	}

}
