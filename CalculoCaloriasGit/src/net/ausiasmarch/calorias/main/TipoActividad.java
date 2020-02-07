package net.ausiasmarch.calorias.main;

import net.ausiasmarch.common.Convert;

public class TipoActividad {

	private double factor;
	private String factAct;

	public TipoActividad(String factAct, double factor) {
		this.factAct = factAct;
		this.factor = factor;

	}
	
	public double getFactor() {
		return factor;
	}
	public void setFactor(double factor) {
		this.factor = factor;
	}
	public String getFactAct() {
		return factAct;
	}
	public void setFactAct(String factAct) {
		this.factAct = factAct;
	}

	
}
