package com.supriyo.api.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.supriyo.api.model.Market;
import com.supriyo.api.repo.MarketRepo;

@Service
public class MarketService {

	@Autowired
	private MarketRepo repo;

	public Market SaveItem(Market market) {

		return repo.save(market);
	}

	public Iterable<Market> SaveItems(List<Market> markets) {

		return repo.saveAll(markets);
	}
	
	public Iterable<Market> GetItems(){
		
		return repo.findAll();
	}
	
	public Market GetItemByID(int id) {
		
		return repo.findById(id).orElse(null);
	}
	
	public List<Market> GetItemsbyName(String name){
		
		return repo.findByItem_Name(name);
	}
	
	public Market UpdateProduct(Market market) {
		
		Market ExistingProduct = repo.findById(market.getItem_ID()).orElse(new Market());
		ExistingProduct.setItem_Category(market.getItem_Category());
		ExistingProduct.setItem_Name(market.getItem_Name());
		ExistingProduct.setManufacture_date(market.getManufacture_date());
		ExistingProduct.setPrice(market.getPrice());
		
		return repo.save(ExistingProduct);
		
	}
	
	public String DeleteProduct(int id) {
		
		repo.deleteById(id);
		return "Product Deleted from DB -- "+id;
	}
	
}
