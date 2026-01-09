package com.itu.hello.dao;

public interface StatutPaiementDAO {
    StatutPaiement create(StatutPaiement statut);
    StatutPaiement findById(Long id);
    List<StatutPaiement> findAll();
    StatutPaiement update(StatutPaiement statut);
    boolean delete(Long id);
}