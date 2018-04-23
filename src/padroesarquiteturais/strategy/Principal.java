/*
 * Objetivo: Definir uma fam�lia de algoritmos, encapsular cada um deles e faz�-los intercambi�veis.
 * 			 O strategy permite que o algoritmo varie independentemente dos clientes que o utilizam.
 *           
 * Deve-se aplic�-lo quando:
 * 		� Muitas classes relacionadas diferem somente no seu comportamento.
 * 		  As estrat�gias fornecem uma maneira de configurar uma classe com um dentre muitos comportamentos.
 * 		� Voc� necessita de variantes de um algoritmo. Por exemplo, pode definir algoritmos que refletem diferentes
 * 		  solu��es de compromisso entre espa�o/tempo.
 * 		� As estrat�gias podem ser usadas quando essas variantes s�o implementadas como uma hierarquia de classes de algoritmos.
 * 		� Um algoritmo usa dados dos quais os clientes n�o deveriam ter conhecimento.
 * 		  Use o padr�o strategy para evitar a exposi��o das estruturas de dados complexas, espec�ficas do algoritmo.
		� Uma classe define muitos comportamentos e aparecem em suas opera��es como m�ltiplos comandos condicionais da linguagem.
		  Em vez de usar muitos comandos condicionais, mova os ramos condicionais relacionados para sua pr�pria classe strategy.
 */

package padroesarquiteturais.strategy;

public class Principal {

	public static void main(String[] args) {		
		int[] vetor = {1, 2, 3, 4, 5};
		Contexto contexto = new Contexto(new BubbleSort());
		contexto.organizar(vetor);
		contexto = new Contexto(new QuickSort());
		contexto.organizar(vetor);		
	}

}
