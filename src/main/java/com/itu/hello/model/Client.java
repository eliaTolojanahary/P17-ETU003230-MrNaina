package com.itu.hello.model;

public class Client {
    private Long idClient;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private Long idTypeClient;

  
    public Client() {}

    public Client(Long idClient, String nom, String prenom, String email, String telephone, Long idTypeClient) {
        this.idClient = idClient;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.idTypeClient = idTypeClient;
    }

    public Long getIdClient() { return idClient; }
    public void setIdClient(Long idClient) { this.idClient = idClient; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelephone() { return telephone; }
    public void setTelephone(String telephone) { this.telephone = telephone; }

    public Long getIdTypeClient() { return idTypeClient; }
    public void setIdTypeClient(Long idTypeClient) { this.idTypeClient = idTypeClient; }

   
    
}