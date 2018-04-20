package padroesarquiteturais.bridge;

public class TelevisaoLCD extends TelevisaoAbstrata {

	@Override
	public void ligar() {
		System.out.println("Televis�o LCD Ligada");
	}

	@Override
	public void desligar() {
		System.out.println("Televis�o LCD Desligada");
	}

}
