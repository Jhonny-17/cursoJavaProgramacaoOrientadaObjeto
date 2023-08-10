package com.jhonny.resolvendoprobl.sem.orientacao.ob;

import java.util.Locale;
import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangle_class x, y, a;

		x = new Triangle_class();
		y = new Triangle_class();
		a = new Triangle_class();

		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		System.out.println("Enter the measures of tiangle A: ");
		a.a = sc.nextDouble();
		a.b = sc.nextDouble();
		a.c = sc.nextDouble();

		double areaX = x.area();

		double areaY = y.area();
		
		double areaA = a.area();

		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		System.out.printf("Triangle A area: %.4f%n", areaA);


		if (areaX > areaY && areaX > areaA) {
			System.out.println("Larger area: X");
		} else {
			if(areaY > areaA) {	
				System.out.println("Larger area: Y");
			}
			else {
				System.out.println("Larger area: A");
			}
		}
		sc.close();
	}
}
