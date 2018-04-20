/*
 * Objetivo: Definir uma interface para criar um objeto, embora deixe as subclasses decidirem qual classe instanciar.
 * 			 O padr�o Factory Method permite a uma classe postergar a instancia��o �s subclasses.
 *           
 * Deve-se aplic�-lo quando:
 * 		� Uma classe n�o puder antecipar a classe de objetos que for criada;
 * 		� Uma classe quiser que suas subclasses especifiquem os objetos que ela cria;
 * 		� As classes delegarem responsabilidades para uma dentre v�rias subclasses auxiliares,
 * 		  e se deseja localizar o conhecimento de qual subclasse auxiliar implementa a delega��o.
 */

package padroesarquiteturais.factory_method;

public class Principal {

	public static void main(String[] args) {
		FabricaAluno fabricaAluno = new FabricaAluno();
		Aluno aluno = fabricaAluno.getPessoa(Curso.CURSO_GRADUACAO, "Fulano de Tal", 10, 9);
		System.out.println("Nome: " + aluno.getNome());
		System.out.println("M�dia: " + aluno.getMedia());
	}

}
