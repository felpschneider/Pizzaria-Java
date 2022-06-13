package org.generation.brazil;

import java.util.Scanner;

public class Cadastro {
		
		Scanner leitor = new Scanner(System.in);
		
		String nome;
		String telefone;
		String endereço;
		String usuario;
		String senha;
	
	void cadastreUsuario() {
		
		System.out.println("Digite seu nome completo:");
		nome = leitor.next();
		System.out.println("Digite seu telefone:");
		telefone = leitor.next();
		System.out.println("Digite seu endereço:");
		endereço = leitor.next();
		System.out.println("Escolha um nome de usuário: ");
		usuario = leitor.next();
		System.out.println("Crie uma senha:");
		senha = leitor.next();
		System.out.println("Usuário cadastrado.");
	}
		
}
