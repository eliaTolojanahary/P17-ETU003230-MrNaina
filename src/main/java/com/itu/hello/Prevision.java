package com.itu.hello;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Prevision{
    private Connection co;
    String libelle;
    int montant;
    int id;
    public Prevision(int id,String  libelle,int montant)throws SQLException{
        this.co = new Connexion().maconnMySQL();
        this.libelle=libelle;
        this.id=id;
        this.montant=montant;
    }
   public void setLibelle(String libelle) {
       this.libelle = libelle;
   }
   public void setId(int id) {
       this.id = id;
   }
   public int getId() {
       return id;
   }
   public void setMontant(int montant) {
       this.montant = montant;
   }
   public String getLibelle() {
       return libelle;
   }
   public int getMontant() {
       return montant;
   }
    public List<Prevision> findAll() throws SQLException {
        List<Prevision> listPrev = new ArrayList<>();

            if (co == null) {
                System.out.println("Erreur de connexion à la base de données.");
                return listPrev;
            }
            String sql = "SELECT * FROM prevision";
            try (PreparedStatement stmt = co.prepareStatement(sql);
                 ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String nom = rs.getString("libelle");
                    int vola = rs.getInt("montant");
                    listPrev.add(new Prevision(id,nom,vola));
                }
            }
            //throw new SQLException("Compte non trouvé");
       
        return listPrev;
    }
    public int save() throws SQLException {
        
            if (co == null) {
                throw new SQLException("Erreur de connexion à la base de données");
            }
    
            String sql = "INSERT INTO prevision (libelle,montant) VALUES(?,?)";
            try (PreparedStatement stmt = co.prepareStatement(sql)) {
                stmt.setString(1, this.getLibelle());
                stmt.setInt(2, this.getMontant());
                //stmt.setString(3, type); 
                return stmt.executeUpdate();
            }
    }
    public Boolean verificationprev(String nom) throws SQLException {
        if (co == null) {
            throw new SQLException("Erreur de connexion à la base de données.");
        }

        String sql = "SELECT COUNT(*) FROM prevision WHERE libelle=?";
        try (PreparedStatement stmt = co.prepareStatement(sql)) {
            stmt.setString(1, nom);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    if(rs.getInt(1) > 0){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
