package com.itu.hello.model;

public class Salle {
    private int idSalle;
    private String nom;
    private int capacite;
    private boolean actif;
    private int idTypeProjection;

    public Salle() {}
    public Salle(int idSalle, String nom, int capacite, boolean actif, int idTypeProjection) {
        this.idSalle = idSalle;
        this.nom = nom;
        this.capacite = capacite;
        this.actif = actif;
        this.idTypeProjection = idTypeProjection;
    }

    public int getIdSalle() { return idSalle; }
    public void setIdSalle(int idSalle) { this.idSalle = idSalle; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public int getCapacite() { return capacite; }
    public void setCapacite(int capacite) { this.capacite = capacite; }

    public boolean isActif() { return actif; }
    public void setActif(boolean actif) { this.actif = actif; }

    public int getIdTypeProjection() { return idTypeProjection; }
    public void setIdTypeProjection(int idTypeProjection) { this.idTypeProjection = idTypeProjection; }
}

