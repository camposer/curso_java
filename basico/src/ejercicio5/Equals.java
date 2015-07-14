package ejercicio5;

public class Equals {
	public static void main(String[] args) {
		A a = new A(1);
		A b = new A(1);
		
		if (a == b)
			System.out.println("Son idénticos");
		else if (a.equals(b))
			System.out.println("Son iguales");
		else 
			System.out.println("Son diferentes");

		String c = new String("hola");
		String d = new String("hola");
		if (c == d)
			System.out.println("Son idénticos");
		else if (c.equals(d))
			System.out.println("Son iguales");
		else 
			System.out.println("Son diferentes");
	}
}

class A {
	public int a;
	public A(int a) {
		this.a = a;
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







