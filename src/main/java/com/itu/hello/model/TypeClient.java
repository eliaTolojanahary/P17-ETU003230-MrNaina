package com.itu.hello.model;

public class TypeClient {
    private int idTypeClient;
    private String libelle;
    private String description;

    public TypeClient() {}
    public TypeClient(int idTypeClient, String libelle, String description) {
        this.idTypeClient = idTypeClient;
        this.libelle = libelle;
        this.description = description;
    }

    public int getIdTypeClient() { return idTypeClient; }
    public void setIdTypeClient(int idTypeClient) { this.idTypeClient = idTypeClient; }

    public String getLibelle() { return libelle; }
    public void setLibelle(String libelle) { this.libelle = libelle; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}

