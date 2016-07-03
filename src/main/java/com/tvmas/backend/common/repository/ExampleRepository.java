package com.tvmas.backend.common.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.tvmas.backend.common.domain.Example;

//public interface ExampleRepository extends Repository<Example, String> {
public interface ExampleRepository extends CrudRepository<Example, Long> {
	
    void delete(Example deleted);
    
    List<Example> findAll();

 
	Example save(Example saved);
}
