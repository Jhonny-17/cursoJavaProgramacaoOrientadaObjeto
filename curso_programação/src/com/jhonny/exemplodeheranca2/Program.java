package com.jhonny.exemplodeheranca2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> list = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int i = sc.nextInt();
		for (i = 1; i <= i; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char type = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Preco: ");
			double price = sc.nextDouble();
			if (type == 'c') {
				list.add(new Product(name, price));
			} else if (type == 'u') {
				System.out.print("Data de fabricacao (DD/MM/YYYY): ");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new UsedProduct(name, price, date));
			} else {
				System.out.print("Taxa de importacao: ");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			}

			System.out.println();
			System.out.println("ETIQUETAS DE PRECO: ");
			for (Product prod : list) {
				System.out.println(prod.priceTag());
			}

		}
		sc.close();
	}

}
