package ejercicio1;


public class Principal {
	public static void main(String[] args) {
		Persona p1 = new Persona("NEGRO");
		Persona p2 = new Persona();
		Persona p3 = new Persona("NEGRO", 90);
		Persona p4 = new Persona("NEGRO", 90, 70);

		System.out.println(p1.getColorOjos());
		System.out.println(p1.getAltura());
		System.out.println(p1.getPeso());
	}
}
