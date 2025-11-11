package ar.edu.unlp.info.oo1.ej3_presupuestos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo1.ej3_presupuestos.Item;
import ar.edu.unlp.info.oo1.ej3_presupuestos.Presupuesto;

public class PresupuestoTest {

	private Presupuesto presupuesto;

	@BeforeEach
	public void setUp() {
		presupuesto = new Presupuesto("Pedro");
	}

	@Test
	public void testCalcularTotal() {
		assertEquals(0, presupuesto.calcularTotal()); //Esto significa que tiene que “guardar” en algún lado los Item que se le agreguen.

		Item item = new Item("Leche", 100, 1);
		presupuesto.agregarItem(item);
		assertEquals(100, presupuesto.calcularTotal());

		item = new Item("Chocolate", 150, 2);
		presupuesto.agregarItem(item); //Se pueden agregar múltiples ítems con presupuesto.agregarItem(item).
		//Eso implica que Presupuesto debe tener una colección de varios Item, no un único campo.

		assertEquals(400, presupuesto.calcularTotal()); //calcularTotal() devuelve la suma de los costos de todos los ítems. por lo tanto debo utilizar una colección
	}

	@Test
	public void testInitialize() {
		assertEquals(LocalDate.now(), presupuesto.getFecha());
		assertEquals("Pedro", presupuesto.getCliente());
		assertEquals(0, presupuesto.calcularTotal());
	}

}
