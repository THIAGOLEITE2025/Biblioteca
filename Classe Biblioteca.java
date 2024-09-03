import java.util.ArrayList;

public class Biblioteca {
    private final String nome;
    private final ArrayList<Livro> livros;

    public Biblioteca(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Biblioteca: ").append(nome).append("\n");
        sb.append("Livros:\n");
        for (Livro livro : livros) {
            sb.append(livro.toString()).append("\n");
        }
        return sb.toString();
    }
}
