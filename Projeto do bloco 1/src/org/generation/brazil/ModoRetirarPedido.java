package org.generation.brazil;

import java.util.Scanner;

public class ModoRetirarPedido {
	
	static Scanner leia = new Scanner(System.in);
	
	private int modoEntrega;
	
	public void EscolherEntrega() throws InterruptedException{
		System.out.println("--- ENTREGA DO PEDIDO --- \n");
		Thread.sleep(1000);
		
		System.out.println(">>>> Selecione a melhor op��o: \n\n1 - RETIRADA NO LOCAL;\n"
				+ "2 - ENTREGA A DOMIC�LIO; ");
		Thread.sleep(1000);
		System.out.println("*Op��o: ");
		
		int modoEntrega = leia.nextInt();
		
		if(modoEntrega == 1) {
			System.out.println("-- RETIRADA NO LOCAL -- \n**Ap�s confirma��o do pagamento!!** ");
		}else if( modoEntrega == 2) {
			System.out.println("-- ENTREGA A DOMOC�LIO -- \n*** Frete = GR�TIS *** \nEndere�o de entrega registrado em cadastro.");
		}
	}
}
	
	
	
		
		
	

