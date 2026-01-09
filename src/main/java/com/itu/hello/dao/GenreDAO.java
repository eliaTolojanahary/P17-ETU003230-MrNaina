package com.itu.hello.dao;

public interface GenreDAO {
    Genre create(Genre genre);
    Genre findById(Long id);
    List<Genre> findAll();
    Genre update(Genre genre);
    boolean delete(Long id);
}
