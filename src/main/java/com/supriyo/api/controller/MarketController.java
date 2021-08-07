package com.supriyo.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.supriyo.api.Service.MarketService;
import com.supriyo.api.model.Market;

@RestController
@RequestMapping("/public/v1")
public class MarketController {

	@Autowired
	private MarketService service;

	@PostMapping("/addProduct")
	public Market SaveProduct(Market product) {

		return service.SaveItem(product);
	}
	
	@PostMapping("/addProducts")
	public List<Market> SaveProducts(List<Market> products) {

		return service.SaveItems(products);
	}
	
	@GetMapping("/findAllProducts")
	public List<Market> findAllProducts() {

		return service.GetItems();
	}
	
	@GetMapping("/findProduct/{id}")
	public Market findProductbyId(@PathVariable int id) {

		return service.GetItemByID(id);
	}
	
	@GetMapping("/findProduct/{name}")
	public List<Market> findProductbyName(@PathVariable String name) {

		return service.GetItemsbyName(name);
	}
	
	@PutMapping("/update")
	public Market UpdateProduct(@RequestBody Market product) {
		return service.UpdateProduct(product);
	}
	
	@DeleteMapping("/remove/{id}")
	public String deleteProduct(@PathVariable int id) {
		
		return service.DeleteProduct(id);
	}
	
	
}
