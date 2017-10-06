package converterapp;

import java.io.File;
import java.util.Scanner;

public class FileUserInterface {

	public static File getFile() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();

		return new File(name);
	}
	
	public File getInputFile() {
		System.out.println("input filename: ");
		return getFile();
	}

	public File getOutputFile() {
		System.out.println("output filename: ");
		return getFile();
	}
	
	
}
