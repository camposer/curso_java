package util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class Serializador {
	private String archivoSalida;
	
	public Serializador(String archivoSalida) {
		this.archivoSalida = archivoSalida;
	}
	
//	public Object deserializar() throws IOException, ClassNotFoundException {
//		InputStream is = new FileInputStream(archivoSalida);
//		try (ObjectInputStream ois = new ObjectInputStream(is)) {
//			return ois.readObject();
//		}
//	}
//
//	public void serializar(Serializable obj) throws IOException {
//		OutputStream os = new FileOutputStream(archivoSalida);
//		ObjectOutputStream oos = new ObjectOutputStream(os);
//		oos.writeObject(obj);
//		oos.close();
//	}

	public Object deserializar() throws IOException, ClassNotFoundException {
		byte[] bytes = Files.readAllBytes(new File(archivoSalida).toPath());
		InputStream is = new ByteArrayInputStream(bytes);
		try (ObjectInputStream ois = new ObjectInputStream(is)) {
			return ois.readObject();
		}
	}

	public void serializar(Serializable obj) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		oos.writeObject(obj); // Objeto serializado en el ByteArrayOutputStream
		oos.close();
		
		Files.write(new File(archivoSalida).toPath(), 
				baos.toByteArray(), 
				StandardOpenOption.CREATE,
				StandardOpenOption.TRUNCATE_EXISTING);
	}

}
