package com.org.EurekaClientDemo.repo;

import org.springframework.data.repository.CrudRepository;

import com.org.EurekaClientDemo.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
