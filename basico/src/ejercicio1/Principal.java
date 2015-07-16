package ejercicio1;

public class Principal {
	public static void main(String[] args) {
		Hilo h = new Hilo();
		new Thread(h).start();
		new Thread(h).start();
		new Thread(h).start();
	}
}

class Hilo implements Runnable {

	@Override
	public void run() {
		while (true){
			synchronized (this) {
				System.out.println("1. Id = " + Thread.currentThread().getId());
				System.out.println("1. Nombre = " + Thread.currentThread().getName());
			}
			imprimir();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private synchronized void imprimir() {
		System.out.println("2. Id = " + Thread.currentThread().getId());
		System.out.println("2. Nombre = " + Thread.currentThread().getName());

	}
	
}
