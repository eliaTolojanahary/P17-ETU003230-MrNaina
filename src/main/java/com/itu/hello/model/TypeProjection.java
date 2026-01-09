package com.itu.hello.model;

public class TypeProjection {
    private int idTypeProjection;
    private String libelle;

    public TypeProjection() {}
    public TypeProjection(int idTypeProjection, String libelle) {
        this.idTypeProjection = idTypeProjection;
        this.libelle = libelle;
    }

    public int getIdTypeProjection() { return idTypeProjection; }
    public void setIdTypeProjection(int idTypeProjection) { this.idTypeProjection = idTypeProjection; }

    public String getLibelle() { return libelle; }
    public void setLibelle(String libelle) { this.libelle = libelle; }
}
