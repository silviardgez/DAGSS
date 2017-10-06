package converterapp;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ConverterApp {

	public static void main(String args[]) throws IOException {
		File input = getInputFile();
		File output = getOutputFile();

		Transformer transformer = new TABToXMLTransformer();
		Reader reader = new FileReader(input);
		Writer writer = new FileWriter(output);

		Converter converter = new Converter(reader, transformer, writer);

		converter.convert();

	}

	private static File getInputFile() {
		System.out.println("input filename: ");
		return getFile();
	}

	private static File getOutputFile() {
		System.out.println("output filename: ");
		return getFile();
	}

	private static File getFile() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();

		return new File(name);
	}
}