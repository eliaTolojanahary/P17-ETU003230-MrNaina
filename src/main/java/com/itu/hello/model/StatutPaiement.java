package com.itu.hello.model;

public class StatutPaiement {
    private int idStatutPaiement;
    private String libelle;

    public StatutPaiement() {}
    public StatutPaiement(int idStatutPaiement, String libelle) {
        this.idStatutPaiement = idStatutPaiement;
        this.libelle = libelle;
    }

    public int getIdStatutPaiement() { return idStatutPaiement; }
    public void setIdStatutPaiement(int idStatutPaiement) { this.idStatutPaiement = idStatutPaiement; }

    public String getLibelle() { return libelle; }
    public void setLibelle(String libelle) { this.libelle = libelle; }
}
