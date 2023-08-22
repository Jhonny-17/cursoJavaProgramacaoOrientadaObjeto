package com.jhonny.setexercicioproposto;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<Integer> classone = new HashSet<>();
		Set<Integer> classtwo = new HashSet<>();
		Set<Integer> classthree = new HashSet<>();
		
		System.out.print("How many students for course A?");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int student = sc.nextInt();
			classone.add(student);
		}
		System.out.print("How many students for course B?");
		int x = sc.nextInt();

		for (int i = 0; i < x; i++) {
			int student = sc.nextInt();
			classtwo.add(student);
		}
		System.out.print("How many students for course C?");
		int z = sc.nextInt();

		for (int i = 0; i < z; i++) {
			int student = sc.nextInt();
			classthree.add(student);
		}
		
		Set<Integer> total = new HashSet<>(classone);
		total.addAll(classtwo);
		total.addAll(classthree);
		
		System.out.println("Total students: " + total.size());
		
		sc.close();
	}

}
