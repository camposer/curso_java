package to;

import java.util.Date;

public class Director extends Gerente {
	public boolean tieneCoche;
	
	public Director(String nombre, Float salario, Date fechaNacimiento,
			Departamento departamento, boolean tieneCoche) {
		super(nombre, salario, fechaNacimiento, departamento);
		this.tieneCoche = tieneCoche;
	}

	@Override
	public String toString() {
		return "Director [tieneCoche=" + tieneCoche + ", departamento="
				+ departamento.getDepartment() + ", nombre=" + nombre + ", salario=" + salario
				+ ", fechaNacimiento=" + fechaNacimiento + "]";
	}
}