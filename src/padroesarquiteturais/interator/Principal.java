/*
 * Objetivo: Fornecer uma maneira de acessar sequencialmente os elementos de um objeto agregado sem expor
 * 			 sua representa��o subjacente.
 *           
 * Deve-se aplic�-lo quando:
 * 		� For acessar os conte�dos de um objeto agregado sem expor sua representa��o interna.
 * 		� For suportar m�ltiplos percursos de objetos agregados.
 * 		� For fornecer uma interface uniforme que percorra diferentes estruturas agregadas
 * 		  (ou seja, para suportar a itera��o polim�rfica).
 */

package padroesarquiteturais.interator;

public class Principal {
	
	public static void main(String[] args) {
		Colecao colecao = new Colecao();
		InterfaceIterator iterator = colecao.criarIterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
}
