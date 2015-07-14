
public class FooBarBaz {
	public static void main(String[] args) {
		String[][] valores = new String[16][3];
		llenar(valores); // valores es una referencia
		imprimir(valores);
	}

	private static void imprimir(String[][] valores) {
		for (int i = 0; i < valores.length; i++) {
			System.out.println(
					(i + 1) + ". " +
					((valores[i][0] != null) ? valores[i][0] : "") +
					((valores[i][1] != null) ? valores[i][1] : "") +
					((valores[i][2] != null) ? valores[i][2] : "")
				);
		}
	}

	private static void llenar(String[][] valores) {
		for (int i = 0; i < valores.length; i++) {
			if ((i + 1) % 3 == 0)
				valores[i][0] = "foo ";
			if ((i + 1) % 5 == 0)
				valores[i][1] = "bar ";
			if ((i + 1) % 7 == 0)
				valores[i][2] = "baz ";
		}
	}
}
