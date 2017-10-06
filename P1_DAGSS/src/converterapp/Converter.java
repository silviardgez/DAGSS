package converterapp;

import java.io.IOException;

public class Converter {
	
	private Reader reader;
	private Transformer transformer;
	private Writer writer;
	
	public Converter(Reader reader, Transformer transformer, Writer writer){
		this.reader = reader;
		this.transformer = transformer;
		this.writer = writer;
	}
	
	public void convert() throws IOException{
		String line; 
		writer.write(transformer.header());
		while((line = reader.getLine()) != null){
			writer.write(transformer.transform(line));
		}
		
		if(line == null){
			writer.write(transformer.footer());
			writer.write(null);
		}
	}

}
