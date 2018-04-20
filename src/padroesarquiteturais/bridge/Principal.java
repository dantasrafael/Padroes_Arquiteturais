/*
 * Objetivo: Separar uma abstra��o de sua implementa��o, de modo que as duas possam variar independentemente.
 *           
 * Deve-se aplic�-lo quando:
 * 		� Se deseja evitar um v�nculo permanente entre uma abstra��o e sua implementa��o.
 * 		  Isso pode ocorrer, por exemplo, quando a implementa��o deve ser selecionada ou alterada em tempo de execu��o;
 * 		� Tanto as abstra��es como suas implementa��es tiverem de ser extens�veis por meio de subclasses.
 * 		  Nesse caso, o padr�o Bridge permitir combinar as diferentes abstra��es e implementa��es e entend�-las independentemente;
 * 		� Mudan�as na implementa��o de uma abstra��o n�o puderem ter impacto sobre os clientes, ou seja,
 * 		  quando o c�digo dos mesmos n�o puder ser recompilado;
 * 		� (C++) Se deseja ocultar completamente a implementa��o de uma abstra��o dos clientes.
 * 		  Em C++, a representa��o de uma classe � vis�vel na interface da classe;
 * 		� Se deseja compartilhar uma implementa��o entre m�ltiplos objetos (talvez usando a contagem de refer�ncias)
 * 		  e este fato deve estar ocultado do cliente. 
 */

package padroesarquiteturais.bridge;

public class Principal {

	public static void main(String[] args) {
		TelevisaoAbstrata televisao = new TelevisaoLCD();
		ControleRemotoLogitech controleRemoto = new ControleRemotoLogitech(televisao);
		
		televisao.ligar();
		controleRemoto.selecionarCanal(100);
		
		System.out.println("Canal selecionado: "+ televisao.getCanal());
		televisao.desligar();
	}

}
