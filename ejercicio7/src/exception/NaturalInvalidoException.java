package exception;

public class NaturalInvalidoException extends CalculadoraException {
	private static final long serialVersionUID = -724141377822161774L;

	private int entero;
	
	public NaturalInvalidoException(int entero) {
		this.entero = entero;
	}

	public int getEntero() {
		return entero;
	}

	public void setEntero(int entero) {
		this.entero = entero;
	}
}
