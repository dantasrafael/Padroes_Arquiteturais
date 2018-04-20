/*
 * Objetivo: Separar a constru��o de um objeto complexo da sua representa��o de modo que o mesmo processo de constru��o
 * 			 possa criar diferentes representa��es.
 *           
 * Deve-se aplic�-lo quando:
 * 		� O algoritmo para cria��o de um objeto complexo for independente das partes que comp�em o objeto
 * 		  e dependendo de como elas s�o montadas;
 * 		� O processo de constru��o permitir diferentes representa��es para o objeto que for constru�do.
 */

package padroesarquiteturais.builder;

public class Principal {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("Gerando Livro T�cnico:");
		LivroBuilder livroTecnicoBuilder = new LivroTecnicoBuilder();
		Grafica livroTecnicoWriter = new Grafica(livroTecnicoBuilder);
		livroTecnicoWriter.gerarLivro();
		Livro livroTecnico = livroTecnicoWriter.getLivro();
		System.out.println("Livro T�cnico gerado com sucesso." + "\n\n");
		
		System.out.println("Gerando Livro de Fic��o:");
		LivroBuilder livroFiccaoBuilder = new LivroFiccaoBuilder();
		Grafica livroFiccaoWriter = new Grafica(livroFiccaoBuilder);
		livroFiccaoWriter.gerarLivro();
		Livro livroFiccao = livroFiccaoWriter.getLivro();
		System.out.println("Livro de Fic��o gerado com sucesso.");
	}

}
