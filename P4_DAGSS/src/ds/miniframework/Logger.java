package ds.miniframework;

import java.io.File;
import java.io.FileNotFoundException;

public abstract class Logger {
	public static final int DEBUG = 0;
	public static final int INFO = 1;
	public static final int ERROR = 2;
	private static final File FILE = new File("logger.txt");

	private static Logger singleton;
	private Logger next;

	private int priorityThreshold;

	public Logger(int threshold, Logger next) {
		this.priorityThreshold = threshold;
		this.next = next;
	}

	public static Logger getInstance() throws FileNotFoundException {
		if (singleton == null) {
			singleton = new FileLogger(Logger.FILE, Logger.ERROR, new ConsoleLogger(Logger.INFO, null));
		}

		return singleton;
	}

	public void log(String msg, int priority) {
		if (priority >= this.priorityThreshold) {
			_log(msg, priority);
		}
		if (this.next != null) {
			this.next.log(msg, priority);
		}
	}

	protected abstract void _log(String msg, int priority);
}
