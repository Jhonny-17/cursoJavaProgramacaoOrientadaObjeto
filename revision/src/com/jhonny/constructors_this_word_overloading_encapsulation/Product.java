package com.jhonny.constructors_this_word_overloading_encapsulation;

public class Product {
	
	public String name;
	public Double price;
	public Integer quantity;
	
	public Product(){
	}

	public Product(String name, Double price, Integer quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public double totalValueInStock() {
		return quantity * price;
	}
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + "," + quantity + " units, Total: $ " + String.format("%.2f", totalValueInStock()) ; 
	}
}
