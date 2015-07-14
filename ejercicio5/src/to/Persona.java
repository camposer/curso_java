package to;

public class Persona extends SerVivo {
	private String colorOjos;
	private float altura = 1.80f;
	private float peso = 80;

	@Override
	public void respirar() {
		System.out.println("Estoy respirando como Persona");
	}
	
	@Override
	public void comer() {
		System.out.println("Estoy comiendo como Persona");
	}
	
	public void comer(int cantidad) { // overload
		System.out.println("Estoy comiendo " +  cantidad + " cantidad");
	}
	
	public void caminar() {
		System.out.println("Estoy caminando como Persona");
	}
	
	public Persona() {
		this("NEGRO");
	}

	public Persona(String colorOjos) {
		this(colorOjos, 0, 0);
	}

	public Persona(String colorOjos, float altura) {
		this.colorOjos = colorOjos;
		this.altura = altura;
		this.peso = 80;
	}

	public Persona(String colorOjos, float altura, float peso) {
		this.colorOjos = colorOjos;
		this.altura = altura;
		this.peso = peso;
	}

	public String getColorOjos() {
		return this.colorOjos;
	}

	public void setColorOjos(String color) {
		colorOjos = color;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
}
