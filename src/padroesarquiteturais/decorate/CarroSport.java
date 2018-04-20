package padroesarquiteturais.decorate;

public class CarroSport extends CarroDecorator {
	
	public CarroSport(InterfaceCarro poCarro) {
		super(poCarro);
	}

	@Override
	public void montar() {
		this.carro.montar();
		System.out.println("Adicionando caracter�sticas de Carro Sport.");
	}

}
