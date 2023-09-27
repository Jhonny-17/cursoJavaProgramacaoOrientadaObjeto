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
			
		}
		return null;
	}

	@Override
	public boolean exist(Integer item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Integer[] toArray() {
		return elementos.toArray((T[]) new Object[elementos.size()]);
	}

	@Override
	public void print() {
		for (T )
	}

	
	
}
