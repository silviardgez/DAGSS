package converterapp;

public class TABToXMLTransformer implements Transformer {

	public String header() {
		return "<products>";
	}

	public String footer() {
		return "</products>";
	}

	public String transform(String line) {
		String[] tokens = line.split("\t");
		if (tokens.length != 2) {
			throw new IllegalArgumentException("the line does not contain 3 tokens");
		}

		return "\t<product>\n\t\t<name>" + tokens[0] + "</name>\n\t\t<price>" + tokens[1] + "</price>\n\t</product>";
	}

}
