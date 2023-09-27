package com.jhonny.conditional_structure;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number;
		int numbertwo;
		number = sc.nextInt();
		numbertwo = sc.nextInt();
		
		if(number%numbertwo == 0 || numbertwo%number == 0 ) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
		
		sc.close();
	}
}