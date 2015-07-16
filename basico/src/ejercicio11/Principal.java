package ejercicio11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Principal {
	private static final String PATRON = "yyyy-MM-dd";
	
	public static void main(String[] args) {
		new Principal().iniciar();
	}
	private void iniciar() {
		String idioma = "es";
		String pais = "AR";
		
		Locale locale = new Locale(idioma, pais);
		Locale.setDefault(locale);
		ResourceBundle mensajes = ResourceBundle.getBundle("mensajes", locale);
		
		try (Scanner scanner = new Scanner(System.in)) {
			Persona p = new Persona();
			System.out.print(mensajes.getString("persona.nombre"));
			p.nombre = scanner.nextLine();
			
			System.out.print(mensajes.getString("persona.apellido"));
			p.apellido = scanner.nextLine();
			
			System.out.print(mensajes.getString("persona.altura"));
			p.altura = Float.parseFloat(scanner.nextLine());
			
			System.out.print(mensajes.getString("persona.fechaNacimiento"));
			p.fechaNacimiento = new SimpleDateFormat(PATRON).parse(scanner.nextLine());
			
			System.out.println(p);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}

class Persona {
	public String nombre;
	public String apellido;
	public Float altura;
	public Date fechaNacimiento;
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido
				+ ", altura=" + altura + 
//				", fechaNacimiento=" + new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z", locale).format(fechaNacimiento)
								", fechaNacimiento=" + fechaNacimiento
				+ "]";
	}
}


