package com.supriyo.api;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.supriyo.api.model.Market;


public interface MarketRepo extends JpaRepository<Market, Integer> 
{	
	public List<Market> findByItem_Name(String name);
	
}
