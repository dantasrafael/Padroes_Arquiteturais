/*
 * Objetivo: Prover uma interface para criar fam�lias de objetos relacionados ou dependentes
 * 			 sem especificar suas classes concretas.
 *           
 * Deve-se aplic�-lo quando:
 * 		� Um sistema for independente de como seus produtos s�o criados, compostos e representados;
 * 		� Um sistema for configurado com uma entre v�rias fam�lias de produtos;
 * 		� Uma fam�lia de produtos relacionados for projetada para uso conjunto e voc� for implementar essa restri��o;
 * 		� Quiser fornecer uma biblioteca de classes e revelar sua interface e n�o sua implementa��o.
 */

package padroesarquiteturais.abstract_factory;

public class Principal {

	public static void main(String[] args) {
		FabricaDeCelular fabrica = null;
		CelularSmartphone celularSmartphone = null;
		CelularBasico celularBasico = null;
		
		fabrica = new FabricaSamsung();
		celularSmartphone = fabrica.criarCelularSmartphone();
		celularBasico = fabrica.criarCelularBasico();
		System.out.println(celularSmartphone.getDadosSmartphone());
		System.out.println(celularBasico.getDadosCelularBasico() + "\n\n");

		fabrica = new FabricaLG();
		celularSmartphone = fabrica.criarCelularSmartphone();
		celularBasico = fabrica.criarCelularBasico();
		System.out.println(celularSmartphone.getDadosSmartphone());
		System.out.println(celularBasico.getDadosCelularBasico());

	}

}
