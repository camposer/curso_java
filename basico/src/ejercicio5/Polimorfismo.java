package ejercicio5;

import java.util.Date;

public class Polimorfismo {
	public static void main(String[] args) {
		Empleado e = new Director();
		System.out.println(e);
		Director d = (Director)e;
		Empleado f = new Director();
		System.out.println(d.departamento);
	}
}

class Empleado {
	public String nombre;
	public Float salario;
	public Date fechaNacimiento;
	
	public Empleado(String nombre, Float salario, Date fechaNacimiento) {
		this.nombre = nombre;
		this.salario = salario;
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", salario=" + salario
				+ ", fechaNacimiento=" + fechaNacimiento + "]";
	}
}

class Gerente extends Empleado {
	String departamento;

	public Gerente(String nombre, Float salario, Date fechaNacimiento,
			String departamento) {
		super(nombre, salario, fechaNacimiento);
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Gerente [departamento=" + departamento + 
				", nombre=" + super.nombre
				+ ", salario=" + this.salario + ", fechaNacimiento="
				+ fechaNacimiento + "]";
	}
}

class Director extends Gerente {
	public boolean tieneCoche;
	
	public Director() {
		super(null, null, null, null);
	}

	@Override
	public String toString() {
		return "Director [tieneCoche=" + tieneCoche + ", departamento="
				+ departamento + ", nombre=" + nombre + ", salario=" + salario
				+ ", fechaNacimiento=" + fechaNacimiento + "]";
	}
}


