package ar.edu.unlp.info.oo1.ejercicio14_volumenYSuperficieDeSolidos;

import java.util.ArrayList;
import java.util.List;

public class ReporteDeConstruccion {
	private List<Pieza> piezas;
	
	
	public ReporteDeConstruccion() {
		this.piezas = new ArrayList<Pieza>();
	}
	
	public void agregarPieza(Pieza pie) {
		piezas.add(pie);
	}
	
	/** volumenDeMaterial(nombreDeMaterial: String)
	"Recibe como parámetro un nombre de material (un string, por ejemplo 'Hierro'). 
	Retorna la suma de los volúmenes de todas las piezas hechas en ese material"
	
	
	
	public double volumenDeMaterial(String nombreDeMaterial){
		return piezas.stream()
		.filter (p -> p.getMaterial().equals(nombreDeMaterial)) //filtro por material
				.mapToDouble(p -> p.getVolumen()) //obtengo el volumen
				.sum(); //lo sumo
		
	}	**/
	
	
	public double volumenDeMaterial(String nombreDeMaterial){
		double sumaVolumenes = 0;
		
		for (Pieza p : piezas) {
			 if (p.getMaterial().equals(nombreDeMaterial)) {
				 sumaVolumenes += p.volumen();
			 }
		}
		return sumaVolumenes;
	}
	
	/** superficieDeColor(unNombreDeColor: String)
	"Recibe como parámetro un color (un string, por ejemplo 'Rojo'). 
	Retorna la suma de las superficies externas de todas las piezas pintadas con ese color".
	
	
	public double superficieDeColor(String unNombreDeColor){
	double sumaSuperficies = 0;
		
		for (Pieza p : piezas) {
			 if (p.getColor().equals(unNombreDeColor)) {
				 sumaSuperficies += p.superficie();
			 }
		}
		return sumaSuperficies;
	}
**/
	public double superficieDeColor(String unNombreDeColor){
		return piezas.stream()
				.filter(p-> p.getColor().equals(unNombreDeColor))
				.mapToDouble(p->p.superficie())
				.sum();
	}
	
}
