package com.jhonny.exerciciosdefixacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double nroA = 2;
		double nroC = 2;

		sc.nextDouble();
		double resultado = nroC * Math.pow(nroA, 5.0);

		System.out.printf("A= %.4f%n", resultado);

		sc.close();

	}

}
