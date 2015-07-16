package to;

import java.io.Serializable;
import java.util.Date;

public class Persona implements Serializable {
	private static final long serialVersionUID = -2761785130578652187L;

	private ColorOjos colorOjos;
	private float altura = 1.80f;
	private float peso = 80;
	private Date fechaNacimiento;

	public static enum ColorOjos {
		NEGRO, VERDE, AZUL, MARRON;
		
		public static ColorOjos getColorOjos(int index) {
			if (index == 0)
				return NEGRO;
			else if (index == 1)
				return VERDE;
			else if (index == 2)
				return AZUL;
			else
				return MARRON;
		}
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

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Persona [colorOjos=" + colorOjos + ", altura=" + altura
				+ ", peso=" + peso + ", fechaNacimiento=" + fechaNacimiento
				+ "]";
	}
}
