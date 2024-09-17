package com.example.inicial1.services;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BaseService<T> {
public List<T> findAll() throws Exception;
public T findById(Long id) throws Exception;
public T save(T entity) throws Exception;
public T update(Long id, T entity) throws Exception;
public boolean delete(Long id) throws Exception;
}
