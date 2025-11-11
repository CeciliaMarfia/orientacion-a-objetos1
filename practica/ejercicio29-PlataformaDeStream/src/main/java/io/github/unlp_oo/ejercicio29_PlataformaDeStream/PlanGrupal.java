package io.github.unlp_oo.ejercicio29_PlataformaDeStream;

public class PlanGrupal extends Plan{
	private int cantDirIP;
	
	
	
	@Override

	public double precioBasePlan() {
		return 800* this.cantDirIP;
	}

	@Override

	public double montoPenalización() {
		if(this.cantDirIP )> this.getCantIP()  ) {
			return 500;
		}
		
		return 0;
	}
}
