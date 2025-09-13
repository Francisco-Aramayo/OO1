package ar.edu.unlp.info.oo1.ejercicio2;

public class Producto {
	private double peso;
	private double precioPorKilo;
	private String descripcion;
	
	public Producto (String descripcion, double peso, double precio) {
		this.descripcion = descripcion;
		this.peso = peso;
		this.precioPorKilo = precio;
		
	}
	
	public double getPrecio() {
		return this.precioPorKilo * this.peso;
	}
	
	public double getPeso() {
		return this.peso;
	}

	public double getPrecioPorKilo() {
		return precioPorKilo;
	}

	public void setPrecioPorKilo(double precioPorKilo) {
		this.precioPorKilo = precioPorKilo;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
