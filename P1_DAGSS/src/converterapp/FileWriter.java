package converterapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class FileWriter implements Writer {

	private File file;
	PrintStream out;

	public FileWriter(File file) throws FileNotFoundException {
		this.file = file;
		out = new PrintStream(new FileOutputStream(this.file));
	}

	public void write(String line) {
		if (line == null) {
			out.close();
		} else {
			out.println(line);
		}
	}
}
