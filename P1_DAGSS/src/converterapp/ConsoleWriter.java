package converterapp;

import java.io.IOException;

public class ConsoleWriter implements Writer {

	@Override
	public void write(String s) throws IOException {
		if (s != null) {
			System.out.println(s);
		}
	}

}
