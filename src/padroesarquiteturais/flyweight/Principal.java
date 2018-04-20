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

package padroesarquiteturais.flyweight;

public class Principal {
	
	private static final String[] cores = {"Preto", "Branco", "Verde",
			"Vermelho", "Rosa"};

	public static void main(String[] args) {
		for (int i = 0; i < 20; ++i) {
			Circulo circulo = (Circulo)FabricaFormaGeometrica.getCirculo(getCorAleatoria());
			circulo.setX(getAleatorioX());
			circulo.setY(getAleatorioY());
			circulo.setRadianos(100);
			circulo.desenhar();
		}
	}
	
	private static String getCorAleatoria() {
		return cores[(int) (Math.random() * cores.length)];
	}
	
	private static int getAleatorioX() {
		return (int) (Math.random() * 100);
	}
	
	private static int getAleatorioY() {
		return (int) (Math.random() * 100);
	}

}
