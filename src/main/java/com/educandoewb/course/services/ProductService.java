package com.educandoewb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoewb.course.entities.Product;
import com.educandoewb.course.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll() {
		return repository.findAll();
	}
	
	public Product findBtId(long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
