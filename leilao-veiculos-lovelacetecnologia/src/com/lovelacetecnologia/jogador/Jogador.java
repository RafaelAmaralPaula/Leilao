package com.lovelacetecnologia.jogador;

import com.lovelacetecnologia.preco.Preco;

public class Jogador {

	private Integer id;
	private String nome;
	private String email;
	public Preco preco;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
