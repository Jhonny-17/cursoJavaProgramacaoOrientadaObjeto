package com.jhonny.revisaodamateria;

import java.util.Locale;
import java.util.Scanner;

public class calculos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		double y = sc.nextDouble();
		
		double mult = x * y;
		double divis = x/y;
		double som = x + y;
		
		System.out.printf("Operações: " + mult + ";" + divis + ";" + som);
		sc.close();
	}

}
