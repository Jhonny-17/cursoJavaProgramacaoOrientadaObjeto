package com.jhonny.returnvalordolar;

import java.util.Locale;
import java.util.Scanner;

public class Projetc {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("What is the dollar price? ");
		double precoDoDolar = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double preco = sc.nextDouble();
		double result = CurrencyConverter.dollarToReal(preco, precoDoDolar);
		System.out.printf("Amount to be paid in reais = %.2f%n", result);
		sc.close();
	}

}
