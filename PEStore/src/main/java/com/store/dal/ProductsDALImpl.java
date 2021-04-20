package com.store.dal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.store.model.Products;

@Repository
public class ProductsDALImpl implements ProductsDAL{
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	@Override
	public List<Products> getAllProducts() {
		return mongoTemplate.findAll(Products.class);
	}
	
	@Override
	public Products getProductById(String productId) {
		Query query = new Query();
		query.addCriteria(Criteria.where("userId").is(productId));
		return mongoTemplate.findOne(query, Products.class);
	}
	
	@Override
	public Products addNewProduct(Products product) {
		mongoTemplate.save(product);
		// Now, user object will contain the ID as well
		return product;
	}

}
