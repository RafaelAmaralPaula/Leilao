package com.lovelacetecnologia.service;

import java.util.List;

import com.lovelacetecnologia.bancodados.BancosDeDados;
import com.lovelacetecnologia.jogador.Jogador;

public class Service {

	BancosDeDados bancosDeDados = new BancosDeDados();

	public void adicionar(Jogador jogador) {

		bancosDeDados.lista.add(jogador);

	}

	public List<Jogador> listarTodos() {
		return bancosDeDados.lista;
	}

}
