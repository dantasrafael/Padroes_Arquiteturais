/*
 * Objetivo: Atribuir responsabilidades adicionais a um objeto dinamicamente.
 * 			 Os decorators fornecem uma alternativa flex�vel a subclasses para extens�o da funcionalidade.
 *           
 * Deve-se aplic�-lo quando:
 * 		� For para acrescentar responsabilidades a objetos individuais de forma din�mica e transparente, ou seja,
 * 		  sem afetar outros objetos;
 * 		� For para responsabilidades que podem ser removidas;
 * 		� A extens�o atrav�s do uso de subclasses n�o for pr�tica.
 */

package padroesarquiteturais.decorate;

public class Principal {

	public static void main(String[] args) {
		InterfaceCarro sportsCar = new CarroSport(new CarroBasico());
		sportsCar.montar();
		
		InterfaceCarro sportsLuxuryCar = new CarroSport(new CarroLuxo(new CarroBasico()));
		sportsLuxuryCar.montar();
	}

}
