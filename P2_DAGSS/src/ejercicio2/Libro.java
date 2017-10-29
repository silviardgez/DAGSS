package ejercicio2;

public class Libro {
	private String titulo;
	private String isbn;
	private Autor autor;
	
	public Libro(String titulo, String isbn, Autor autor){
		this.titulo = titulo;
		this.isbn = isbn;
		this.autor = autor;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getISBN() {
		return this.isbn;
	}

	public void setISBN(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return this.autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}	
}
