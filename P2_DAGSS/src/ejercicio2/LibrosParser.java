package ejercicio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LibrosParser {
	private File file;
	private Scanner scanner;
	private BibliotecaBuilder bb;
	
	LibrosParser(File file, BibliotecaBuilder bb) throws FileNotFoundException {
		this.file = file;
		this.scanner = new Scanner(this.file);
		this.bb = bb;
	}

	public void parse() {
		String line;
		while(this.scanner.hasNextLine()) {
			line = this.scanner.nextLine();
			String[] tokens = line.split("\t");
			if (tokens.length != 3) {
				throw new IllegalArgumentException("the line does not contain 3 tokens");
			}
			
			bb.addLibro(tokens[0], tokens[1], tokens[2]);
		}
	}
}
