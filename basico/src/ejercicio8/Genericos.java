package ejercicio8;

import java.util.ArrayList;
import java.util.List;

public class Genericos {
	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		
		for (Integer i : numeros) {
			System.out.println(i + 1);
		}
	}
}
