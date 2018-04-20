/*
 * Objetivo: Definir uma depend�ncia um-para-muitos entre objetos, de modo que,
 *           quando um objeto muda de estado, todos os seus dependentes s�o automaticamente notificados e atualizados.
 *           
 * Deve-se aplic�-lo quando:
 * 		� Uma abstra��o tem dois aspectos, um dependente do outro.
 * 		  Encapsulando esses aspectos em objetos separados, permite-se vari�-los e reutiliz�-los independentemente;
 * 		� Uma mudan�a em um objeto exige mudan�as em outros, e voc� n�o sabe quantos objetos necessitam ser mudados;
 * 		� Um objeto deveria ser capaz de notificar outros objetos sem fazer hip�teses, ou usar informa��es,
 * 		  sobre quem s�o esses objetos. Em outras palavras, quando n�o se deseja que esses objetos sejam fortemente acoplados.
 */

package padroesarquiteturais.observer;

public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		new HexaObserver(pessoa);
		new OctalObserver(pessoa);
		new BinaryObserver(pessoa);
		
		System.out.println("Primeira idade: 20");
		pessoa.setIdade(20);
		System.out.println();
		System.out.println("Segunda idade: 5");
		pessoa.setIdade(5);
	}

}
