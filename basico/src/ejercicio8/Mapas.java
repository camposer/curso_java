package ejercicio8;

import java.util.Date;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Mapas {
	public static void main(String[] args) {
		Date fecha = new Date();
		
		Map mapa = new Hashtable();
		mapa.put(fecha, "hola");
		mapa.put(fecha, "chao");
		mapa.put(1, "hola");
		mapa.put(2, 2);
		mapa.put("nif", 2);
		
		System.out.println("fecha = " + mapa.get(fecha)); // => chao
		
		Set claves = mapa.keySet();
		for (Object c : claves)
			System.out.println(c + " : " + mapa.get(c));
	}
}
