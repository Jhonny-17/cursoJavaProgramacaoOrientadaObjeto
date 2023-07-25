package com.jhonny.revisaodamateria;

import java.util.Locale;
import java.util.Scanner;

public class calculos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x;
		x = sc.nextDouble();
		System.out.printf("Você digitou: %.1f%n", x);
	
		char y;
		y = sc.next().charAt(5);
		System.out.println("Você digitou: " + y);

		
		
		
		sc.close();
	}

}
