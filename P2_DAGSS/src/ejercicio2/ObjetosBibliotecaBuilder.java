package ejercicio2;

public class ObjetosBibliotecaBuilder implements BibliotecaBuilder {
	private Biblioteca biblioteca;

	public ObjetosBibliotecaBuilder() {
		this.biblioteca = new Biblioteca();
	}

	@Override
	public void addLibro(String titulo, String autor, String isbn) {
		Autor autorNuevo = new Autor(autor);
		Libro libroNuevo = new Libro(titulo, isbn, autorNuevo);
		this.biblioteca.addLibro(libroNuevo);
	}

	public Biblioteca getBiblioteca() {
		return this.biblioteca;
	}
	
}
