package com.itu.hello;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Depense {
     private Connection co;
    int id;
    int idlibelle;
    int montant;
    public Depense(int id,int idlibelle,int montant){
        this.co = new Connexion().maconnMySQL();
        this.idlibelle=idlibelle;
        this.montant=montant;
        this.id=id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setIdlibelle(int idlibelle) {
        this.idlibelle = idlibelle;
    }
    public void setMontant(int montant) {
        this.montant = montant;
    }
    public int getIdlibelle() {
        return idlibelle;
    }
    public int getMontant() {
        return montant;
    }

     public Boolean verifieMontant(int id,int argent) throws SQLException {
        int montant=sommeDepense(id) + argent;
        if (co == null) {
            throw new SQLException("Erreur de connexion à la base de données.");
        }

        String sql = "SELECT * FROM prevision WHERE id=?";
        try (PreparedStatement stmt = co.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    if(rs.getInt("montant") >= montant) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public int sommeDepense(int id) throws SQLException{
        if (co == null) {
            throw new SQLException("Erreur de connexion à la base de données.");
        }
        int somme=0;
        String sql = "SELECT sum(montant) FROM depense WHERE idLibelle=?";
        try (PreparedStatement stmt = co.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    somme= rs.getInt("sum(montant)");
                }
            }
        }
        return somme;
    }
    public List<Prevision> findAll() throws SQLException {
        List<Prevision> listPrev = new ArrayList<>();

            if (co == null) {
                System.out.println("Erreur de connexion à la base de données.");
                return listPrev;
            }
            String sql = "SELECT * FROM depense";
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
    
            String sql = "INSERT INTO depense (idlibelle,montant) VALUES(?,?)";
            try (PreparedStatement stmt = co.prepareStatement(sql)) {
                stmt.setInt(1, this.getIdlibelle());
                stmt.setInt(2, this.getMontant());
                //stmt.setString(3, type); 
                return stmt.executeUpdate();
            }
    }
}
