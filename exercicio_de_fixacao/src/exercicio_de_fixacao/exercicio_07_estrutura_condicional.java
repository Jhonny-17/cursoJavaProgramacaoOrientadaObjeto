package exercicio_de_fixacao;

import java.util.Scanner;

public class exercicio_07_estrutura_condicional {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int numero, numero2;
		numero = sc.nextInt();
		numero2 = sc.nextInt();
		if (numero % numero2 == 0 || numero2 % numero == 0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
		
		
		sc.close();
	}

}
