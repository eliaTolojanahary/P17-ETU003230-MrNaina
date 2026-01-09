package com.itu.hello.model;

public class TypePlace {
    private int idTypePlace;
    private String libelle;

    public TypePlace() {}
    public TypePlace(int idTypePlace, String libelle) {
        this.idTypePlace = idTypePlace;
        this.libelle = libelle;
    }

    public int getIdTypePlace() { return idTypePlace; }
    public void setIdTypePlace(int idTypePlace) { this.idTypePlace = idTypePlace; }

    public String getLibelle() { return libelle; }
    public void setLibelle(String libelle) { this.libelle = libelle; }
}
