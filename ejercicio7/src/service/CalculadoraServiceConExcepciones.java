package service;

import exception.DivisionInvalidaException;
import exception.DivisorInvalidoException;
import exception.NaturalDesbordadoException;
import exception.NaturalInvalidoException;
import exception.SustraendoInvalidoException;

public class CalculadoraServiceConExcepciones implements CalculadoraService {

	@Override
	public int sumar(int a, int b) throws NaturalInvalidoException, NaturalDesbordadoException {
		validar(a);
		validar(b);
		
		long c = (long)a + b;
		if (c > Integer.MAX_VALUE)
			throw new NaturalDesbordadoException(c);
			
		return a + b;
	}

	private void validar(int n) throws NaturalInvalidoException {
		if (n < 0)
			throw new NaturalInvalidoException(n);
	}

	@Override
	public int restar(int a, int b) throws NaturalInvalidoException, SustraendoInvalidoException {
		validar(a);
		validar(b);

		if (b > a)
			throw new SustraendoInvalidoException();
		
		return a - b;
	}

	@Override
	public int multiplicar(int a, int b) throws NaturalInvalidoException, NaturalDesbordadoException {
		validar(a);
		validar(b);
		
		long c = (long)a * b;
		if (c > Integer.MAX_VALUE)
			throw new NaturalDesbordadoException(c);

		return a * b;
	}

	@Override
	public int dividir(int a, int b) throws NaturalInvalidoException, DivisorInvalidoException, DivisionInvalidaException {
		validar(a);
		validar(b);

		if (b == 0)
			throw new DivisorInvalidoException();

		if (a % b != 0)
			throw new DivisionInvalidaException();
		
		return a / b;
	}


}
