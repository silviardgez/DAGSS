package ejercicio1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

import converterapp.*;


public class OrdenPago {

	public static void main(String[] args) {
		
		FileUserInterface file = new FileUserInterface();

		File input = file.getInputFile();
		File output = file.getOutputFile();

		Transformer transformer = new TABToXMLTransformer();
		Reader reader = new FileReader(input);
		Writer writer = new FileWriter(output);

		Converter converter = new Converter(reader, transformer, writer);

		converter.convert();
		Nomina n = new EscalaA();
		//Calcular trienios
		int antiguedad = 6;
		int trienios = antiguedad/3;
		
		n = new CargoGestion(n,true);
		
		System.out.println(n.calcularNomina());

	}

}
