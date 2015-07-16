package dos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import to.Departamento;
import to.Director;
import to.Empleado;
import to.Gerente;

public class Principal {
	public static void main(String[] args) {
		List<Empleado> empleados = new ArrayList<>();
		empleados.add(new Director("Juan", 3000f, null, Departamento.COMPRAS, true));
		empleados.add(new Gerente("Pedro", 2000f, null, Departamento.COMPRAS));
		empleados.add(new Director("María", 3000f, null, Departamento.VENTAS, false));
		empleados.add(new Gerente("Antonio", 2000f, null, Departamento.VENTAS));
		empleados.add(new Empleado("Paloma", 1000f, null));
		
		System.out.println("** Empleados (orden inserción)\n");
		imprimir(empleados);
		
		Comparator<Empleado> comparador = new Comparator<Empleado>() { // Clase anónima
			@Override
			public int compare(Empleado e1, Empleado e2) {
				return (int)Math.ceil(e1.salario - e2.salario);
			} 
		};
		
		Collections.sort(empleados, comparador);
		System.out.println("** Empleados (orden asc por salario)\n");
		imprimir(empleados);
	}

	private static void imprimir(List<Empleado> empleados) {
		Iterator<Empleado> iterador = empleados.iterator();
		while (iterador.hasNext()) {
			Empleado e = iterador.next();
			System.out.println("Soy un Empleado");
			
			if (e instanceof Gerente) 
				System.out.println("Soy un Gerente");
			if (e instanceof Director) 
				System.out.println("Soy un Director");
				
			System.out.println(e + "\n");
		}
	}
}





