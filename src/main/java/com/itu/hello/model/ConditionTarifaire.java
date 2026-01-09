package com.itu.hello.model;

public class ConditionTarifaire {
    private int idCondition;
    private int idTarif;
    private int idTypeCondition;
    private String valeur;

    public ConditionTarifaire() {}
    public ConditionTarifaire(int idCondition, int idTarif, int idTypeCondition, String valeur) {
        this.idCondition = idCondition;
        this.idTarif = idTarif;
        this.idTypeCondition = idTypeCondition;
        this.valeur = valeur;
    }

    public int getIdCondition() { return idCondition; }
    public void setIdCondition(int idCondition) { this.idCondition = idCondition; }

    public int getIdTarif() { return idTarif; }
    public void setIdTarif(int idTarif) { this.idTarif = idTarif; }

    public int getIdTypeCondition() { return idTypeCondition; }
    public void setIdTypeCondition(int idTypeCondition) { this.idTypeCondition = idTypeCondition; }

    public String getValeur() { return valeur; }
    public void setValeur(String valeur) { this.valeur = valeur; }
}
