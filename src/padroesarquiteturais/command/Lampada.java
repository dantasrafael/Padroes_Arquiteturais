package padroesarquiteturais.command;

public class Lampada {
	
	private boolean ligada;
	
	public void ligar() {
		this.ligada = true;
		this.exibirStatus();
	}
	
	public void desligar() {
		this.ligada = false;
		this.exibirStatus();
	}
	
	public void exibirStatus() {
		if (this.ligada) {
			System.out.println("A l�mpada est� ligada");
		} else {
			System.out.println("A l�mpada est� desligada");
		}
	}

}
