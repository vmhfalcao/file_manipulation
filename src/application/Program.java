package application;

import java.util.Scanner;

import util.FolderAndFile;
import util.ReadFile;
import util.WriteFile;

public class Program {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		System.out.print("1 - File Reader\n");
		System.out.print("2 - Buffered Reader (Faster reading)\n");
		System.out.print("3 - Buffered Writer (Faster writing)\n");
		System.out.print("4 - Manupulation Files and Folders\n");
		System.out.print("5 - File Informations\n");
		System.out.println();
		System.out.print("Choose one option: ");
		int n = sc.nextInt();
		sc.nextLine();			
		
			switch (n) {
			case 1: {
				
				System.out.print("Enter the path: ");
				String path = sc.nextLine();
				System.out.println();
				ReadFile readFile = new ReadFile();
				readFile.fileReader(path);
				break;
			}
			case 2: {
				
				System.out.print("Enter the path: ");
				String path = sc.nextLine();
				System.out.println();
				ReadFile readFile = new ReadFile();
				readFile.bufferedReader(path);
				break;
			}
			case 3: {
				
				System.out.print("Enter the path: ");
				String path = sc.nextLine();
				System.out.print("Enter the text, separate by comma: ");
				String[] line = sc.nextLine().split(",");
				System.out.println();
				WriteFile writeFile = new WriteFile();
				writeFile.bufferedWrite(line, path);
				break;
			}	
			case 4: {
				
				System.out.print("\nEnter a folder path: ");
				String strPath = sc.nextLine();
				
				System.out.print("\nChoose 1 = Folders,  2 = Files or 3 = Both: ");
				int choose = sc.nextInt();
				sc.nextLine();
				
				FolderAndFile folderAndFile = new FolderAndFile();
				
				if (choose == 1) {
					
					folderAndFile.folder(strPath);
				} 
				else if (choose == 2) {
					
					folderAndFile.file(strPath);
				}
				else if (choose == 3) {
					
					folderAndFile.folder(strPath);
					folderAndFile.file(strPath);	
					
				}
				else {
					System.out.println("Invalid option.");
				}				

				break;		
			}
			case 5: {
				
				System.out.print("Enter the path: ");
				String path = sc.nextLine();
				
				FolderAndFile folderAndFile = new FolderAndFile();
				folderAndFile.fileInf(path);				
				
				break;
			}	
			default:
				throw new IllegalArgumentException("Unexpected value: " + n);
			}
			
			sc.close();
			
		}
}
