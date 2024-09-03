package com.company;

public class Autor {

    private String nome;
    private String sonbrenome;

    public Autor(String nome, String sonbrenome) {
        this.nome = nome;
        this.sonbrenome = sonbrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSonbrenome() {
        return sonbrenome;
    }

    public void setSonbrenome(String sonbrenome) {
        this.sonbrenome = sonbrenome;
    }

}
