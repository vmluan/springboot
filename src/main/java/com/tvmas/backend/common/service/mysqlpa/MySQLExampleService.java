package com.tvmas.backend.common.service.mysqlpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tvmas.backend.common.domain.Example;
import com.tvmas.backend.common.repository.ExampleRepository;
import com.tvmas.backend.common.service.ExampleService;
/*
 * We dont need to create this class. We can use MongoDBExampleService instead.
 */
@Service
public class MySQLExampleService implements ExampleService{
	
	@Autowired
	private ExampleRepository exampleRepository;

	@Override
	public Example create(Example todo) {
		return exampleRepository.save(todo);
	}

	@Override
	public Example delete(String id) {
		return null;
	}

	@Override
	public List<Example> findAll() {
		// TODO Auto-generated method stub
		return exampleRepository.findAll();
	}

	@Override
	public Example findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Example update(Example todo) {
		// TODO Auto-generated method stub
		return null;
	}

}
