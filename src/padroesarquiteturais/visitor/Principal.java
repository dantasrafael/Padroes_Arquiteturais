/*
 * Objetivo: Representar uma opera��o a ser executada sobre os elementos da estrutura de um objeto.
 * 			 O visitor permite que voc� defina uma nova opera��o sem mudar as classes dos elementos sobre os quais opera.
 *           
 * Deve-se aplic�-lo quando:
 * 		� Uma estrutura de objetos cont�m muitas classes de objetos com interfaces que diferem,
 * 		  e quando deseja-se executar opera��es sobre esses objetos que dependem das suas classes concretas.
 * 		� Muitas opera��es distintas e n�o relacionadas necessitam ser executadas sobre objetos de uma estrutura de objetos,
 * 		  e deseja-se evitar �a polui��o� das suas classes com essas opera��es.
 * 		  O Visitor permite manter juntas opera��es relacionadas, definindo-as em uma �nica classe.
 * 		  Quando a estrutura do objeto for compartilhada por muitas aplica��es, use visitor para p�r opera��es somente
 * 		  naquelas aplica��es que as necessitam.
 * 		� As classes que definem a estrutura do objeto raramente mudam, por�m, frequentemente deseja-se definir novas
 * 		  opera��es sobre a estrutura. A mudan�a das classes da estrutura do objeto requer a redefini��o da interface para
 * 		  todos os visitantes, o que � potencialmente oneroso. Se as classes da estrutura do objeto mudam com frequ�ncia,
 * 		  provavelmente � melhor definir as opera��es nessas classes.
 */

package padroesarquiteturais.visitor;

public class Principal {

	public static void main(String[] args) {
		ComponenteComputador computer = new Computador();
		computer.receber(new ComputerPartDisplayVisitor());
	}

}
