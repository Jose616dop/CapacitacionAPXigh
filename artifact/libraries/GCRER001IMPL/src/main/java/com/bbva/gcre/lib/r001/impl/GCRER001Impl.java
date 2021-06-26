package com.bbva.gcre.lib.r001.impl;

import java.util.ArrayList;
import java.util.List;

import com.bbva.gcre.dto.datacliente.ClienteDTO;
import com.bbva.gcre.dto.datacliente.DataDTO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The  interface GCRER001Impl class...
 */
public class GCRER001Impl extends GCRER001Abstract {

	private static final Logger LOGGER = LoggerFactory.getLogger(GCRER001Impl.class);

	@Override
	public List<DataDTO> executeGeneracionCronogramas(ClienteDTO cliente) {
		List<DataDTO> out = new ArrayList<>();

		DataDTO dataDTO = new DataDTO();

		dataDTO.setCapital(280);
		dataDTO.setFechaCuota("01/07/2021");
		dataDTO.setImpCuota(308);
		dataDTO.setInteres(0.2);
		dataDTO.setNumCuota(1);

		out.add(dataDTO);

		return out;
	}

	
}
