package com.bbva.gcre;

import java.util.List;

import com.bbva.gcre.dto.datacliente.ClienteDTO;
import com.bbva.gcre.dto.datacliente.DataDTO;
import com.bbva.gcre.lib.r001.GCRER001;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Transaccion para generar cronogramas
 *
 */
public class GCRET00101PETransaction extends AbstractGCRET00101PETransaction {

	private static final Logger LOGGER = LoggerFactory.getLogger(GCRET00101PETransaction.class);


	@Override
	public void execute() {
		ClienteDTO clienteDTO = new ClienteDTO();

		clienteDTO.setId(this.getIdcliente());
		clienteDTO.setImpPrestamo(this.getImpprestamo());
		clienteDTO.setNumCoutas(this.getNumcuotas());

		GCRER001 gcrer001= this.getServiceLibrary(GCRER001.class);

		List<DataDTO> out ;

		out = gcrer001.executeGeneracionCronogramas(clienteDTO);

		this.setOutdata(out);

	}

}
