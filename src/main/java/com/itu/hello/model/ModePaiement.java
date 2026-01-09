package com.itu.hello.model;

public class ModePaiement {
    private int idModePaiement;
    private String libelle;

    public ModePaiement() {}
    public ModePaiement(int idModePaiement, String libelle) {
        this.idModePaiement = idModePaiement;
        this.libelle = libelle;
    }

    public int getIdModePaiement() { return idModePaiement; }
    public void setIdModePaiement(int idModePaiement) { this.idModePaiement = idModePaiement; }

    public String getLibelle() { return libelle; }
    public void setLibelle(String libelle) { this.libelle = libelle; }
}
