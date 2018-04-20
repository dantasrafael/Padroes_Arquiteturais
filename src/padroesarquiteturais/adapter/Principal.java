/*
 * Objetivo: Converter a interface de uma classe em outra interface esperada pelos clientes.
 * 			 O Adapter permite que certas classes trabalhem em conjunto, pois de outra forma seria imposs�vel, devido �s suas interfaces incompat�veis.
 *           
 * Deve-se aplic�-lo quando:
 * 		� Quiser usar uma classe existente, mas sua interface n�o corresponde � interface de que necessita;
 * 		� Quiser criar uma classe reutiliz�vel que coopere com classes n�o relacionadas ou n�o previstas, ou seja,
 * 		  classes que n�o necessariamente tenham interfaces compat�veis;
 * 		� (somente para adaptadores de objetos) Precisar usar v�rias subclasses existentes, por�m,
 * 		  for impratic�vel adaptar essas interfaces criando subclasses para cada uma. Um Adaptor de objeto pode adaptar a interface da sua classe m�e. 
 */

package padroesarquiteturais.adapter;

public class Principal {

	public static void main(String[] args) {
		CarteiraMotorista_B carteiraMotorista_B = new CarteiraMotorista_B();
		CarteiraMotorista_D carteiraMotorista_D = new CarteiraMotorista_D();
		CarteiraAdapter carteiraAdapter = new CarteiraAdapter(carteiraMotorista_D);
		carteiraAdapter.setCategoria(carteiraMotorista_B.getCategoria());
		
		System.out.println(carteiraAdapter.getCategoria());
	}

}
