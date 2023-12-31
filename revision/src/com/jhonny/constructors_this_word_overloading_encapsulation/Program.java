package com.jhonny.constructors_this_word_overloading_encapsulation;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product prod = new Product();

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		prod.name = sc.next();
		System.out.print("Price: ");
		prod.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		prod.quantity = sc.nextInt();

		System.out.println();
		System.out.println("Product data: " + prod.toString());

		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		prod.addProducts(sc.nextInt());

		System.out.println();
		System.out.println("Updated data: " + prod.toString());

		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		prod.removeProducts(sc.nextInt());

		System.out.println();
		System.out.println("Updated data: " + prod.toString());

		sc.close();
	}

}
