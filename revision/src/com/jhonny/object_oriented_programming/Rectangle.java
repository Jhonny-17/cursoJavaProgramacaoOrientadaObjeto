package com.jhonny.object_oriented_programming;

public class Rectangle {
	
	public Double width;
	public Double height;
	
	public Rectangle() {
	}
	public Rectangle(Double width, Double height) {
		this.width = width;
		this.height = height;
	}
	public Double area() {
		return height * width;
	}
	public Double perimeter() {
		return 2 * (width + height);
	}
	public Double diagonal() {
		return Math.sqrt(width * width + height * height);
	}
	
}
