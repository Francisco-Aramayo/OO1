package ar.edu.unlp.info.oo1.ejercicio3;

import java.time.LocalDate;
import java.util.List;
import java.util.LinkedList;

public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private List<Item> listaItems;
	
	public Presupuesto (String cliente) {
		this.fecha = LocalDate.now();
		this.cliente = cliente;
		this.listaItems = new LinkedList<>();
	}
	
	public void agregarItem (Item item) {
		this.listaItems.add(item);
		
	}
	public double calcularTotal() {
		double total = 0;
		
		for (Item item: listaItems){
			total+= item.costo();
		}
		
		return total;
	}
	
	public String getCliente() {
		return this.cliente;
	}
	public LocalDate getFecha() {
		return this.fecha;
	}
}
