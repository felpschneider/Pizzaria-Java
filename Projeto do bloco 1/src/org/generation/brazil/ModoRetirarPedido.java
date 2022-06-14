package org.generation.brazil;

import java.util.Scanner;

public class ModoRetirarPedido {
	
	private Cadastro cadastro = new Cadastro();
	
	static Scanner leia = new Scanner(System.in);
	
	private int modoEntrega;
	
	public void EscolherEntrega() throws InterruptedException{
		System.out.println("--- ENTREGA DO PEDIDO --- \n");
		Thread.sleep(1000);
		
		System.out.println(">>>> Selecione a melhor opção: \n\n1 - RETIRADA NO LOCAL;\n"
				+ "2 - ENTREGA A DOMICÍLIO; ");
		Thread.sleep(1000);
		System.out.println("*Opção: ");
		
		int modoEntrega = leia.nextInt();
		
		switch(modoEntrega) {
		case 1:
			System.out.println("-- RETIRADA NO LOCAL -- \n**Após confirmação do pagamento!!** ");
<<<<<<< HEAD
			break;
		case 2:
			System.out.println("-- ENTREGA A DOMOCÍLIO -- \n*** Frete = GRÁTIS *** \nEndereço de entrega registrado em cadastro.");
			break;
		default:
			do {
				System.out.println("Escolha uma opção válida:\n 'Digite 1 para retornar as opções...");
				modoEntrega = leia.nextInt();
			} while (modoEntrega != 1 && modoEntrega != 2);
			EscolherEntrega();
=======
		}else if( modoEntrega == 2) {
			System.out.println("-- ENTREGA A DOMOCÍLIO -- \n*** Frete = GRÁTIS *** "
					+ "\nEndereço de entrega registrado em cadastro: " + cadastro.getEndereco());
>>>>>>> 2f46389e0f7cc187006dd79868a0e836d07e73e1
		}
	}

	public int getModoEntrega() { //getter
		return modoEntrega;
	}

	public void setModoEntrega(int modoEntrega) { //setter
		this.modoEntrega = modoEntrega;
	}
}
	
	
	
		
		
	

