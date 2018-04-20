/*
 * Objetivo: Especificar os tipos de objetos a serem criados usando uma inst�ncia protot�pica
 * 			 e criar novos objetos copiando este prot�tipo.
 *           
 * Deve-se aplic�-lo quando:
 * 		� As classes a instanciar forem especificadas em tempo de execu��o;
 * 		� Se deseja evitar a constru��o de uma hierarquia de classes de f�bricas paralela
 * 		  � hierarquia de classes de produto;
 * 		� As inst�ncias de uma classe puderem ter uma dentre poucas combina��es diferentes de estados. 
 */

package padroesarquiteturais.prototype;

public class Principal {

	public static void main(String[] args) {
		Carro carroBasico = new Carro();
		Carro carroClone = carroBasico.clone();
		carroClone.setModelo("CrossFox");
		carroClone.setPreco(78000);
		System.out.println("Carro B�sico:");
		System.out.println("Montadora:" + carroBasico.getMontadora());
		System.out.println("Modelo:" + carroBasico.getModelo());
		System.out.println("Valor:" + carroBasico.getPreco());
		System.out.println("Carro offRoad:");
		System.out.println("Montadora:" + carroClone.getMontadora());
		System.out.println("Modelo:" + carroClone.getModelo());
		System.out.println("Valor:" + carroClone.getPreco());
	}

}
