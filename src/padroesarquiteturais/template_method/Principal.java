/*
 * Objetivo: Definir um esqueleto de um algoritmo em uma opera��o postergando a defini��o de alguns passos para subclasses.
 * 			 O template method permite que as sublcasses redefinam certos passos de um algoritmo sem mudar sua estrutura.
 *           
 * Deve-se aplic�-lo quando:
 * 		� For implementar as partes invariantes de um algoritmo uma s� vez e deixar para as subclasses a
 * 		  implementa��o do comportamento que pode variar.
 * 		� O comportamento comum entre subclasses deve ser fatorado e concentrado numa classe comum para evitar duplica��o de c�digo.
 * 		� For controlar extens�es de subclasses. Voc� definir um m�todo template que chama opera��es �gancho� em pontos espec�ficos,
 * 		  permitindo, dessa forma, extens�es somente nesses pontos.
 */

package padroesarquiteturais.template_method;

public class Principal {

	public static void main(String[] args) {
		Aplicativo iphone = new AplicativoIphone();
		iphone.gerar();
		System.out.println();
		Aplicativo galaxy = new AplicativoAndroid();
		galaxy.gerar();		
	}

}
