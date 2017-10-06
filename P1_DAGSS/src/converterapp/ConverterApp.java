package converterapp;

import java.io.File;
import java.io.IOException;

public class ConverterApp {

	public static void main(String args[]) throws IOException {

		FileUserInterface file = new FileUserInterface();

		File input = file.getInputFile();
		File output = file.getOutputFile();

		Transformer transformer = new TABToXMLTransformer();
		Reader reader = new FileReader(input);
		Writer writer = new FileWriter(output);

		Converter converter = new Converter(reader, transformer, writer);

		converter.convert();

	}

}