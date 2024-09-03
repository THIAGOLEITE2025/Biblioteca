package com.company;

public class Main {

    public static void main(String[] args) {
        
        Livro livros[] = new Livro[2];
        Biblioteca b1 = new Biblioteca();
        b1.setNome("FIP");

        livros[0] = new Livro(1,"a cabana","paul","young");
        livros[1] = new Livro(2,"o alquimista","paulo","coelho");

        b1.setLivros(livros);

        System.out.println(b1.getLivros()[0].getTitulo());

        b1.exibeLivros();

    }
}
