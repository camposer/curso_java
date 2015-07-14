package ejercicio4;

import javax.sound.midi.MidiChannel;

public class Arrays {
	public static void main(String[] args) {
		int[] numeros = new int[10];
		System.out.println();
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(i + ". " + numeros[i]);
		}
		
		A[] as = new A[10];
		// Llenando array
		for (int i = 0; i < as.length; i++) {
			as[i] = new A(i);
		}
		// Imprimiendo array
		System.out.println();
		for (int i = 0; i < as.length; i++) {
			System.out.println(i + ". " + as[i]);
		}
		
		as = new A[]{ new A(1), new A(2), new A(3) };
		System.out.println();
		for (int i = 0; i < as.length; i++) {
			System.out.println(i + ". " + as[i]);
		}

		String nombres[] = { "hola", "chao", "bienvenido" };
		System.out.println();
		for (int i = 0; i < nombres.length; i++) {
			System.out.println(i + ". " + nombres[i]);
		}

		A[][][] multiAs = new A[3][][];
		multiAs[0] = new A[2][];
		multiAs[0][1] = new A[2];
		multiAs[1] = new A[50][];
		multiAs[0][1] = new A[2];
	}
}

class A {
	public int a;
	public A(int a ) {
		this.a = a;
	}
	public String toString() {
		return "A [a=" + a + "]";
	}
}
