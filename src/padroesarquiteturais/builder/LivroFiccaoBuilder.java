package padroesarquiteturais.builder;

public class LivroFiccaoBuilder implements LivroBuilder {
	
	private Livro livro;
	
	public LivroFiccaoBuilder() {
		livro = new Livro();
	}

	@Override
	public void buildIndice() {
		System.out.println("Montando �ndice");
		livro.setIndice("�ndice livro fic��o");
	}

	@Override
	public void buildPrefacio() {
		System.out.println("Montando pref�cio");
		livro.setIndice("Pref�cio livro fic��o");
	}

	@Override
	public void buildIntroducao() {
		System.out.println("Montando Introdu��o");
		livro.setIndice("Introdu��o livro fic��o");
	}

	@Override
	public void buildCapitulos() {
		System.out.println("Montando cap�tulos");
		livro.setCapitulos("Cap�tulos livro fic��o");
	}

	@Override
	public void buildGlossario() {
		System.out.println("Montando Gloss�rio");
		livro.setGlossario("Gloss�rio livro fic��o");
	}

	@Override
	public Livro getLivro() {
		return livro;
	}

}
