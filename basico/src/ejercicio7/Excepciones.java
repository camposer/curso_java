package ejercicio7;

public class Excepciones {
	public static void main(String[] args) throws Exception {
		String a;
			try {
				a = "1";
				System.out.println(a + " = " + UtilString.convertir(a));
			} catch (UtilStringException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		a = "uno";
		System.out.println(a + " = " + UtilString.convertir(a));
	}
}

class UtilString {
	public static int convertir(String n) throws UtilStringException {
		try {
			return Integer.parseInt(n);
		} catch (NumberFormatException e) {
			throw new UtilStringException("Error al convertir el número", e);
		} catch (Exception e) {
			throw e;
		}
	}
}

class UtilStringException extends Exception {
	public UtilStringException() {
	}
	public UtilStringException(Throwable t) {
		super(t);
	}
	public UtilStringException(String m, Throwable t) {
		super(m, t);
	}
	public UtilStringException(String m) {
		super(m);
	}
}





