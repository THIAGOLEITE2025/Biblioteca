package com.company;

public class Livro {

    private int isbn;
    private String titulo;
    private Autor autor;

    public Livro(int isbn, String titulo, String nome, String sobrenome) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = new Autor(nome, sobrenome);
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
