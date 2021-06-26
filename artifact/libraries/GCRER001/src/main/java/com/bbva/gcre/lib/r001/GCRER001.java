package com.bbva.gcre.lib.r001;

import java.util.List;

import com.bbva.gcre.dto.datacliente.ClienteDTO;
import com.bbva.gcre.dto.datacliente.DataDTO;

/**
 * The  interface GCRER001 class...
 */
public interface GCRER001 {

	/**
	 * The execute method...
	 */
	List<DataDTO> executeGeneracionCronogramas(ClienteDTO cliente);

}
