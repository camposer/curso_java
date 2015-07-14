package to;

import java.util.Date;

public class Empleado {
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