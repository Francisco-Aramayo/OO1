package ar.edu.unlp.objetos.uno.ejercicio7;

public class Cuerpo3D{
	private double altura;
	private Figura2D cara;
	
	public Cuerpo3D(double altura, Figura2D cara) {
		this.altura = altura;
		this.cara = cara;
	}
	
	public void setAltura (double altura) {
		this.altura = altura;
	}
	
	public void setCaraBasal(Figura2D cara) {
		this.cara = cara;
	}
	
	public double getVolumen() {
		//El volumen de un cuerpo es: área-cara-basal * altura
		return this.cara.getArea() * altura;
	}
	
	public double getSuperficieExterior() {
		return 2 * this.cara.getArea()  + this.cara.getPerimetro() 
		* this.altura;
		
		//El área o superficie exterior de un cuerpo es: 
		//2* área-cara-basal + perímetro-cara-basal * altura-del-cuerpo
	}
	
}
