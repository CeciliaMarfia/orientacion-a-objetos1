package io.github.unlp_oo.ejercicio29_PlataformaDeStream;

public abstract class Plan {
	private int cantIP;
	
	
	public Plan(int cantIP) {
		this.cantIP = cantIP;
	}

	public abstract double precioBasePlan() {
		}
		
	public abstract double  montoPenalización() {
			
		}

	public int getCantIP() {
		return cantIP;
	}

	public void setCantIP(int cantIP) {
		this.cantIP = cantIP;
	}
	
	
	}

