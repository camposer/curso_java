package exception;

@SuppressWarnings("serial")
public abstract class CalculadoraException extends Exception {
	public CalculadoraException() {
	}
	public CalculadoraException(String msj, Throwable th) {
		super(msj, th);
	}
	public CalculadoraException(Throwable th) {
		super(th);
	}
	public CalculadoraException(String msj) {
		super(msj);
	}
}
