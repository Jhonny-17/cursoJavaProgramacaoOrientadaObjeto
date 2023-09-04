package conditionalStructure5;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number;
		number = sc.nextInt();
		
		if(number%2 == 0 ){
			System.out.println("Par");
		}
		else {
			System.out.println("Impar");
		}
		sc.close();
	}
}