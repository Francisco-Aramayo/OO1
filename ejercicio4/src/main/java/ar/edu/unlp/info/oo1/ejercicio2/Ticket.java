package ar.edu.unlp.info.oo1.ejercicio2;

import java.util.List;
import java.time.LocalDate;

public class Ticket {
	private LocalDate fecha;
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	private List<Producto> productos;
	
	public Ticket(int cantidadDeProductos, double precioTotal, 
			double pesoTotal, List<Producto>productos) {
		this.fecha = LocalDate.now();
		this.cantidadDeProductos = cantidadDeProductos;
		this.precioTotal = precioTotal;
		this.pesoTotal = pesoTotal;
		this.productos = productos;
	}
	
	// el ticket ahora debe tener cada producto
	
	public List<Producto> getProductos(){
		return this.productos;
	}
	
	public double impuesto() {
		return this.precioTotal * 0.21;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}

	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}

	public LocalDate getFecha() {
		return fecha;
	}
	
	
	
	
}
