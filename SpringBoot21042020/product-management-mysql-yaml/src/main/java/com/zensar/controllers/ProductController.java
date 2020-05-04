package com.zensar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.entity.Product;
import com.zensar.repository.ProductRepository;

@RestController
public class ProductController {
	
	@Autowired
	private   ProductRepository repository;
	
	// CRUD -> Create,Read,Update,Delete

	// http://localhost:8080/products

	// @RequestMapping(value="/products",produces =
	// {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
	@GetMapping("/products")
	public Iterable<Product> getAllProducts() {
		return repository.findAll();
	}

	// http://localhost:8080/products/{productId}
	// @RequestMapping("/products/{productId}")
	@GetMapping("/products/{productId}")
	public Product getProduct(@PathVariable("productId") int productId) {
		// return repository.findById(productId).get();  // SB -> 2.2.6.RELEASE
		return repository.findOne(productId);   // SB -> 1.5.4.RELEASE
	}

	@PostMapping("/products")
	public void insertProduct(@RequestBody Product product) {
		repository.save(product);
	}

	@DeleteMapping("/products/{productId}")
	public void deleteProduct(@PathVariable("productId") int productId) {
		
		// repository.deleteById(productId);  // SB -> 2.2.6.RELEASE
		repository.delete(productId);  // SB -> 1.5.4.RELEASE

	}

	@PutMapping("/products")
	public void updateProduct(Product product) {
			repository.save(product);
	}

}
