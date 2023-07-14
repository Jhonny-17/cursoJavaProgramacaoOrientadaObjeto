package com.jhonny.exerciciosdefixacao;

import java.util.Locale;
import java.util.Scanner;

public class usado_para_exemplos2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String original = "abcde FGHIJ ABC abc DEFG  ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xyz");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		
		
		
		System.out.println("Original: - " + original + "-");
		System.out.println("toLoweCase: -" + s01 + "-"); 
		System.out.println("toLoweUpper: -" + s02 + "-"); 
		System.out.println("trim: -" + s03 + "-"); 
		System.out.println("substring(2): -" + s04 + "-"); 
		System.out.println("substrin (2, 9): -" + s05 + "-"); 
		System.out.println("replace('a', 'x') -" + s06 + "-"); 
		System.out.println("replace'abc''xyz' -" + s07 + "-"); 
		System.out.println("Index of 'bc': " + i); 
		System.out.println("Last index of 'bc': " + j);


		
	
		
		sc.close();
	}
}
