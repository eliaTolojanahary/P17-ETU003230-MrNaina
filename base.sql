CREATE DATABASE gestionMontant;
USE gestionMontant;
CREATE TABLE depense(
    id INT AUTO_INCREMENT PRIMARY KEY,
    idlibelle INT,
    montant INT NOT NULL DEFAULT 0
);

CREATE TABLE prevision (
    id INT AUTO_INCREMENT PRIMARY KEY,
    libelle VARCHAR(50),
    montant INT NOT NULL DEFAULT 0
);

CREATE TABLE user(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(50),
    mdp VARCHAR(50)
);
INSERT INTO user(nom,mdp) VALUES('Admin','admin123');

