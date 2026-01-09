package com.itu.hello.dao;

public interface PlaceDAO {
    Place create(Place place);
    Place findById(Long id);
    List<Place> findAll();
    Place update(Place place);
    boolean delete(Long id);
}
