package ds.miniframework;

public class ConsoleLogger extends Logger {

	public ConsoleLogger(int threshold, Logger next) {
		super(threshold, next);
	}

	@Override
	public void _log(String msg, int priority) {
		System.out.println(msg);
	}

}
