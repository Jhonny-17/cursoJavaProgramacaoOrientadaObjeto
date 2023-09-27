package com.jhonny.desafios;

public interface Pilha<T> {
	void pull(T item);
	T pop();
	boolean exist(T item);
	T[] toArray();
	void print();
}
