package util;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
	
	public void pathFile(String pathFile) {
		
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
}
