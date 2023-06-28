package exercicio_de_fixacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_06 {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double baseA, baseB, alturaC, totalT, totalC, totalTp, totalQ, totalR;
		
		baseA = sc.nextDouble();
		baseB = sc.nextDouble();
		alturaC = sc.nextDouble();
		
		
		totalT = baseA * alturaC/2;
		totalC = Math.pow(alturaC, 2) * 3.14159;
		totalTp = (baseA + baseB) * alturaC/2;
		totalQ = Math.pow(baseB, 2);
		totalR = baseA * baseB;
		
		
		System.out.printf("TRIANGULO:%.3f%n", totalT);
		System.out.printf("CIRCULO:%.3f%n", totalC);
		System.out.printf("TRAPEZIO:%.3f%n", totalTp);
		System.out.printf("QUADRADO:%.3f%n", totalQ);
		System.out.printf("RETANGULO:%.3f%n", totalR);


		
		sc.close();
	}

}
