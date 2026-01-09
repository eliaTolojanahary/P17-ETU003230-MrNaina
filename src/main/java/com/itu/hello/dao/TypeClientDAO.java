package com.itu.hello.dao;

public interface TypeClientDAO {
    TypeClient create(TypeClient typeClient);
    TypeClient findById(Long id);
    List<TypeClient> findAll();
    TypeClient update(TypeClient typeClient);
    boolean delete(Long id);
}