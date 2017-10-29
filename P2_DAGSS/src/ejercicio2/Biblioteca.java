package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private List<Libro> listaLibros;

	public Biblioteca() {
		listaLibros = new ArrayList<>();
	}

	public List<Libro> getLibros() {
		return listaLibros;
	}

	public void addLibro(Libro libro) {
		listaLibros.add(libro);
	}

	@Override
	public String toString() {
		String toRet = "";
		for (Libro libro : this.listaLibros) {
			toRet += "Título: " + libro.getTitulo() + " ISBN: " + libro.getISBN() + " Autor: "
					+ libro.getAutor().getNombre() + "\n";
		}
		return toRet;
	}
}
