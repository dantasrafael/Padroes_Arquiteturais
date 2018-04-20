package padroesarquiteturais.builder;

public class LivroTecnicoBuilder implements LivroBuilder {
	
	private Livro livro;
	
	public LivroTecnicoBuilder() {
		livro = new Livro();
	}

	@Override
	public void buildIndice() {
		System.out.println("Montando �ndice");
		livro.setIndice("�ndice livro t�cnico");
	}

	@Override
	public void buildPrefacio() {
		System.out.println("Montando pref�cio");
		livro.setIndice("Pref�cio livro t�cnico");
	}

	@Override
	public void buildIntroducao() {
		System.out.println("Montando Introdu��o");
		livro.setIndice("Introdu��o livro t�cnico");
	}

	@Override
	public void buildCapitulos() {
		System.out.println("Montando cap�tulos");
		livro.setCapitulos("Cap�tulos livro t�cnico");
	}

	@Override
	public void buildGlossario() {
		System.out.println("Montando Gloss�rio");
		livro.setGlossario("Gloss�rio livro t�cnico");
	}

	@Override
	public Livro getLivro() {
		return livro;
	}

}
