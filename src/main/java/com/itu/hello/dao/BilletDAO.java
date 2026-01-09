package com.itu.hello.dao;

public interface BilletDAO {
    Billet create(Billet billet);
    Billet findById(Long id);
    List<Billet> findAll();
    Billet update(Billet billet);
    boolean delete(Long id);
}