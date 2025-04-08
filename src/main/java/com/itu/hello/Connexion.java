package com.itu.hello;
// Source code is decompiled from a .class file using FernFlower decompiler.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {
   private String MYSQL_URL = "jdbc:mysql://172.80.237.54/db_s2_ETU003230?useSSL=false&serverTimezone=UTC";
   private String MYSQL_USER = "ETU003230";
   private String MYSQL_PASSWORD = "3uA9G3QM";

   static {
       try {
           // Chargement explicite du driver (optionnel avec JDBC 4.0+ mais parfois nécessaire)
           Class.forName("com.mysql.cj.jdbc.Driver");
       } catch (ClassNotFoundException e) {
           throw new ExceptionInInitializerError("MySQL JDBC Driver not found");
       }
   }

   public Connection maconnMySQL() {
       try {
           System.out.println("Tentative de connexion à : " + this.MYSQL_URL);
           Connection conn = DriverManager.getConnection(MYSQL_URL, MYSQL_USER, MYSQL_PASSWORD);
           System.out.println("Connexion MySQL réussie.");
           return conn;
       } catch (SQLException e) {
           System.err.println("Erreur de connexion MySQL :");
           e.printStackTrace();
           return null;
       }
   }

   // ... reste de la classe inchangé


   public void fermerConnexion(Connection var1) {
      try {
         if (var1 != null && !var1.isClosed()) {
            var1.close();
            System.out.println("Connexion fermÃ©e avec succÃ¨s.");
         }
      } catch (SQLException var3) {
         System.out.println("Erreur lors de la fermeture de la connexion : " + var3.getMessage());
      }

   }
}
