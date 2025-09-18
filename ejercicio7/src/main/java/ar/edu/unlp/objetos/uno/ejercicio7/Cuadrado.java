package ar.edu.unlp.objetos.uno.ejercicio7;

public class Cuadrado  implements Figura2D {
	private double lado;
	
	public Cuadrado (double lado) {
		this.lado = lado;
	}
	
	public double getArea() {
		return Math.sqrt(lado);
	}
	public double getPerimetro() {
		return this.lado * 4;
	}
	
	
	public void setLado (double lado) {
		this.lado = lado;
	}
	public double getLado() {
		return this.lado; 
	}
	
}
