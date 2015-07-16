package ejercicio9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class Serializacion {
	private static final String ARCHIVO_SERIALIZACION = "A.byte";

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		List<A> as = Arrays.asList(new A(1), new A(2));
		System.out.println(as);
		serializar(as);
		
		as = (List<A>)deserializar();
		System.out.println(as);
	}

	private static Object deserializar() throws ClassNotFoundException, IOException {
		InputStream is = new FileInputStream(ARCHIVO_SERIALIZACION);
		try (ObjectInputStream ois = new ObjectInputStream(is)) {
			return ois.readObject();
		}
	}

	private static void serializar(Object obj) throws IOException {
		OutputStream os = new FileOutputStream(ARCHIVO_SERIALIZACION);
		ObjectOutputStream oos = new ObjectOutputStream(os);
		oos.writeObject(obj);
		oos.close();
	}
}

class A implements Serializable {
	private static final long serialVersionUID = -1411706497631035562L;

	public int valor;
	public A(int valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "A [valor=" + valor + "]";
	}
}
