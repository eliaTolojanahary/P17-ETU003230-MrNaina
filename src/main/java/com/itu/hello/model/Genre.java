package com.itu.hello.model;

public class Genre {
    private int idGenre;
    private String libelle;

    public Genre() {}

    public Genre(int idGenre, String libelle) {
        this.idGenre = idGenre;
        this.libelle = libelle;
    }

    public int getIdGenre() { return idGenre; }
    public void setIdGenre(int idGenre) { this.idGenre = idGenre; }

    public String getLibelle() { return libelle; }
    public void setLibelle(String libelle) { this.libelle = libelle; }
}
