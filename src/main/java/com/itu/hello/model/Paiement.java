package com.itu.hello.model;

public class Paiement {
    private int idPaiement;
    private double montant;
    private String datePaiement;
    private int idModePaiement;
    private int idStatutPaiement;
    private int idBillet;

    public Paiement() {}
    public Paiement(int idPaiement, double montant, String datePaiement, int idModePaiement, int idStatutPaiement, int idBillet) {
        this.idPaiement = idPaiement;
        this.montant = montant;
        this.datePaiement = datePaiement;
        this.idModePaiement = idModePaiement;
        this.idStatutPaiement = idStatutPaiement;
        this.idBillet = idBillet;
    }

    public int getIdPaiement() { return idPaiement; }
    public void setIdPaiement(int idPaiement) { this.idPaiement = idPaiement; }

    public double getMontant() { return montant; }
    public void setMontant(double montant) { this.montant = montant; }

    public String getDatePaiement() { return datePaiement; }
    public void setDatePaiement(String datePaiement) { this.datePaiement = datePaiement; }

    public int getIdModePaiement() { return idModePaiement; }
    public void setIdModePaiement(int idModePaiement) { this.idModePaiement = idModePaiement; }

    public int getIdStatutPaiement() { return idStatutPaiement; }
    public void setIdStatutPaiement(int idStatutPaiement) { this.idStatutPaiement = idStatutPaiement; }

    public int getIdBillet() { return idBillet; }
    public void setIdBillet(int idBillet) { this.idBillet = idBillet; }
}
