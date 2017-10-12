package com.lovelacetecnologia.main;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import org.apache.commons.mail.EmailException;

import com.lovelacetecnologia.carro.Carro;
import com.lovelacetecnologia.email.email;
import com.lovelacetecnologia.jogador.Jogador;
import com.lovelacetecnologia.preco.Preco;
import com.lovelacetecnologia.service.Service;

public class Main {

	public static void main(String[] args) throws EmailException {

		Scanner teclado = new Scanner(System.in);
		Carro carro = new Carro();
	    email enviarEmail = new email();
		Service servico = new Service();
		Random random = new Random();
		Date data = new Date();

		// Variveis

		String novoDonoVeiculo = null;
		double preco = 0;
		String enviarPara = null;
		// Variaveis

		System.out.println("Seja - Bem Vindo Leilão de Veiculos");
		System.out.println("");

		System.out.println("Cadastro Do Veiculo Leiluado");
		System.out.println("");

		System.out.println("Modelo Do Veiculo:");
		carro.setNome(teclado.nextLine());

		System.out.println("Cor do Veiculo:");
		carro.setCor(teclado.nextLine());

		System.out.println("Ano Fabricação:");
		carro.setanoFabricacao(teclado.nextInt());

		System.out.println("");

		System.err.println("Cadastro De Jogadores :");
		System.out.println("");

		boolean continuaCadastrando = true;

		int contador = 1;
		while (continuaCadastrando) {

			Jogador jogador = new Jogador();
			jogador.preco= new Preco();

			System.out.println("Jogador " + " [ " + contador + "]");

			System.out.println("Informe Nome do Jogador:" + "[ " + contador + " ]");
			jogador.setNome(teclado.next());
			jogador.setId(random.nextInt(10));

			System.out.println("Informe Seu Email:");
			jogador.setEmail(teclado.next());

			System.out.println(jogador.getNome() + " Qual Lance Deseja Dar no veiculo " + carro.getModelo() + " ?");
			jogador.preco.setPreco(teclado.nextDouble());

			System.out.println("");

			System.out.println("Deseja Continuar Jogo [S/N] ?");
			continuaCadastrando = teclado.next().equalsIgnoreCase("sim");

			servico.adicionar(jogador);

			contador++;

		}

		for (Jogador j : servico.listarTodos()) {

			double maiorValor = 0;
			if (j.preco.getPreco() >= maiorValor) {

				novoDonoVeiculo = j.getNome();
				preco = j.preco.getPreco();
				enviarPara = j.getEmail();

			}
		}

		System.out.println(
				"==================================================================================================");
		System.err.println("Ganhador Do Leilão ! ");
		System.out.println("");
		System.out.println("Realizado pela LovelaceTecnologia / " + data.toString());
		System.out.println("");
		System.out.println("Parabéns !");
		System.out.println(
				"Ganhador do Leilão é :" + novoDonoVeiculo + " novo proprietario do veiculo " + carro.getModelo());
		System.out.println("");
		System.out.println("Veiculo Leiluado Por:R$" + preco);
		System.out.println("==================================================================================================");

		String mensagem = (" Parabéns ! " + novoDonoVeiculo + " você novo proprietario do veiculo " + carro.getModelo()+ " muito obrigado pela participação no Leilão Abraço ! ! ! ");
		String assunto = ("Leilão de Veiculos");
		enviarEmail.enviar(enviarPara, assunto, mensagem);

		System.out.println("");
		System.out.println("Email Enviado Com Sucesso !");
		teclado.close();

	}

}
