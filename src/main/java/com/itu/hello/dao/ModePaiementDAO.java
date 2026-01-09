package com.itu.hello.dao;

public interface ModePaiementDAO {
    ModePaiement create(ModePaiement mode);
    ModePaiement findById(Long id);
    List<ModePaiement> findAll();
    ModePaiement update(ModePaiement mode);
    boolean delete(Long id);
}