package prueba;

public abstract class Gritador {
	
	private String frase;

	public Gritador(String frase) {
		this.frase= frase;
	}

	public abstract String gritar();
}
