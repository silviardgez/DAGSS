package ds.miniframework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class FileLogger extends Logger {
	private File file;
	private PrintStream out;
	public FileLogger(File file, int threshold, Logger next) throws FileNotFoundException {
		super(threshold, next);
		this.file = file;
		this.out = new PrintStream(new FileOutputStream(this.file));
	}

	@Override
	protected void _log(String msg, int priority) {
		this.out.println(msg);
	}
}
