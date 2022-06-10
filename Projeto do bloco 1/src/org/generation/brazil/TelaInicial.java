/*
 * 	Autor: Felipe Schneider - Turma 54 da Generation - grupo 4
 * 	Última alteração: 14h40min - Data: 10/06/2022 
 */
package org.generation.brazil;

import java.util.Scanner;

public class TelaInicial {
	
	public Scanner lerRespostas = new Scanner(System.in);
	
	private int escolha;

	public void SaudarUsuario() throws InterruptedException {
		
		System.out.println("Olá! Seja bem-vinde à Java's Pizzaria!");
		Thread.sleep(2000);
		System.out.println("Nesse aplicativo, você seleciona as opções selecionando os números"
				+ " correspondentes a ela");
		Thread.sleep(2500);

	}
	
	public void EscolherOpcoesMenu() throws InterruptedException {
		
		System.out.println("Para iniciar, fale para nós: ");
		Thread.sleep(1000);
		System.out.println("1- Já sou cliente");
		System.out.println("2- Quero me cadastrar");
		System.out.println("3- Sair");
		Thread.sleep(1000);
		System.out.print("Digite sua escolha: ");
		
		setEscolha(lerRespostas.nextInt());
		
		if(escolha == 1) {
			logarUsuario();
		}
	}

	public void logarUsuario() {
		
		System.out.println("Faça seu login:");
		System.out.print("Digite seu nome de usuário: ");
		
		System.out.print("Digite sua senha: ");
		
		
		
		
	}
	
	
	
	
	public int getEscolha() {
		return escolha;
	}

	public void setEscolha(int escolha) {
		this.escolha = escolha;
	}
	
}
