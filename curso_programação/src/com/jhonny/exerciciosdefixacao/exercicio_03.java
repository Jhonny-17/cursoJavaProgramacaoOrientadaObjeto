package com.jhonny.exerciciosdefixacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int powA, powB, powC, powD, powE;
		
		powA = sc.nextInt();
		powB = sc.nextInt();
		powC = sc.nextInt();
		powD = sc.nextInt();
		
		powE = powA * powB - powC * powD;
		
		System.out.println("Diferenca = " + powE);
		
		sc.close();
		
	}

}
