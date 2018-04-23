/*
 * Objetivo: Usa compartilhamento para suportar grandes quantidades de objetos, de granularidade fina, de maneira eficiente.
 *           
 * Deve-se aplic�-lo quando:
 * 		� A aplica��o utilizar um grande n�mero de objetos.
 * 		� Os custos de armazenamento forem altos por causa da grande quantidade de objetos.
 * 		� A maioria dos estados de objetos se tornar extr�nseca.
 * 		� Muitos grupos de objetos puderem ser substitu�dos por relativamente poucos objetos compartilhados,
 * 		  uma vez que estados extr�nsecos s�o removidos.
 * 		� A aplica��o n�o depender da identidade dos objetos, uma vez que objetos flyweights podem ser compartilhados,
 * 		  testes de identidade produzir�o o valor verdadeiro para objetos conceitualmente distintos.
 */

package padroesarquiteturais.interpreter;

public class Principal {
	
	public static InterfaceExpressao getMasculino() {
		InterfaceExpressao oswaldo = new Expressao("Oswaldo");
		InterfaceExpressao patrick = new Expressao("Patrick");
		return new ExpressaoOr(oswaldo, patrick);
	}
	
	public static InterfaceExpressao getMulherCasada() {
		InterfaceExpressao gisele = new Expressao("Gisele");
		InterfaceExpressao casada = new Expressao("Casada");
		return new ExpressaoAnd(gisele, casada);
	}
	
	public static void main(String[] args) {
		InterfaceExpressao masculino = getMasculino();
		InterfaceExpressao mulherCasada = getMulherCasada();
		
		System.out.println("Oswaldo � casado? " + masculino.interpretar("Oswaldo"));
		System.out.println("Gisele � uma mulher casada? " + mulherCasada.interpretar("Gisele"));
	}
	
}
