package com.itu.hello.model;

public class Billet {
    private int idBillet;
    private String dateAchat;
    private double prix;
    private int idClient;
    private int idSeance;
    private int idPlace;
    private int idStatutBillet;

    public Billet() {}
    public Billet(int idBillet, String dateAchat, double prix, int idClient, int idSeance, int idPlace, int idStatutBillet) {
        this.idBillet = idBillet;
        this.dateAchat = dateAchat;
        this.prix = prix;
        this.idClient = idClient;
        this.idSeance = idSeance;
        this.idPlace = idPlace;
        this.idStatutBillet = idStatutBillet;
    }

    public int getIdBillet() { return idBillet; }
    public void setIdBillet(int idBillet) { this.idBillet = idBillet; }

    public String getDateAchat() { return dateAchat; }
    public void setDateAchat(String dateAchat) { this.dateAchat = dateAchat; }

    public double getPrix() { return prix; }
    public void setPrix(double prix) { this.prix = prix; }

    public int getIdClient() { return idClient; }
    public void setIdClient(int idClient) { this.idClient = idClient; }

    public int getIdSeance() { return idSeance; }
    public void setIdSeance(int idSeance) { this.idSeance = idSeance; }

    public int getIdPlace() { return idPlace; }
    public void setIdPlace(int idPlace) { this.idPlace = idPlace; }

    public int getIdStatutBillet() { return idStatutBillet; }
    public void setIdStatutBillet(int idStatutBillet) { this.idStatutBillet = idStatutBillet; }
}
