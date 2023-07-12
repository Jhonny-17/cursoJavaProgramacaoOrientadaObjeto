package com.jhonny.interfaceslesson;

public abstract class PlataformaVolksWagen implements Carro{
	private int velocidade;

	@Override
	public void acelera() {
		velocidade++;
	}

	@Override
	public void freia() {
		velocidade--;
	}

	@Override
	public int getVelocidade() {
		return velocidade;
	}

	@Override
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
}