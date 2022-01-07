package util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public void bufferedWrite(String[] lines, String pathFile) {

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathFile, true))) {

			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
		ReadFile readFile = new ReadFile();
		readFile.bufferedReader(pathFile);
	}

}
