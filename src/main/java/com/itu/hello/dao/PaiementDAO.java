package com.itu.hello.dao;

public interface PaiementDAO {
    Paiement create(Paiement paiement);
    Paiement findById(Long id);
    List<Paiement> findAll();
    Paiement update(Paiement paiement);
    boolean delete(Long id);
}
