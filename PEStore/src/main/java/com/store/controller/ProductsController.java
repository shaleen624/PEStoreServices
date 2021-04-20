package com.store.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.store.model.Products;
import com.store.repository.ProductsRepository;

@RestController
//@RequestMapping(value = "/product")
public class ProductsController {
	private final Logger LOG = LoggerFactory.getLogger(getClass());
	private final ProductsRepository productsRepository;

	public ProductsController(ProductsRepository productsRepository) {
		this.productsRepository = productsRepository;
	}

//	@RequestMapping(value = "", method = RequestMethod.GET)
	@GetMapping("/products")
	public List<Products> getAllProducs() {
		LOG.info("Getting all products.");
		return productsRepository.findAll();
	}
//
//	@RequestMapping(value = "/{productId}", method = RequestMethod.GET)
//	public Optional<Products> getProduct(@PathVariable String productId) {
//		LOG.info("Getting product with ID: {}.", productId);
//		return productsRepository.findById(productId);
//	}

//	@RequestMapping(value = "/create", method = RequestMethod.POST)
//	@PostMapping(path = "/addProduct", consumes = "application/json", produces = "application/json")
//	public Products addNewProduct(@RequestBody Products product) {
//		LOG.info("Saving user.");
//		return productsRepository.save(product);
//	}

//	@RequestMapping(value = "/settings/{userId}", method = RequestMethod.GET)
//	public Object getAllUserSettings(@PathVariable String userId) {
//		User user = productsRepository.findOne(userId);
//		if (user != null) {
//			return user.getUserSettings();
//		} else {
//			return "User not found.";
//		}
//	}

//	@RequestMapping(value = "/settings/{userId}/{key}", method = RequestMethod.GET)
//	public String getUserSetting(@PathVariable String userId, @PathVariable String key) {
//		User user = productsRepository.findOne(userId);
//		if (user != null) {
//			return user.getUserSettings().get(key);
//		} else {
//			return "User not found.";
//		}
//	}

//	@RequestMapping(value = "/settings/{userId}/{key}/{value}", method = RequestMethod.GET)
//	public String addUserSetting(@PathVariable String userId, @PathVariable String key, @PathVariable String value) {
//		User user = productsRepository.findOne(userId);
//		if (user != null) {
//			user.getUserSettings().put(key, value);
//			productsRepository.save(user);
//			return "Key added";
//		} else {
//			return "User not found.";
//		}
//	}

}
