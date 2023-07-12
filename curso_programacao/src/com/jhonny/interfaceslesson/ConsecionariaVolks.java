package com.jhonny.interfaceslesson;

import java.util.ArrayList;
import java.util.List;

public class ConsecionariaVolks {
	private List<Carro> estoque;
	
	public ConsecionariaVolks() {
		estoque = new ArrayList<>();
	}
	
	public void adicionaAoEstoque(PlataformaVolksWagen c) {
		estoque.add(c);
	}
}
