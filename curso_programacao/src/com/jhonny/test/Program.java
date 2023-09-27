package com.jhonny.test;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int attempt = 3;
		int password = sc.nextInt();
		
		
		for(int i = 0; i > attempt; i++) {
			while(password != 2002) {
				System.out.println("Password incorrect");
				sc.nextInt();
			}
		}
		sc.close();
	}

}
