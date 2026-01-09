package com.itu.hello.dao;

public interface FilmDAO {
    Film create(Film film);
    Film findById(Long id);
    List<Film> findAll();
    Film update(Film film);
    boolean delete(Long id);
}