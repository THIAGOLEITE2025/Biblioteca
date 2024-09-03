public class Main {
    public static void main(String[] args) {

        Autor autor1 = new Autor("J.K.", "Rowling");
        Autor autor2 = new Autor("George", "Orwell");

        Livro livro1 = new Livro("978-0545010221", "Harry Potter e a Pedra Filosofal", autor1);
        Livro livro2 = new Livro("978-0451524935", "1984", autor2);

        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        System.out.println(biblioteca);
    }
}
