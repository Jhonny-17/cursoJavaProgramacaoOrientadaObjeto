package com.jhonny.desafios;

public class NohJhonny<T> implements PilhaNoh<T> {

	private T info;
	private PilhaNoh<T> next;
	
	public NohJhonny(T info, PilhaNoh<T> next) {
		this.info = info;
		this.next = next;
	}

	@Override
	public T getInfo() {
		return info;
	}

	@Override
	public PilhaNoh<T> getNext() {
		return next;
	}

}
