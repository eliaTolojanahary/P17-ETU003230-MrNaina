package com.itu.hello;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Admin {
    
    String nom;
    String mdp;
    private Connection co;
    public Admin(String nom,String mdp){
        this.co = new Connexion().maconnMySQL();
        this.nom=nom;
        this.mdp=mdp;
    }
    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getMdp() {
        return mdp;
    }
    public String getNom() {
        return nom;
    }
    public Boolean verificationCompte(String nom,String mdp) throws SQLException {
        if (co == null) {
            throw new SQLException("Erreur de connexion à la base de données.");
        }

        String sql = "SELECT COUNT(*) FROM user WHERE nom=? AND mdp=?";
        try (PreparedStatement stmt = co.prepareStatement(sql)) {
            stmt.setString(1, nom);
            stmt.setString(2, mdp);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0;
                }
            }
        }
        return false;
    }

}
