package com.itu.hello.model;

public class Seance {
    private int idSeance;
    private String dateSeance;
    private String heureDebut;
    private double prixBase;
    private boolean actif;
    private int idFilm;
    private int idSalle;

    public Seance() {}
    public Seance(int idSeance, String dateSeance, String heureDebut, double prixBase, boolean actif, int idFilm, int idSalle) {
        this.idSeance = idSeance;
        this.dateSeance = dateSeance;
        this.heureDebut = heureDebut;
        this.prixBase = prixBase;
        this.actif = actif;
        this.idFilm = idFilm;
        this.idSalle = idSalle;
    }

    public int getIdSeance() { return idSeance; }
    public void setIdSeance(int idSeance) { this.idSeance = idSeance; }

    public String getDateSeance() { return dateSeance; }
    public void setDateSeance(String dateSeance) { this.dateSeance = dateSeance; }

    public String getHeureDebut() { return heureDebut; }
    public void setHeureDebut(String heureDebut) { this.heureDebut = heureDebut; }

    public double getPrixBase() { return prixBase; }
    public void setPrixBase(double prixBase) { this.prixBase = prixBase; }

    public boolean isActif() { return actif; }
    public void setActif(boolean actif) { this.actif = actif; }

    public int getIdFilm() { return idFilm; }
    public void setIdFilm(int idFilm) { this.idFilm = idFilm; }

    public int getIdSalle() { return idSalle; }
    public void setIdSalle(int idSalle) { this.idSalle = idSalle; }
}
