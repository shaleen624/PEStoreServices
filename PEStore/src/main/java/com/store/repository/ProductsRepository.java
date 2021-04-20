package com.store.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.store.model.Products;

@Repository
public interface ProductsRepository extends MongoRepository<Products, String>{

}
