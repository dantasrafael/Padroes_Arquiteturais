/*
 * Objetivo: Garantir que uma classe tenha somente uma inst�ncia e fornecer um ponto global de acesso para ela.
 *           
 * Deve-se aplic�-lo quando:
 * 		� Houver apenas uma inst�ncia de uma classe, e essa inst�ncia tiver que dar acesso
 * 		  aos clientes atrav�s de um ponto bem conhecido;
 * 		� A �nica inst�ncia tiver que ser extens�vel atrav�s de subclasses, possibilitando aos clientes
 * 		  usar uma inst�ncia estendida sem alterar o seu c�digo. 
 */

package padroesarquiteturais.singleton;

public class Principal {

	public static void main(String[] args) {
		ClasseSingleton objSingleton = ClasseSingleton.getInstance();
		System.out.println("Nome: " + objSingleton.getNome());
	}

}
