package exception;

import exception.CalculadoraException;

public class NaturalDesbordadoException extends CalculadoraException {
	private static final long serialVersionUID = 6271525730851192044L;

	private long valor;
	
	public NaturalDesbordadoException(long valor) {
		this.valor = valor;
	}

	public long getValor() {
		return valor;
	}

	public void setValor(long valor) {
		this.valor = valor;
	}
}
