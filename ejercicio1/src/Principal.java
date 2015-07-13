import model.Producto;

public class Principal {
	public static void main(String[] args) {
		Producto p1 = new Producto();
		Producto p2 = new Producto("TV");
		Producto p3 = new Producto("Cámara", 200);
		Producto p4 = new Producto("DVD", 100, 50);
		
		System.out.println(p2);
		
		Principal principal = new Principal();
		principal.imprimir(p1);
		principal.imprimir(p2);
		principal.imprimir(p3);
		principal.imprimir(p4);
		
		p1.imprimir();
		p2.imprimir();
		p3.imprimir();
		p4.imprimir();
	}
	
	public void imprimir(Producto p) {
		System.out.println();
		System.out.println("nombre = " + p.getNombre());
		System.out.println("precio = " + p.getPrecio());
		System.out.println("cantidad = " + p.getCantidad());
	}
}
