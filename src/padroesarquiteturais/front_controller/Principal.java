/*
 * Objetivo: Ser usado como o ponto inicial de contato para tratar todas as solicita��es relacionadas.
 * 			 Ele centraliza a l�gica de controle, a qual, de outro modo, poderia ser duplicada, e gerencia as atividades
 * 			 de tratamento de solicita��es.
 *           
 * Deve-se aplic�-lo quando:
 * 		� Se deseja evitar que a l�gica de controle seja duplicada.
 * 		� Se deseja aplicar uma l�gica comum a diversas solicita��es.
 * 		� Se deseja separar a l�gica de processamento do sistema da visualiza��o.
 * 		� Se deseja centralizar os pontos de acesso controlados no sistema.
 */

package padroesarquiteturais.front_controller;

public class Principal {

	public static void main(String[] args) {
		FrontController frontController = new FrontController();
		frontController.encaminhar("Fornecedor");
		System.out.println();
		frontController.encaminhar("Cliente");
	}

}
