package uno;

import java.util.LinkedHashSet;
import java.util.Set;

import to.Persona;

public class Principal {
	public static void main(String[] args) {
		Set<Persona> personas = new LinkedHashSet<>();
		personas.add(new Persona(Persona.ColorOjos.NEGRO, 1.8f, 80f));
		personas.add(new Persona(Persona.ColorOjos.NEGRO, 1.8f, 80f));
		personas.add(new Persona(Persona.ColorOjos.VERDE, 1.6f, 50f));
		personas.add(new Persona(Persona.ColorOjos.AZUL, 1.7f, 70f));
		
		for (Persona p : personas)
			System.out.println(p);
	}
}
