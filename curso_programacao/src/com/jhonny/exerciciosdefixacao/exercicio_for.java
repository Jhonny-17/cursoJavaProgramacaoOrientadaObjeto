package com.jhonny.exerciciosdefixacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_for {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = 10; 
		
		
		for (int i=1; i<=x; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}
}