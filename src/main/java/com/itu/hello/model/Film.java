package com.itu.hello.model;

public class Film {
    private int idFilm;
    private String titre;
    private String description;
    private int dureeMinutes;
    private String dateSortie; 
    private boolean actif;
    private int idGenre;
    private int idClassification;

    public Film() {}

    public Film(int idFilm, String titre, String description, int dureeMinutes, String dateSortie,
                boolean actif, int idGenre, int idClassification) {
        this.idFilm = idFilm;
        this.titre = titre;
        this.description = description;
        this.dureeMinutes = dureeMinutes;
        this.dateSortie = dateSortie;
        this.actif = actif;
        this.idGenre = idGenre;
        this.idClassification = idClassification;
    }

    public int getIdFilm() { return idFilm; }
    public void setIdFilm(int idFilm) { this.idFilm = idFilm; }

    public String getTitre() { return titre; }
    public void setTitre(String titre) { this.titre = titre; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public int getDureeMinutes() { return dureeMinutes; }
    public void setDureeMinutes(int dureeMinutes) { this.dureeMinutes = dureeMinutes; }

    public String getDateSortie() { return dateSortie; }
    public void setDateSortie(String dateSortie) { this.dateSortie = dateSortie; }

    public boolean isActif() { return actif; }
    public void setActif(boolean actif) { this.actif = actif; }

    public int getIdGenre() { return idGenre; }
    public void setIdGenre(int idGenre) { this.idGenre = idGenre; }

    public int getIdClassification() { return idClassification; }
    public void setIdClassification(int idClassification) { this.idClassification = idClassification; }
}
