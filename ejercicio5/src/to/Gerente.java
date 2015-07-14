package to;

import java.util.Date;

public class Gerente extends Empleado {
	public Departamento departamento;

	public Gerente(String nombre, Float salario, Date fechaNacimiento,
			Departamento departamento) {
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