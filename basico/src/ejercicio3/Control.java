package ejercicio3;

public class Control {
	public static void main(String[] args) {
		ejemploFor();
		ejemploWhile();
	}

	private static void ejemploWhile() {
		System.out.println();
		int i = 0;
		while (i < 10) 
			System.out.println("i = " + ++i);

		System.out.println();
		i = 0;
		while (true) {
			if (i < 10)
				System.out.println("i = " + ++i);
			else
				break;
		}
		
		System.out.println();
		i = 0;
		while (true) {
			++i;
			if (i >= 0 && i < 4)
				continue;
			else if (i < 10)
				System.out.println("i = " + i);
			else
				break;
		}
	}



	private static void ejemploFor() {
		for (int i = 0; i < 10; i++) 
			System.out.println("i = " + i);
		
		System.out.println();
		for (int i = 0; i < 10; ) 
			System.out.println("i = " + i++);

		System.out.println();
		for (int i = 0; i < 10; ) 
			System.out.println("i = " + ++i);

		System.out.println();
		for (int i = 0; true;) {
			if (i < 10)
				System.out.println("i = " + ++i);
			else
				break;
		}

		System.out.println();
		int i = 0;
		for (;;) {
			if (i < 10)
				System.out.println("i = " + ++i);
			else
				break;
		}

	}
}
