package takeHome;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReader {

	public static void main(String[] args) {
		
		try {
			doesFileExist("Data\\dictionary.txt");
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}
	
	public static void doesFileExist(String path) throws Exception {
		
	//	String path = "Data\\dictionary.txt";
		
		File fi = new File(path);
		FileReader fr = new FileReader(fi);
		BufferedReader reader = new BufferedReader(fr);
		
		String line;
		
		while((line =reader.readLine())!= null) {
			
			System.out.println(line);
		}
		
		reader.close();
		
	}
	
	

}
