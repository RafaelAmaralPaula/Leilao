package com.lovelacetecnologia.service;

import java.util.List;

import com.lovelacetecnologia.bancodados.BancosDeDados;
import com.lovelacetecnologia.jogador.Jogador;

public class Service  implements ItService{

	BancosDeDados bancosDeDados = new BancosDeDados();

	@Override
	public void adicionar(Jogador jogador) {
		bancosDeDados.lista.add(jogador);
		
	}

	@Override
	public List<Jogador> listarTodos() {
		return bancosDeDados.lista;
	}

	
	

}
