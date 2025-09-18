package ar.edu.unlp.info.oo1.ejercicio2;
import java.util.List;
import java.util.LinkedList;
public class Balanza {
	private int cantidadDeProductos;
	private float precioTotal;
	private float pesoTotal;
	private List<Producto> lista;
	
	public Balanza() {
		this.ponerEnCero();
	}
	
	public void ponerEnCero() {
		this.cantidadDeProductos = 0;
		this.precioTotal = 0;
		this.pesoTotal = 0;
		this.lista = new LinkedList<>();
	}
	
	public void agregarProducto(Producto producto) {
		this.pesoTotal += producto.getPeso();
		this.precioTotal += producto.getPrecio();
		this.cantidadDeProductos++;
		this.lista.add(producto);
	}
	
	public List<Producto> getProductos(){
		return this.lista;
	}
	
	public Ticket emitirTicket() {
		return new Ticket(this.cantidadDeProductos,
				this.precioTotal,this.pesoTotal,this.lista);
		
	}
	
	public int getCantidadDeProductos() {
		return this.cantidadDeProductos;
	}
	public double getPrecioTotal() {
		return this.precioTotal;
	}
	public double getPesoTotal() {
		return this.pesoTotal;
	}
}
