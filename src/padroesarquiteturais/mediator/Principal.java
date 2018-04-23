/*
 * Objetivo: Definir um objeto que encapsula como um conjunto de objetos interage.
 * 			 O mediator promove o acoplamento fraco ao evitar que os objetos se refiram explicitamente uns aos outros,
 * 			 permitindo que se varie suas intera��es independentemente.
 *           
 * Deve-se aplic�-lo quando:
 * 		� Um conjunto de objetos se comunica de maneiras bem-definidas, por�m complexas.
 * 		  As interdepend�ncias resultantes s�o desestruturadas e dif�ceis de entender.
 * 		� A reutiliza��o de um objeto � dif�cil porque ele referencia e se comunica com muitos outros objetos.
 * 		� Um comportamento que est� distribu�do entre v�rias classes deveria ser customiz�vel, ou adapt�vel,
 * 		  sem excessiva especializa��o em subclasses.
 */

package padroesarquiteturais.mediator;

public class Principal {
	
	public static void main(String[] args) {
		InterfaceMediator mediator = new Mediator();
		UsuarioAbstrato usuario_1 = new Usuario(mediator, "Oswaldo");
		UsuarioAbstrato usuario_2 = new Usuario(mediator, "Gisele");
		UsuarioAbstrato usuario_3 = new Usuario(mediator, "Giovanna");
		UsuarioAbstrato usuario_4 = new Usuario(mediator, "Giulianna");
		mediator.adicionarUsuario(usuario_1);
		mediator.adicionarUsuario(usuario_2);
		mediator.adicionarUsuario(usuario_3);
		mediator.adicionarUsuario(usuario_4);
		usuario_1.enviando("Sejam Bem-vindos");
	}
	
}
