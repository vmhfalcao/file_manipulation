package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
	
	public void fileReader(String pathFile) {
		
		File file = new File(pathFile);
		Scanner sc = null;

		try	{
			sc = new Scanner(file);
			
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(IOException e)
		{
			System.out.println("Error: " + e.getMessage());
		}
		finally
		{
			if (sc != null) {
				sc.close();
			}
		}
	}
	
	public void bufferedReader(String pathFile) {
		
		//try-with-resources = https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
		
		try (BufferedReader br = new BufferedReader(new FileReader(pathFile))) { 
			
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} 
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}		
	}

}
