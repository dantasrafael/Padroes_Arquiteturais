package padroesarquiteturais.template_method;

public class AplicativoAndroid extends Aplicativo {
	
	protected void obterFonte() {
		System.out.println("Obtendo c�digo fonte para Android");
	}
	
	protected void compilar() {
		System.out.println("Compilando aplicativo para Android");
	}

}
