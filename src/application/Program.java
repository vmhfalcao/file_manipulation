package application;

import java.util.Scanner;

import util.ReadFile;

public class Program {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		System.out.print("1 - Read file");
		System.out.println();
		System.out.print("\nChoose one option: ");
		int n = sc.nextInt();
		sc.nextLine();			
		
			switch (n) {
			case 1: {
				
				System.out.print("Enter the path: ");
				String path = sc.nextLine();
				System.out.println();
				ReadFile readFile = new ReadFile();
				readFile.pathFile(path);
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + n);
			}
			
			sc.close();
			
		}
}
