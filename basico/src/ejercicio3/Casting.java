package ejercicio3;

public class Casting {
	public static void main(String[] args) {
		int a = 30000;
		long b = a;
		int c = (int)b;
		System.out.println("c = " + c);
		
		int d = 65;
		char e = (char)d;
		System.out.println("d = " + d + ", e = " + e);
		
		float f = 1.9f;
		double g = f;
		float h = (float)g;
		System.out.println("h = " + h);
		
		float i = (float)1.9;
		int j = (int)i;
		System.out.println("i = " + i  + ", j = " + j);
	}
}






