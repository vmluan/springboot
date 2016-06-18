package com.tvmas.backend.common.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.Repository;

import com.tvmas.backend.common.domain.Example;

public interface ExampleRepository extends Repository<Example, String> {
    void delete(Example deleted);
    
    List<Example> findAll();
 
    Optional<Example> findOne(String id);
 
	Example save(Example saved);
}
