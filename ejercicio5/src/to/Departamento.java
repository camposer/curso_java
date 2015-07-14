package to;

public enum Departamento {
	VENTAS("sales", 40), COMPRAS("buyings", 20), SISTEMAS("systems",10);
	
	private String department;
	private int numeroEmpleados;

	public String getDepartment() {
		return department;
	}

	public int getNumeroEmpleados() {
		return numeroEmpleados;
	}

	private Departamento(String department, int numeroEmpleados) {
		this.department = department;
		this.numeroEmpleados = numeroEmpleados;
	}
}
