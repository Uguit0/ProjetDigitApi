package com.example.ProjetDigitApi2;

import java.util.ArrayList;
import java.util.List;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

	private List<String> products;

	public ProductController() {
	      products = new ArrayList<>();
	      products.add("Produit 1");
	      products.add("Produit 2");
	}

	@GetMapping
	public List<String> getAllProducts() {
		return products;
	}

	@GetMapping("/{id}")
    public String getProduct(@PathVariable int id) {
        if (id >= 0 && id < products.size()) {
            return products.get(id);
        }
        return null;
    }

	@PostMapping
	public void addProduct(@RequestBody String productName) {
		products.add(productName);
	}

	@DeleteMapping("/{id}")
	public void deleteProduct(@PathVariable int id) {
	    if (id >= 0 && id < products.size()) {
	        products.remove(id);
	       }
	   }

}