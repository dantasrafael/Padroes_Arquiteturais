/*
 * Objetivo: Evitar o acoplamento do remetente de uma solicita��o ao seu destinat�rio,
 * 			 dando a mais de um objeto a chance de tratar a solicita��o, ou seja,
 * 			 encadeia os objetos receptores e passa a solicita��o ao longo da cadeia at� que um objeto a trate.
 *           
 * Deve-se aplic�-lo quando:
 * 		� Mais de um objeto pode tratar uma solicita��o e o objeto que o tratar� n�o � conhecido a priori.
 * 		  O objeto que trata a solicita��o deve ser escolhido automaticamente.
 * 		� Quiser emitir uma solicita��o para um dentre v�rios objetos, sem especificar explicitamente o receptor.
 * 		� O conjunto de objetos que pode tratar uma solicita��o dever� ser especificado dinamicamente.
 */

package padroesarquiteturais.chain_of_responsability;

public class Principal {
	
	private static CadeiaDeResponsabilidade criarCadeiaDeResponsabilidade() {
		CadeiaDeResponsabilidade cadeia_1 = new Classe_1(CadeiaDeResponsabilidade.TRES);
		CadeiaDeResponsabilidade cadeia_2 = new Classe_2(CadeiaDeResponsabilidade.DOIS);
		CadeiaDeResponsabilidade cadeia_3 = new Classe_3(CadeiaDeResponsabilidade.UM);
		
		cadeia_1.setProxima(cadeia_2);
		cadeia_2.setProxima(cadeia_3);
		return cadeia_1;
	}

	public static void main(String[] args) {
		CadeiaDeResponsabilidade cadeia = criarCadeiaDeResponsabilidade();
		cadeia.setMensagem("N�vel 3", CadeiaDeResponsabilidade.TRES);
		cadeia.setMensagem("N�vel 2", CadeiaDeResponsabilidade.DOIS);
		cadeia.setMensagem("N�vel 1", CadeiaDeResponsabilidade.UM);
	}

}
