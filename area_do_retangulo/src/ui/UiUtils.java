package ui;

import java.util.Scanner;

public class UiUtils implements AutoCloseable{
	private Scanner sc = new Scanner(System.in);
	
	public int readNumber(String s) {
			int result = 0;

			while (result <= 0) {
				System.out.println(s);
				result = sc.nextInt();

				if (result < 0) {
					System.out.println("Por favor, digite um número válido!\n");
				}
			}

			return result;
	}
	
	public void close() {
		sc.close();
	}
}
