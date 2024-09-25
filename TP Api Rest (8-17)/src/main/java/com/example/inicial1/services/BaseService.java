package com.example.inicial1.services;

import org.springframework.stereotype.Service;

import com.example.inicial1.entities.Base;

import java.io.Serializable;
import java.util.List;

@Service
public interface BaseService<T extends Base, ID extends Serializable> {
public List<T> findAll() throws Exception;
public T findById(ID id) throws Exception;
public T save(T entity) throws Exception;
public T update(ID id, T entity) throws Exception;
public boolean delete(ID id) throws Exception;
}
