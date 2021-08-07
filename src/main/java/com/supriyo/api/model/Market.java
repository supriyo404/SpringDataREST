package com.supriyo.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Market_table")
public class Market {
	
	@Id
	@GeneratedValue
	private int Item_ID;
	private String Item_Name;
	private String Item_Category;
	private double Price;
	private String manufacture_date;
	
	//Getter setter for Item ID
	public int getItem_ID() {
		return Item_ID;
	}
	public void setItem_ID(int item_ID) {
		Item_ID = item_ID;
	}
	
	//Getter setter for Item Name
	public String getItem_Name() {
		return Item_Name;
	}
	public void setItem_Name(String item_Name) {
		Item_Name = item_Name;
	}
	//Getter setter for Category
	
	public String getItem_Category() {
		return Item_Category;
	}
	public void setItem_Category(String item_Category) {
		Item_Category = item_Category;
	}
	//Getter setter for Price
	
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	
	//Getter setter for Manu Date
	public String getManufacture_date() {
		return manufacture_date;
	}
	public void setManufacture_date(String manufacture_date) {
		this.manufacture_date = manufacture_date;
	}
	

}
