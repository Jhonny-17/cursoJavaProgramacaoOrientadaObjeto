package com.jhonny.desafios;

import java.util.ArrayList;
import java.util.List;

public class PilhaJhonny implements Pilha<Integer> {

	
	private List<Integer> elementos = new ArrayList<>();
	
	@Override
	public void pull(Integer item) {
		elementos.add(item);		
	}

	@Override
	public Integer pop() {
		if(isEmpty()) {
			throw new IllegalStateException("A pilha está vazia");
		}
		return elementos.remove(elementos.size() - 1);
	}

	@Override
	public boolean exist(Integer item) {
		return elementos.contains(item);
	}

	@Override
	public Integer[] toArray() {
		return elementos.toArray(new Integer[0]);
	}

	@Override
	public void print() {
		for (Integer elementos : elementos) {
			System.out.println(elementos);
		}
	}
	
	public boolean isEmpty() {
		return elementos.isEmpty();
	}
}
