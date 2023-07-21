package com.vikram.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vikram.service.IProductService;
import com.vikram.vo.Product;

@RestController
public class ProductController {
	@Autowired
	private IProductService productService;

//mapping the getProduct() method to /product
	@GetMapping(value = "/product")
	public List<Product> getProduct() {
//finds all the products
		List<Product> products = productService.findAll();
//returns the product list
		return products;
	}
}
