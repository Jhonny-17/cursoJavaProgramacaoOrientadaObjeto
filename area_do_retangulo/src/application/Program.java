package application;

import java.util.Locale;

import entities.Rectangle;
import ui.UiUtils;

public class Program {

	public static void main(String[] args) {
		try (UiUtils ui = new UiUtils()) {
			Locale.setDefault(Locale.US);
			Rectangle rect = new Rectangle();

			rect.setWidth(ui.readNumber("Digite a largura:"));
			rect.setHeight(ui.readNumber("Digite a altura:"));

			System.out.printf("AREA = %.2f%n", rect.area());
			System.out.printf("PERIMETER = %.2f%n", rect.perimeter());
			System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());
		}
	}

}
