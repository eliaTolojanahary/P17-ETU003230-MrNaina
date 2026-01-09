package com.itu.hello.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static DBConnection instance;
    private Connection connection;
    
    private final String URL = "jdbc:postgresql://127.0.0.1:5432/cinema";
    private final String USER = "postgres";
    private final String PASSWORD = ""; 

    static {
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver PostgreSQL chargé avec succès.");
        } catch (ClassNotFoundException e) {
            throw new ExceptionInInitializerError("Driver PostgreSQL non trouvé: " + e.getMessage());
        }
    }

    private DBConnection() {
        // Constructeur privé pour empêcher l'instanciation directe
    }

    public static synchronized DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }

    public Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                System.out.println("Tentative de connexion à : " + URL);
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Connexion PostgreSQL établie avec succès.");
            }
        } catch (SQLException e) {
            System.err.println("Erreur de connexion PostgreSQL:");
            e.printStackTrace();
            throw new RuntimeException("Impossible d'établir la connexion à la base de données", e);
        }
        return connection;
    }

    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Connexion fermée avec succès.");
            }
        } catch (SQLException e) {
            System.err.println("Erreur lors de la fermeture de la connexion: " + e.getMessage());
        }
    }

    // Méthode pour tester la connexion
    public boolean testConnection() {
        try (Connection testConn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            return testConn.isValid(2); // Timeout de 2 secondes
        } catch (SQLException e) {
            System.err.println("Test de connexion échoué: " + e.getMessage());
            return false;
        }
    }
}