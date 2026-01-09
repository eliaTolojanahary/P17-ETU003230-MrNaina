package com.itu.hello.dao;

public interface SalleDAO {
    Salle create(Salle salle);
    Salle findById(Long id);
    List<Salle> findAll();
    Salle update(Salle salle);
    boolean delete(Long id);
}