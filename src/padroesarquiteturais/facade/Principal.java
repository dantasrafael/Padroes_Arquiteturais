/*
 * Objetivo: Fornecer uma interface unificada para um conjunto de interfaces em um subsistema.
 * 			 O Facade define uma interface de n�vel mais alto que torna o subsistema mais f�cil de usar.
 *           
 * Deve-se aplic�-lo quando:
 * 		� Se deseja fornecer uma interface mais simples para um subsistema complexo.
 * 		� Existirem muitas depend�ncias entre clientes e classes de implementa��o de uma abstra��o.
 * 		� Se deseja estruturar os subsistemas em camadas.
 */

package padroesarquiteturais.facade;

public class Principal {

	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.executar();
	}

}
