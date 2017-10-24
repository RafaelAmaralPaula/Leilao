package com.lovelacetecnologia.carro;

import com.lovelacetecnologia.jogador.Jogador;

public class Carro {

	private String modelo;
	private int anoFabricacao;
	private String cor;
	private boolean tipoCombustivel;
	private Jogador jogador;

	public String getModelo() {
		return modelo;
	}

	public void setNome(String modelo) {
		this.modelo = modelo;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setanoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	
	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	
	public boolean isTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(boolean tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	
	
	
	

}
