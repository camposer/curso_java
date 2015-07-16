package ejercicio9;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Nio {
	private static final String ARCHIVO_ENTRADA = "entrada.txt";

	public static void main(String[] args) throws Exception {
		System.out.print("Copiando...");
		System.out.println("Copiando el archivo " + ARCHIVO_ENTRADA);
		System.out.print("Nombre del archivo de salida? ");
		String archivoSalida = leerTeclado();
		
//		String texto = leerEntrada();
//		escribirSalida(texto, archivoSalida);
		copiar(ARCHIVO_ENTRADA, archivoSalida);
	}

	private static String leerTeclado() {
		try (Scanner scanner = new Scanner(System.in)) {
			return scanner.nextLine();
		}
	}

	private static void copiar(String archivoEntrada, String archivoSalida) throws IOException {
		Files.copy(new File(archivoEntrada).toPath(), 
				new File(archivoSalida).toPath(),
				StandardCopyOption.REPLACE_EXISTING);
	}

	private static void escribirSalida(String texto, String archivoSalida) throws IOException {
		Files.write(new File(archivoSalida).toPath(), 
				texto.getBytes(), 
				StandardOpenOption.CREATE,
				StandardOpenOption.TRUNCATE_EXISTING);
	}

	private static String leerEntrada() throws IOException {
		return new String(Files
				.readAllBytes(new File(ARCHIVO_ENTRADA).toPath()));
	}
	
	
}
