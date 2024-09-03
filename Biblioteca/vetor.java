package com.company;

public class Biblioteca {

    private String nome;
    private Livro livros[];

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }

    public void exibeLivros() {
        for (int i=0; i<livros.length; i++){
            System.out.println(livros[i].getTitulo());
        }
    }
}
