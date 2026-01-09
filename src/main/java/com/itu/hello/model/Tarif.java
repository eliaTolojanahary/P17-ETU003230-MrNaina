package com.itu.hello.model;

public class Tarif {
    private int idTarif;
    private String libelle;
    private double prix;
    private int priorite;
    private boolean actif;

    public Tarif() {}
    public Tarif(int idTarif, String libelle, double prix, int priorite, boolean actif) {
        this.idTarif = idTarif;
        this.libelle = libelle;
        this.prix = prix;
        this.priorite = priorite;
        this.actif = actif;
    }

    public int getIdTarif() { return idTarif; }
    public void setIdTarif(int idTarif) { this.idTarif = idTarif; }

    public String getLibelle() { return libelle; }
    public void setLibelle(String libelle) { this.libelle = libelle; }

    public double getPrix() { return prix; }
    public void setPrix(double prix) { this.prix = prix; }

    public int getPriorite() { return priorite; }
    public void setPriorite(int priorite) { this.priorite = priorite; }

    public boolean isActif() { return actif; }
    public void setActif(boolean actif) { this.actif = actif; }
}
