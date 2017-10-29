package ejercicio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class XMLBibliotecaBuilder implements BibliotecaBuilder {

	private File file;
	private PrintStream out;
	private List<String> librosXML;

	public XMLBibliotecaBuilder(File file) throws FileNotFoundException {
		this.file = file;
		this.out = new PrintStream(new FileOutputStream(this.file));
		this.librosXML = new ArrayList<>();
	}

	public File getXMLFile() {
		out.println("<libros>");
		for (String xml : librosXML){
			out.println(xml);
		}
		out.println("</libros>");
		out.close();
		
		return this.file;
	}

	@Override
	public void addLibro(String titulo, String autor, String isbn) {
		this.librosXML.add("\t<libro>\n\t\t<titulo>" + titulo + "</titulo>\n\t\t<autor>" + autor + "</autor>\n\t\t<isbn>"
				+ isbn + "</isbn>\n\t</libro>");
	}
}
