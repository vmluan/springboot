package com.tvmas.backend.common.service;
import java.util.List;

import com.tvmas.backend.common.domain.Example;

public interface ExampleService {
 
    Example create(Example todo);
 
    Example delete(String id);
 
    List<Example> findAll();
 
    Example findById(String id);
 
    Example update(Example todo);
}
