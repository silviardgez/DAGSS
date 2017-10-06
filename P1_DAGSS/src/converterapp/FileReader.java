package converterapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader implements Reader {
	private File file;
	private Scanner scanner;

	public FileReader(File file) throws FileNotFoundException {
		this.file = file;
		scanner = new Scanner(this.file);
	}

	public String getLine() {
		String line = "";
		
		if (this.scanner.hasNextLine()) {
			line = this.scanner.nextLine();
		} else {
			line = null;
			this.scanner.close();
		}

		return line;
	}

}
