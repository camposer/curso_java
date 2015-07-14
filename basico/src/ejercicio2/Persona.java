package ejercicio2;

public class Persona {
	private String colorOjos;
	private float altura = 1.80f;
	private float peso = 80;

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
