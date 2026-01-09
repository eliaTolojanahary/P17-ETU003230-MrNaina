package com.itu.hello.model;

public class HistoriqueStatutBillet {
    private int idHistorique;
    private int idBillet;
    private int ancienStatut;
    private int nouveauStatut;
    private String dateChangement;

    public HistoriqueStatutBillet() {}
    public HistoriqueStatutBillet(int idHistorique, int idBillet, int ancienStatut, int nouveauStatut, String dateChangement) {
        this.idHistorique = idHistorique;
        this.idBillet = idBillet;
        this.ancienStatut = ancienStatut;
        this.nouveauStatut = nouveauStatut;
        this.dateChangement = dateChangement;
    }

    public int getIdHistorique() { return idHistorique; }
    public void setIdHistorique(int idHistorique) { this.idHistorique = idHistorique; }

    public int getIdBillet() { return idBillet; }
    public void setIdBillet(int idBillet) { this.idBillet = idBillet; }

    public int getAncienStatut() { return ancienStatut; }
    public void setAncienStatut(int ancienStatut) { this.ancienStatut = ancienStatut; }

    public int getNouveauStatut() { return nouveauStatut; }
    public void setNouveauStatut(int nouveauStatut) { this.nouveauStatut = nouveauStatut; }

    public String getDateChangement() { return dateChangement; }
    public void setDateChangement(String dateChangement) { this.dateChangement = dateChangement; }
}
