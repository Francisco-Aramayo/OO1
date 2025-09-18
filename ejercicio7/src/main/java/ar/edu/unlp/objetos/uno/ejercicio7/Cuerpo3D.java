package ar.edu.unlp.objetos.uno.ejercicio7;

public class Cuerpo3D {

	// CONVERTIRLO EN INTERFAZ!!!!
	
	private double altura;
	private Circulo cara;
	private double area;
	
	public Cuerpo3D( ) { //parametros 
		this.
	}
	
	
	public setAltura (double altura) {
		
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setCaraBasal (Cuadrado cara) {
		
	}
	
	public Cuadrado getCaraBasal() {
		return this.cara;
	}
	
	public double getVolumen () {
		return this.area - this.cara.getArea() * this.altura ; 
	}
	
	public double getSuperficieExterior() {
		
	}
}
