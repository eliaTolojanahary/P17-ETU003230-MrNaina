package com.itu.hello.model;
public class ClassificationAge {
    private int idClassification;
    private String code;
    private String description;

    public ClassificationAge() {}
    public ClassificationAge(int idClassification, String code, String description) {
        this.idClassification = idClassification;
        this.code = code;
        this.description = description;
    }

    public int getIdClassification() { return idClassification; }
    public void setIdClassification(int idClassification) { this.idClassification = idClassification; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}
