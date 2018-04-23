/*
 * Objetivo: Encapsular uma solicita��o como um objeto e, dessa forma, permitindo que voc� parametrize clientes
 * 			 com diferentes solicita��es, enfileire ou registre solicita��es e suporte opera��es que podem ser desfeitas.
 *           
 * Deve-se aplic�-lo quando:
 * 		� Parametrizar objetos por uma a��o a ser executada.
 * 		� Especificar, enfileirar e executar solicita��es em tempos diferentes.
 * 		� Suportar desfazer opera��es.
 * 		� Suportar o registro (logging) de mudan�as de maneiras que possam ser reaplicadas no caso de uma queda de sistema.
 * 		� Estruturar um sistema em torno de opera��es de alto n�vel constru�das sobre opera��es primitivas.
 */

package padroesarquiteturais.command;

public class Principal {

	public static void main(String[] args) {
		Interruptor interruptor = new Interruptor();
		Lampada lampada = new Lampada();
		Comando ligarLampada = new LigarLampadaComando(lampada);
		Comando desligarLampada = new DesligarLampadaComando(lampada);
		interruptor.setComando(ligarLampada);
		interruptor.pressionarInterruptor();
		interruptor.setComando(desligarLampada);
		interruptor.pressionarInterruptor();
	}

}
