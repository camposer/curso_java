package ejercicio8;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Genericos {
	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		
		for (Integer i : numeros) {
			System.out.println(i + 1);
		}
		
		Map<String, Persona> personas = new Hashtable<>();
		personas.put("1234", new Persona("1234", "Juan"));
		personas.put("5678", new Persona("5678", "María"));
		personas.put("9123", new Persona("9123", "Pedro"));
		
		Set<String> nifs = personas.keySet();
		for (String nif : nifs)
			System.out.println(nif + ": " + personas.get(nif));

		System.out.println();
		for (Persona p : personas.values())
			System.out.println(p);
	}
}

class Persona {
	public String nif;
	public String nombre;
	public Persona(String nif, String nombre) {
		super();
		this.nif = nif;
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Persona [nif=" + nif + ", nombre=" + nombre + "]";
	}
}








