package org.generation.brazil;

public class ClasseMain {
	
	public static void main(String[] args) throws InterruptedException {

		TelaInicial saudacao = new TelaInicial();
		ModoRetirarPedido retirar = new ModoRetirarPedido();
		Pagamentos pagamento = new Pagamentos();
		
		
		saudacao.SaudarUsuario();
		
		saudacao.EscolherOpcoesMenu();
		
		retirar.EscolherEntrega();
		
		pagamento.escolhaDoPagamento();
		
	}

}
