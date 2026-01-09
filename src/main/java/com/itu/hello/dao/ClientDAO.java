package com.itu.hello.dao;

import com.itu.hello.model.*;
import com.itu.hello.util.*;
import jakarta.servlet.ServletException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;

public class ClientDAO {
    private DBConnection connexion = new DBConnection();
    
    private void create() {
        String sql = "INSERT INTO client (nom, prenom, email, telephone, id_type_client) " +
                     "VALUES (?, ?, ?, ?, ?)";
        
        try (Connection conn = DBConnection.getInstance().getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            
            stmt.setString(1, this.nom);
            stmt.setString(2, this.prenom);
            stmt.setString(3, this.email);
            stmt.setString(4, this.telephone);
            stmt.setLong(5, this.idTypeClient);
            
            int affectedRows = stmt.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("La création du client a échoué, aucune ligne affectée.");
            }
            
            try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    this.idClient = generatedKeys.getLong(1);
                } else {
                    throw new SQLException("La création du client a échoué, aucun ID généré.");
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erreur lors de la création du client: " + e.getMessage(), e);
        }
    }

    private void update() {
        String sql = "UPDATE client SET nom = ?, prenom = ?, email = ?, " +
                     "telephone = ?, id_type_client = ? WHERE id_client = ?";
        
        try (Connection conn = DBConnection.getInstance().getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, this.nom);
            stmt.setString(2, this.prenom);
            stmt.setString(3, this.email);
            stmt.setString(4, this.telephone);
            stmt.setLong(5, this.idTypeClient);
            stmt.setLong(6, this.idClient);
            
            int rows = stmt.executeUpdate();
            if (rows == 0) {
                throw new SQLException("Client non trouvé pour mise à jour");
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erreur lors de la mise à jour du client: " + e.getMessage(), e);
        }
    }

    public void delete() {
        if (this.idClient == null) {
            throw new IllegalStateException("Impossible de supprimer un client sans ID");
        }
        
        String sql = "DELETE FROM client WHERE id_client = ?";
        
        try (Connection conn = DBConnection.getInstance().getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setLong(1, this.idClient);
            stmt.executeUpdate();
            this.idClient = null;
        } catch (SQLException e) {
            throw new RuntimeException("Erreur lors de la suppression du client: " + e.getMessage(), e);
        }
    }

  
    public static Client findById(Long id) {
        String sql = "SELECT * FROM client WHERE id_client = ?";
        
        try (Connection conn = DBConnection.getInstance().getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setLong(1, id);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                return mapResultSetToClient(rs);
            }
            return null;
        } catch (SQLException e) {
            throw new RuntimeException("Erreur lors de la recherche du client: " + e.getMessage(), e);
        }
    }

    public static List<Client> findAll() {
        String sql = "SELECT * FROM client ORDER BY nom, prenom";
        List<Client> clients = new ArrayList<>();
        
        try (Connection conn = DBConnection.getInstance().getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                clients.add(mapResultSetToClient(rs));
            }
            return clients;
        } catch (SQLException e) {
            throw new RuntimeException("Erreur lors de la récupération des clients: " + e.getMessage(), e);
        }
    }

    public static List<Client> findByNom(String nom) {
        String sql = "SELECT * FROM client WHERE nom LIKE ? ORDER BY nom, prenom";
        List<Client> clients = new ArrayList<>();
        
        try (Connection conn = DBConnection.getInstance().getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, "%" + nom + "%");
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                clients.add(mapResultSetToClient(rs));
            }
            return clients;
        } catch (SQLException e) {
            throw new RuntimeException("Erreur lors de la recherche par nom: " + e.getMessage(), e);
        }
    }


    private static Client mapResultSetToClient(ResultSet rs) throws SQLException {
        Client client = new Client();
        client.setIdClient(rs.getLong("id_client"));
        client.setNom(rs.getString("nom"));
        client.setPrenom(rs.getString("prenom"));
        client.setEmail(rs.getString("email"));
        client.setTelephone(rs.getString("telephone"));
        client.setIdTypeClient(rs.getLong("id_type_client"));
        return client;
    }

    @Override
    public String toString() {
        return "Client{" +
                "idClient=" + idClient +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", idTypeClient=" + idTypeClient +
                '}';
    }
}