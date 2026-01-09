package com.itu.hello.model;

public class StatutBillet {
    private int idStatutBillet;
    private String libelle;

    public StatutBillet() {}
    public StatutBillet(int idStatutBillet, String libelle) {
        this.idStatutBillet = idStatutBillet;
        this.libelle = libelle;
    }

    public int getIdStatutBillet() { return idStatutBillet; }
    public void setIdStatutBillet(int idStatutBillet) { this.idStatutBillet = idStatutBillet; }

    public String getLibelle() { return libelle; }
    public void setLibelle(String libelle) { this.libelle = libelle; }
}
