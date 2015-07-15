package ejercicio8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Ordenacion {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(5, 3, 1, 4, 2);
		System.out.println(numeros);

		// Orden ascendente (porque Integer implementa Comparable)
		Collections.sort(numeros);
		System.out.println(numeros);
		
		// Orden descendente
		Collections.sort(numeros, new Ordenacion.Comparador1());
		System.out.println(numeros);
		
		Set<B> bs = new TreeSet<B>();
		bs.add(new B(3));
		bs.add(new B(1));
		bs.add(new B(5));
		bs.add(new B(4));
		bs.add(new B(2));
		System.out.println(bs);

	
		List<B> listaBs = new ArrayList<>();
		listaBs.add(new B(3));
		listaBs.add(new B(1));
		listaBs.add(new B(5));
		listaBs.add(new B(4));
		listaBs.add(new B(2));
		System.out.println(listaBs);
		
		Collections.sort(listaBs);
		System.out.println(listaBs);
	}
	
	public static class Comparador1 implements Comparator<Integer> { // innerclass
		@Override
		public int compare(Integer n1, Integer n2) {
			return n2 - n1;
		}
		
	}
}

class B implements Comparable<B> {
	private int valor;
	
	public B(int valor) {
		this.valor = valor;
	}

	@Override
	public int compareTo(B b) {
		return valor - b.valor;
	}

	@Override
	public String toString() {
		return "B [valor=" + valor + "]";
	}
	
	
}





