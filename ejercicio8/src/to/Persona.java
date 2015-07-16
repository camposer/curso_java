package to;

public class Persona {
	private ColorOjos colorOjos;
	private float altura = 1.80f;
	private float peso = 80;

	public static enum ColorOjos {
		NEGRO, VERDE, AZUL, MARRON;
	}
	
	public Persona() {
		this(ColorOjos.NEGRO);
	}

	public Persona(ColorOjos colorOjos) {
		this(colorOjos, 0, 0);
	}

	public Persona(ColorOjos colorOjos, float altura) {
		this.colorOjos = colorOjos;
		this.altura = altura;
		this.peso = 80;
	}

	public Persona(ColorOjos colorOjos, float altura, float peso) {
		this.colorOjos = colorOjos;
		this.altura = altura;
		this.peso = peso;
	}

	public ColorOjos getColorOjos() {
		return this.colorOjos;
	}

	public void setColorOjos(ColorOjos color) {
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

	@Override
	public String toString() {
		return "Persona [colorOjos=" + colorOjos + ", altura=" + altura
				+ ", peso=" + peso + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(altura);
		result = prime * result
				+ ((colorOjos == null) ? 0 : colorOjos.hashCode());
		result = prime * result + Float.floatToIntBits(peso);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (Float.floatToIntBits(altura) != Float.floatToIntBits(other.altura))
			return false;
		if (colorOjos != other.colorOjos)
			return false;
		if (Float.floatToIntBits(peso) != Float.floatToIntBits(other.peso))
			return false;
		return true;
	}
}
