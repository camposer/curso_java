package uno;

import java.util.Date;

import to.Departamento;
import to.Director;
import to.Empleado;
import to.Gerente;

public class Principal {
	public static void main(String[] args) {
		Empleado[] empleados = new Empleado[] {
			new Gerente("Juan", 1000f, new Date(), Departamento.VENTAS),
			new Gerente("María", 1000f, new Date(), Departamento.VENTAS),
			new Director("Pedro", 2000f, null, Departamento.COMPRAS, true),
			new Director("Rodolfo", 2000f, null, Departamento.SISTEMAS, true),
			new Empleado("Alejandctro", 1000f, null)
		};
		
		for (Empleado e : empleados) {
			System.out.println("\n" + e);
			
			System.out.println("Clase: " + e.getClass().getName());
			if (e instanceof Director) 
				System.out.println("Es un Director");
			if (e instanceof Gerente)
				System.out.println("Es un Gerente");
			if (e instanceof Empleado)
				System.out.println("Es un Empleado");
		}
	}
}
