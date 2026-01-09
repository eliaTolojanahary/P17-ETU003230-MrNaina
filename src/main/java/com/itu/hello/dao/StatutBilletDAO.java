package com.itu.hello.dao;

public interface StatutBilletDAO {
    StatutBillet create(StatutBillet statut);
    StatutBillet findById(Long id);
    List<StatutBillet> findAll();
    StatutBillet update(StatutBillet statut);
    boolean delete(Long id);
}