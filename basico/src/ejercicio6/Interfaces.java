package ejercicio6;

public class Interfaces {
	public static void main(String[] args) {
		B b  = new B();
		b.m1();
		b.m2();
		b.m3();
		b.m4();
	}
}
interface I1 {
	void m3(); // public m3()
	public void m4();
}

abstract class A implements I1 {
	abstract void m1();
	void m2() {
		//con.begin();
		m1();
		//con.close();
	}
	public void m3() { }
}

class B extends A {
	@Override
	void m1() { 
		//con.exec("SELECT * FROM ....")
	}
	public void m4() { }
}