package com.example.inicial1.repositories;

import java.io.Serializable;
import org.springframework.data.repository.NoRepositoryBean;
import com.example.inicial1.entities.Base;
import org.springframework.data.jpa.repository.JpaRepository;

@NoRepositoryBean
public interface BaseRepository<E extends Base, ID extends Serializable> extends JpaRepository<E, ID> {
    
}