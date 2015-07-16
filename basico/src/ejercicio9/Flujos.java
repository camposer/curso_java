package ejercicio9;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;

public class Flujos {
	private static final String ARCHIVO_SALIDA = "salida.txt";
	private static final String ARCHIVO_ENTRADA = "entrada.txt";

	public static void main(String[] args) throws Exception {
		System.out.print("Copiando...");
		String texto = leerEntrada();
		
		escribirSalida(texto);
	}

	private static void escribirSalida(String texto) {
		PrintStream ps = null;
		try {
			OutputStream os = new FileOutputStream(ARCHIVO_SALIDA);
			ps = new PrintStream(os);
			ps.println(texto);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private static String leerEntrada() {
		StringBuilder sb = null;
		try (
				InputStream is = new FileInputStream(ARCHIVO_ENTRADA);
				Reader r = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(r);
			)
		{
			
			String linea = br.readLine();
			sb = new StringBuilder();
			while (linea != null) {
				sb.append(linea);
				linea = br.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		return (sb != null) ? sb.toString() : null;
	}
	
	
}
