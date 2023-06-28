package exercicio_de_fixacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_04 {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int  numerodofuncionario;
		double horastrabalhadas, valorporhora;

		
		numerodofuncionario = sc.nextInt();
		horastrabalhadas = sc.nextDouble();
		valorporhora = sc.nextDouble();

		
		double resultado = horastrabalhadas * valorporhora;
		
		System.out.println("Number = " + numerodofuncionario);
		System.out.printf("Salary = U$ %.2f%n", resultado);
		
		sc.close();
		
	}

}
