package com.jhonny.exerciciosdefixacao;

import java.util.Scanner;

public class exercicio_07_estrutura_condicional2 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int numero;
		numero = sc.nextInt();
		
		if (numero < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NAO NEGATIVO");
		}
		
		
		sc.close();
	}

}
