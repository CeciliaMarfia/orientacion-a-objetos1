package ar.edu.unlp.info.oo1.ejercicio2;

public class Balanza {
	private Integer cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	
	
	public void ponerEnCero() {
		this.cantidadDeProductos = 0;
		this.precioTotal = 0;
		this.pesoTotal = 0;
	}
	
	public void agregarProducto(Producto producto) {
		this.cantidadDeProductos++; //incremento la cantidad de producto;
		this.precioTotal += producto.getPrecio();
		this.pesoTotal += producto.getPeso();
	}
	
	public Ticket emitirTicket() { //con lo calculado previamente genero el ticket
		Ticket comprobante = new Ticket(this.cantidadDeProductos, this.pesoTotal, this.precioTotal); //instancio el ticket
		return comprobante; //podria hacer el new aca 
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
