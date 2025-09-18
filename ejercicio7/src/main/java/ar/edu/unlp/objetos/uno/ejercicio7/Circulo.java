package ar.edu.unlp.objetos.uno.ejercicio7;

public class Circulo implements Figura2D{
	private double diametro;
	private double radio;
	
	
	public Circulo (double diametro, 
			double radio) {
		this.diametro = diametro;
		this.radio = radio;
	}
	
	public double getPerimetro() {
		return Math.PI * this.diametro;
	}
	
	public double getArea() {
		return Math.PI * Math.sqrt(radio);
	}
	
	
	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	public double getDiametro() {
		return Math.sqrt(radio);
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public double getRadio() {
		return this.radio;
	}
}
