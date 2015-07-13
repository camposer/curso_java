package model;

public class Producto {
	private String nombre;
	private float precio;
	private float cantidad;

	public Producto() {
		this("", 0);
	}
	
	public Producto(String nombre) {
		this(nombre, 0); // primera línea!
		this.cantidad = 0;
	}

	public Producto(String nombre, float precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public Producto(String nombre, float precio, float cantidad) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public void imprimir() {
		System.out.println("\nnombre = " + nombre);
		System.out.println("precio = " + precio);
		System.out.println("cantidad = " + cantidad);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public float getCantidad() {
		return cantidad;
	}
	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}
}
