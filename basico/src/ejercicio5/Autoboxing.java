package ejercicio5;

public class Autoboxing {
	public static void main(String[] args) {
		int a = new Integer(2); // Autounboxing
		Integer b = 3; // Autoboxing
		Integer c = a;
		Integer d = new Integer(3);
		d = 5; // => new Integer(5);
		Integer f = null;
		//int g = 2 + f.intValue(); // NullPointerException
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
		// Antes de Java 5
		Integer h = new Integer(4);
		int i = h.intValue();
		int j = new Integer(5) + new Integer(2);
		System.out.println("j = " + j);
	}
}
