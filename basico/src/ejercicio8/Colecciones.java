package ejercicio8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Colecciones {
	public static void main(String[] args) {
		set();
//		list();
	}

	private static void list() {
		List lista = new ArrayList();
		lista.add("uno");
		lista.add("dos");
		lista.add(1);
		lista.add(2);
		lista.add(new String("uno"));
		lista.add("dos");
		lista.add("1");
		lista.add("2");
		
		for (int i = 0; i < lista.size(); i++)
			System.out.println(lista.get(i));

		System.out.println();
		for (Object o : lista)
			System.out.println(o);

		System.out.println();
		Iterator i = lista.iterator();
		while (i.hasNext())
			System.out.println(i.next());
	}

	private static void set() {
		Set conjunto = new HashSet();
		conjunto.add("uno");
		conjunto.add("dos");
		conjunto.add(1);
		conjunto.add(2);
		conjunto.add(new String("uno"));
		conjunto.add("dos");
		conjunto.add("1");
		conjunto.add("2");
		conjunto.add(new A(1));
		conjunto.add(new A(1));
		
		for (Object o : conjunto)
			System.out.println(o);

		System.out.println();
		Iterator i = conjunto.iterator();
		while (i.hasNext())
			System.out.println(i.next());
	}
}

class A  {
	public int a;
	public A(int a) {
		this.a = a;
	}
	@Override
	public String toString() {
		return "A [a=" + a + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		A other = (A) obj;
		if (a != other.a)
			return false;
		return true;
	}
}






