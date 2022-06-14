/*
 * 	Autor: Felipe Schneider - Turma 54 da Generation - grupo 4
 * 	Última alteração: 13h24min - Data: 13/06/2022 
 */
package org.generation.brazil;

import java.util.Scanner;

public class TelaInicial {

	private Cadastro cadastro = new Cadastro();
	
	public Scanner entrada = new Scanner(System.in);

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
		
		int escolha = (entrada.nextInt());
		
		if(escolha == 1) {
			logarUsuario();
		} 
		else if(escolha == 2) {
			cadastro.cadastreUsuario();
		}
		else {
			
		}
	}

	public void logarUsuario() throws InterruptedException{
		
		String nomeDigitado;
		
		do {
			System.out.println("Faça seu login");
			System.out.print("Digite seu nome de usuário: ");	
			
		if(cadastro.getNome().equals(nomeDigitado = entrada.next())) {
			
			colocarSenha();

		}else {
			System.out.println("Login não encontrado!");
		}
		}while(!cadastro.getNome().equals(nomeDigitado));
	}
	
	public void colocarSenha() throws InterruptedException{
		
		String senhaDigitada;
		
		do {
			System.out.print("Digite sua senha: ");
			
			if(cadastro.getSenha().equals(senhaDigitada = entrada.next())) {
				
				// joga pra próxima função: pedido

			}else {
				System.out.println("Senha incorreta!");
			}
		}while(!cadastro.getSenha().equals(senhaDigitada));
		
	}
	
	
	
}
