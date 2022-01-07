package util;

import java.io.File;

public class FolderAndFile {
	
	public void folder(String folderPath) {

		File path = new File(folderPath);
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS:");
		for (File folder : folders) {
			System.out.println(folder);
		}		
	}

	public void file(String filePath) {

		File path = new File(filePath);	
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES:");
		for (File file : files) {
			System.out.println(file);
		}	
	}
	
	public void fileInf(String filePath) {

		File file = new File(filePath);
		
		if (file.exists()) {
			
			System.out.println("Path: " + file.getPath());
			System.out.println("Parent: " + file.getParent());
			System.out.println("File Size: " + file.length() + " bytes");
			
		} 
		else {
			
			System.out.println("File does not exist!");
		}		
		
	}

}
