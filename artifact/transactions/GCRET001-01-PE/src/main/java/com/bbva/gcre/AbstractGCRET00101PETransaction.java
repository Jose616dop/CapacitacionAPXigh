package com.bbva.gcre;

import com.bbva.elara.transaction.AbstractTransaction;
import com.bbva.gcre.dto.datacliente.DataDTO;
import java.util.List;

/**
 * In this class, the input and output data is defined automatically through the setters and getters.
 */
public abstract class AbstractGCRET00101PETransaction extends AbstractTransaction {

	public AbstractGCRET00101PETransaction(){
	}


	/**
	 * Return value for input parameter idCliente
	 */
	protected String getIdcliente(){
		return (String)this.getParameter("idCliente");
	}

	/**
	 * Return value for input parameter numCuotas
	 */
	protected Long getNumcuotas(){
		return (Long)this.getParameter("numCuotas");
	}

	/**
	 * Return value for input parameter impPrestamo
	 */
	protected Double getImpprestamo(){
		return (Double)this.getParameter("impPrestamo");
	}

	/**
	 * Set value for List<DataDTO> output parameter outData
	 */
	protected void setOutdata(final List<DataDTO> field){
		this.addParameter("outData", field);
	}
}
