package padroesarquiteturais.bridge;

public class TelevisaoLED extends TelevisaoAbstrata {

	@Override
	public void ligar() {
		System.out.println("Televis�o LED Ligada");
	}

	@Override
	public void desligar() {
		System.out.println("Televis�o LED Desligada");
	}

}
