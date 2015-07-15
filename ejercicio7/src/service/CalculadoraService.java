package service;

import exception.DivisionInvalidaException;
import exception.DivisorInvalidoException;
import exception.NaturalDesbordadoException;
import exception.NaturalInvalidoException;
import exception.SustraendoInvalidoException;

public interface CalculadoraService {
	int sumar(int a, int b) throws NaturalInvalidoException, NaturalDesbordadoException;
	int restar(int a, int b) throws NaturalInvalidoException, SustraendoInvalidoException;
	int multiplicar(int a, int b) throws NaturalInvalidoException, NaturalDesbordadoException;
	int dividir(int a, int b) throws NaturalInvalidoException, DivisorInvalidoException, DivisionInvalidaException;
}
