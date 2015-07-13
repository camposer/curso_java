import to.MiFecha;


public class Principal {
	public static void main(String[] args) {
		MiFecha a = new MiFecha(12, 9, 2009);
		MiFecha b = a;
		MiFecha c = a;

		a = b = c = null;
		System.gc();
	}
}
