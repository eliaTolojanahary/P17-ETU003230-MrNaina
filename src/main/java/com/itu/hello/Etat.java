package com.itu.hello;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Etat {
     private Connection co;

     String libelle;
     int prevision;
     int depense;
     int reste;
    public Etat(String libelle,int prevision,int depense,int reste ){
     this.co = new Connexion().maconnMySQL();
     this.libelle=libelle;
     this.prevision=prevision;
     this.depense=depense;
     this.reste=reste;
    }
    public void setCo(Connection co) {
        this.co = co;
    }public void setDepense(int depense) {
        this.depense = depense;
    }public void setLibelle(String libelle) {
        this.libelle = libelle;
    }public void setPrevision(int prevision) {
        this.prevision = prevision;
    }public void setReste(int reste) {
        this.reste = reste;
    }
    public Connection getCo() {
        return co;
    }
    public int getDepense() {
        return depense;
    }public String getLibelle() {
        return libelle;
    }public int getPrevision() {
        return prevision;
    }public int getReste() {
        return reste;
    }
     
    public List<Etat> findAll() throws SQLException {
        List<Etat> listEtat = new ArrayList<>();

            if (co == null) {
                System.out.println("Erreur de connexion à la base de données.");
                return listEtat;
            }
            String sql = "select sum(depense.montant),prevision.libelle,prevision.montant,prevision.montant-sum(depense.montant) from prevision join depense on depense.idlibelle=prevision.id";
            try (PreparedStatement stmt = co.prepareStatement(sql);
                 ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    String nom = rs.getString("prevision.libelle");
                    int volaPrev = rs.getInt("prevision.montant");
                    int volaDep = rs.getInt("sum(depense.montant)");
                    int volaReste = rs.getInt("prevision.montant-sum(depense.montant)");
                    listEtat.add(new Etat(nom,volaPrev,volaDep,volaReste));
                }
            }
            //throw new SQLException("Compte non trouvé");
       
        return listEtat;
    }
    
}
