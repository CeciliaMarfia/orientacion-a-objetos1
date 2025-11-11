package io.github.unlp_oo.ejercicio29_PlataformaDeStream;

public class PlanIndividual extends Plan{
	private int minutosContratados;
	
	
	
	
	
	public PlanIndividual(int minutosContratados) {
		super();
		this.minutosContratados = minutosContratados;
	}


	@Override

	public double precioBasePlan() {
		return 20*this.minutosContratados;
	}
	
	
	/***Si el cliente tiene un plan individual será penalizado si utilizó más de una dirección IP
	 *  en las actividades registradas durante ese intervalo. El costo por cada IP adicional que haya utilizado es de $300.***/
	@Override

	public double montoPenalización() {
		if(this.getCantIP() > 1 ) {
			return 300;
		}
		
		return 0;
	}
}
