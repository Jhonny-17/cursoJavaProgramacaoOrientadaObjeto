package com.jhonny.desafios;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class PilhaTest {

	@Test
	void test() {
		Pilha<Integer> p = new PilhaJhonny();
		
		assertEquals(p.toArray().length, 0, "O array deveria ter zero elementos");
		
		Integer[] gabarito = {10, 9, 8};
		
		for(int n : gabarito) {
			p.pull(n);
		}
		
		assertEquals(p.toArray().length, gabarito.length, "O array deveria ter tamanho: " + gabarito.length);
		
		for(int i = gabarito.length -1; i >= 0; i--) {
			int valor = p.pop();
			
			StringBuilder msg = new StringBuilder();
			msg
			.append("O indice ")
			.append(i)
			.append(" deveria ter os valores ")
			.append(valor).append(" e ").append(gabarito[i])
			.append("");
			
			assertEquals(valor, gabarito[i], msg.toString() );
			System.out.println(msg);
		}
		
			
	}

}
