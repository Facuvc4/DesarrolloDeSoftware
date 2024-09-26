package com.example.inicial1.services;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import com.example.inicial1.entities.Base;
import com.example.inicial1.repositories.BaseRepository;

import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public abstract class BaseServiceImpl <T extends Base, ID extends Serializable> implements BaseService<T, ID> {
    protected BaseRepository<T, ID> baseRepository;
    public BaseServiceImpl(BaseRepository<T, ID> baseRepository) {
        this.baseRepository = baseRepository;
    }

    @Override
    @Transactional
    public List<T> findAll() throws Exception {
        try {
            List<T> entities = baseRepository.findAll();
            return entities;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Page<T> findAll(Pageable pageable) throws Exception {
        try {
            Page<T> entities = baseRepository.findAll(pageable);
            return entities;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public T findById(ID id) throws Exception {
        try {
            Optional<T> entityOptional = baseRepository.findById(id);
            return entityOptional.get();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
                }
    }

    @Override
    @Transactional
    public T save(T entity) throws Exception {
        try {
            entity = baseRepository.save(entity);
            return entity;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public T update(ID id, T entity) throws Exception {
        try {
            Optional<T> entityOptional = baseRepository.findById(id);
            T objeto = entityOptional.get();
            objeto = baseRepository.save(entity);
            return objeto;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(ID id) throws Exception {
        try {
            if (baseRepository.existsById(id)) {
                baseRepository.deleteById(id);
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
