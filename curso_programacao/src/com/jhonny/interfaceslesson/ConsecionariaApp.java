package com.jhonny.interfaceslesson;

import java.util.List;

public class ConsecionariaApp {
	List<Carro> estoque;
	

	public static void main(String[] args) {
		ConsecionariaVolks garagemVolks = new ConsecionariaVolks();
		
		Gol g = new Gol();
		garagemVolks.adicionaAoEstoque(g);
		
		Saveiro s = new Saveiro();
		garagemVolks.adicionaAoEstoque(s);
		
		PlataformaVolksWagen pv = new Gol();
		garagemVolks.adicionaAoEstoque(pv);
		
		Gol g2 = new Gol();
		garagemVolks.adicionaAoEstoque(g2);
	}
	
	
}
