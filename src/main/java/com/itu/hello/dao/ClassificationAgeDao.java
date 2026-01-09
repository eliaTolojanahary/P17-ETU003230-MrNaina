package com.itu.hello.dao;

public interface ClassificationAgeDAO {
    ClassificationAge create(ClassificationAge classification);
    ClassificationAge findById(Long id);
    List<ClassificationAge> findAll();
    ClassificationAge update(ClassificationAge classification);
    boolean delete(Long id);
}