package takeHome;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadTextFile {

	public static void main(String[] args) {
		
		try {Path path = Paths.get("Data\\dictionary.txt");
		
		    File file = path.toFile();
		    
		    Scanner sc = new Scanner(file);
		
		while(sc.hasNextLine()) {
			
		String str = sc.nextLine();
		System.out.println(str);
		
		}
		
		sc.close();
		
		}
		
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		doesFileExist();
		
	}
		

	public static void doesFileExist() {
		
		Path path = Paths.get("Data\\dictionary.txt");

		File file = path.toFile();

		if (file.exists()) {
			System.out.println("file exists");
		}

	}

}
