package com.itu.hello.model;

public class TypeCondition {
    private int idTypeCondition;
    private String code;
    private String description;

    public TypeCondition() {}
    public TypeCondition(int idTypeCondition, String code, String description) {
        this.idTypeCondition = idTypeCondition;
        this.code = code;
        this.description = description;
    }

    public int getIdTypeCondition() { return idTypeCondition; }
    public void setIdTypeCondition(int idTypeCondition) { this.idTypeCondition = idTypeCondition; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}
