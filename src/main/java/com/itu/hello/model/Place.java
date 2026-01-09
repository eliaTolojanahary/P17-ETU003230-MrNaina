package com.itu.hello.model;

public class Place {
    private int idPlace;
    private String rangee;
    private int numero;
    private int idSalle;
    private int idTypePlace;

    public Place() {}
    public Place(int idPlace, String rangee, int numero, int idSalle, int idTypePlace) {
        this.idPlace = idPlace;
        this.rangee = rangee;
        this.numero = numero;
        this.idSalle = idSalle;
        this.idTypePlace = idTypePlace;
    }

    public int getIdPlace() { return idPlace; }
    public void setIdPlace(int idPlace) { this.idPlace = idPlace; }

    public String getRangee() { return rangee; }
    public void setRangee(String rangee) { this.rangee = rangee; }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public int getIdSalle() { return idSalle; }
    public void setIdSalle(int idSalle) { this.idSalle = idSalle; }

    public int getIdTypePlace() { return idTypePlace; }
    public void setIdTypePlace(int idTypePlace) { this.idTypePlace = idTypePlace; }
}
