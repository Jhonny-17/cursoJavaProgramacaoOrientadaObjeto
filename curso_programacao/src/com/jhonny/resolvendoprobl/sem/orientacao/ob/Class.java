package com.jhonny.resolvendoprobl.sem.orientacao.ob;

public class Class {

	public double a;
	public double b;
	public double c;
	
	
	public double area() {
	
		double p = (a+ b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
		
		
	}
	
	
}


