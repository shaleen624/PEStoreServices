package com.store.dal;

import java.util.List;

import com.store.model.Products;

public interface ProductsDAL {
	
	List<Products> getAllProducts();

	Products getProductById(String productId);

	Products addNewProduct(Products product);

}
