public class Livro {
    private final String isbn;
    private final String titulo;
    private final Autor autor;

    public Livro(String isbn, String titulo, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "ISBN: " + isbn + ", Título: " + titulo + ", Autor: " + autor.toString();
    }
}
