package conditionalStructure5;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int horainicial;
		int horafinal;
		int duracao;
		horainicial = sc.nextInt();
		horafinal = sc.nextInt();
		if(horainicial < horafinal  ) {
			duracao = horainicial - horafinal;
		}
		else {
			duracao = 24 - horainicial + horafinal;
		}
		System.out.println("O JOGO DUROU " + duracao + "HORAS(S)");
		
		
		sc.close();
	}
}