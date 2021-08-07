package com.supriyo.api.repo;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.supriyo.api.model.Market;


public interface MarketRepo extends CrudRepository<Market, Integer>
{	
	public List<Market> findByItem_Name(String name);
	
}
