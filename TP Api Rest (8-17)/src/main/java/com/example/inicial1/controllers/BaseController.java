package com.example.inicial1.controllers;

import java.io.Serializable;

import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.inicial1.entities.Base;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
public interface BaseController<T extends Base, ID extends Serializable> {
    public ResponseEntity<?> getAll();
    public ResponseEntity<?> getAll(Pageable pageable);
    public ResponseEntity<?> getOne(@PathVariable ID id);
    public ResponseEntity<?> save(@RequestBody T entity);
    public ResponseEntity<?> update(@PathVariable ID id,@RequestBody T entity);
    public ResponseEntity<?> delete(@PathVariable ID id);
} 
