package padroesarquiteturais.template_method;

public class AplicativoIphone extends Aplicativo {
	
	protected void obterFonte() {
		System.out.println("Obtendo c�digo fonte para Iphone");
	}
	
	protected void compilar() {
		System.out.println("Compilando aplicativo para Iphone");
	}

}
