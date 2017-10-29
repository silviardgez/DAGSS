package ejercicio2;

import java.io.File;
import java.io.FileNotFoundException;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		final String NAME = "libros.txt";
		final String OUT = "libros.xml";

		//Creacion Objetos
		BibliotecaBuilder bbObj = new ObjetosBibliotecaBuilder();
		BibliotecaBuilder bbXml = new XMLBibliotecaBuilder(new File(OUT));
		
		//Parsear información
		LibrosParser librosObj = new LibrosParser(new File(NAME), bbObj);
		LibrosParser librosXml = new LibrosParser(new File(NAME), bbXml);
		librosObj.parse();
		librosXml.parse();

		
		ObjetosBibliotecaBuilder bb1 = (ObjetosBibliotecaBuilder)bbObj;
		System.out.println(bb1.getBiblioteca().toString());
		
		XMLBibliotecaBuilder bb2 = (XMLBibliotecaBuilder)bbXml;
		bb2.getXMLFile();

	}

}
