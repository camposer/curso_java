import exception.DivisionInvalidaException;
import exception.DivisorInvalidoException;
import exception.NaturalDesbordadoException;
import exception.NaturalInvalidoException;
import exception.SustraendoInvalidoException;
import service.CalculadoraService;
import service.CalculadoraServiceFactory;


public class Principal {
	public static void main(String[] args) {
		CalculadoraService calc = CalculadoraServiceFactory
				.getCalculadoraService(); 
		int a = 0;
		try {
			a = calc.sumar(8, 10);
			System.out.println("a = " + a);
		} catch (NaturalInvalidoException|NaturalDesbordadoException e) {
			if (e instanceof NaturalInvalidoException)
				System.err.println("Natural inválido");
			else 
				System.err.println("Natural desbordado " + 
						((NaturalDesbordadoException)e).getValor());
		} 
		
		try {
			int b = calc.restar(20, a);
			System.out.println("b = " + b);
		} catch (NaturalInvalidoException e) {
			System.err.println("Natural inválido");
		} catch (SustraendoInvalidoException e) {
			System.err.println("Sustraendo inválido");
		} 
		
		int c = 0;
		try {
			c = calc.restar(2, 2);
			System.out.println("c = " + c);
		} catch (NaturalInvalidoException e) {
			e.printStackTrace();
		} catch (SustraendoInvalidoException e) {
			e.printStackTrace();
		} 
		
		try {
			int d = calc.dividir(a, c);
			System.out.println("d = " + d);
		} catch (NaturalInvalidoException e) {
			e.printStackTrace();
		} catch (DivisorInvalidoException e) {
			System.err.println("Divisor inválido");
			e.printStackTrace();
		} catch (DivisionInvalidaException e) {
			e.printStackTrace();
		}
	}
}
