package service;

public abstract class CalculadoraServiceFactory {
	private static CalculadoraService INSTANCE = new CalculadoraServiceConExcepciones();
	public static CalculadoraService getCalculadoraService() {
		return INSTANCE;
	}
}
