package com.jhonny.returnmateri;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		//List<Product> list = new ArrayList<>();
		Product product = new Product();
		
		//System.out.print("How many products are you going to type?: ");
		//int numberproducts = sc.nextInt();

		
		//for (int i = 0; i < numberproducts; i++) {

			System.out.println("Enter product data: ");
			System.out.print("Name: ");
			product.name = sc.next();
			System.out.print("Price: ");
			product.price = sc.nextDouble();
			System.out.print("Quantity in stock: ");
			product.quantity = sc.nextInt();
			//list.add(product);
		//}			
		
		System.out.println("Product data: " + product);
		System.out.println("Enter the number of products to bem added in stock: ");
		int quanatity = sc.nextInt();
		product.addProducts(quanatity);
		
		System.out.println("Updated data: " + product);
		
		
		
		
		sc.close();
	}

}
