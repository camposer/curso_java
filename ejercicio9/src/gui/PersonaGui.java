package gui;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import to.Persona;
import util.Serializador;

public class PersonaGui {
	private static final String PATRON = "yyyy-MM-dd";
	private static final String ARCHIVO_SALIDA = "Persona.byte";

	public static void main(String[] args) throws Exception {
		new PersonaGui().iniciar();
	}
	
	public void iniciar() throws Exception {
		Persona p = null;

		try (Scanner scanner = new Scanner(System.in)) {
			p = new Persona();
			System.out.print("Color ojos (0=NEGRO, 1=VERDE, 2=AZUL, 3=MARRON)? ");
			p.setColorOjos(Persona.ColorOjos.getColorOjos(Integer.parseInt(scanner.nextLine())));
			
			System.out.print("Peso? ");
			p.setPeso(Float.parseFloat(scanner.nextLine()));
			
			System.out.print("Altura? ");
			p.setAltura(Float.parseFloat(scanner.nextLine()));
			
			System.out.print("Fecha de nacimiento (yyyy-mm-dd)? ");
			Date fecha = new SimpleDateFormat(PATRON)
				.parse(scanner.nextLine());
			p.setFechaNacimiento(fecha);
		}
		
		if (p != null) {
			System.out.println(p);
			Serializador serializador = new Serializador(ARCHIVO_SALIDA);
			serializador.serializar(p);
			
			Object obj = serializador.deserializar();
			if (obj instanceof Persona)
				System.out.println(obj);
		}
	}
}
