package com.jhonny.exerciciosdefixacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_while {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minha_senha = sc.nextInt();
		
		while (minha_senha != 2002){
		
				System.out.println("Senha Invalida");
				minha_senha = sc.nextInt();	
		}
		
		System.out.println("Acesso Permitido");
		
		
		
		sc.close();
	}
}
