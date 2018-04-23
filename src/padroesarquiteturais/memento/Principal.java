/*
 * Objetivo: Sem violar a encapsula��o, capturar e externalizar um estado interno de um objeto, de modo que o mesmo possa,
 * 			 posteriormente, ser restaurado para esse estado.
 *           
 * Deve-se aplic�-lo quando:
 * 		� Um instant�neo de (alguma por��o do) estado de um objeto deve ser salvo de maneira que possa ser restaurado
 * 		  para esse estado mais tarde.
 * 		� Uma interface direta para obten��o do estado exp�e detalhes de implementa��o e romperia o encapsulamento do objeto.
 */

package padroesarquiteturais.memento;

public class Principal {
	
	public static void main(String[] args) {
		Pessoa original = new Pessoa();
		Zelador zelador = new Zelador();
		original.setNome("Neide");
		original.setNome("F�tima");
		zelador.add(original.salvarMemento());
		original.setNome("Gisele");
		zelador.add(original.salvarMemento());
		original.setNome("Oswaldo");
		
		System.out.println("Pessoa corrente: " + original.getNome());
		original.getMemento(zelador.get(0));
		System.out.println("Primeira pessoa salva: " + original.getNome());
		original.getMemento(zelador.get(1));
		System.out.println("Segunda pessoa salva: " + original.getNome());
	}
	
}
