package padroesarquiteturais.front_controller;

public class FrontController {

	private Despachante despachante;
	
	public FrontController() {
		despachante = new Despachante();
	}
	
	private boolean isUsuarioAutenticado() {
		System.out.println("Usu�rio autenticado.");
		return true;
	}
	
	private void localizar(String request) {
		System.out.println("P�gina solicitada: " + request);
	}
	
	public void encaminhar(String request) {
		localizar(request);
		if (isUsuarioAutenticado()) {
			despachante.enviar(request);
		}
	 }

}
