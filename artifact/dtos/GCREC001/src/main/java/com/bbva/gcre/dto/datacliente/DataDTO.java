package com.bbva.gcre.dto.datacliente;

import com.bbva.apx.dto.AbstractDTO;

/**
 * The DataDTO class...
 */
public class DataDTO extends AbstractDTO {
	private int numCuota;
	private long impCuota;
	private double capital;
	private double interes;
	private String fechaCuota;
	
	public int getNumCuota() {
		return numCuota;
	}
	public void setNumCuota(int numCuota) {
		this.numCuota = numCuota;
	}
	public double getCapital() {
		return capital;
	}
	public void setCapital(double capital) {
		this.capital = capital;
	}
	public double getInteres() {
		return interes;
	}
	public void setInteres(double interes) {
		this.interes = interes;
	}
	public String getFechaCuota() {
		return fechaCuota;
	}
	public void setFechaCuota(String fechaCuota) {
		this.fechaCuota = fechaCuota;
	}
	
	public long getImpCuota() {
		return impCuota;
	}
	public void setImpCuota(long impCuota) {
		this.impCuota = impCuota;
	}
	@Override
	public String toString() {
		return "DataDTO [capital=" + capital + ", fechaCuota=" + fechaCuota + ", impCuota=" + impCuota + ", interes="
				+ interes + ", numCuota=" + numCuota + "]";
	}

	

	
}
