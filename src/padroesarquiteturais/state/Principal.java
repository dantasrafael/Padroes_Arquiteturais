/*
 * Objetivo: Permitir que objeto altere seu comportamento quando seu estado interno muda. O objeto parecer� ter mudado sua classe.
 *           
 * Deve-se aplic�-lo quando:
 * 		� O comportamento do objeto depende do seu estado e ele pode mudar seu comportamento em tempo e execu��o,
 * 		  dependendo desse estado.
 * 		� As opera��es t�m comandos condicionais grandes, de v�rias alternativas, que dependem do estado do objeto.
 * 		  Esse estado �, normalmente, representado por uma ou mais constantes enumeradas.
 * 		  Frequentemente, v�rias opera��es conter�o essa mesma estrutura condicional.
 * 		  O padr�o state coloca cada ramo do comando adicional em uma classe separada.
 * 		  Isso lhe permite tratar o estado do objeto como um objeto propriamente dito, que pode variar independentemente
 * 		  de outro objetos. 
 */

package padroesarquiteturais.state;

public class Principal {

	public static void main(String[] args) {
		Alerta alerta = new Alerta();
		alerta.alertar();
		alerta.alertar();
		alerta.setAlerta(new ModoSonoro());
		alerta.alertar();
		alerta.alertar();
		alerta.alertar();		
	}

}
