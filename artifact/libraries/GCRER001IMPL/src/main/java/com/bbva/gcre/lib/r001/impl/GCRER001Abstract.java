package com.bbva.gcre.lib.r001.impl;

import com.bbva.elara.configuration.manager.application.ApplicationConfigurationService;
import com.bbva.elara.library.AbstractLibrary;
import com.bbva.gcre.lib.r001.GCRER001;

/**
 * This class automatically defines the libraries and utilities that it will use.
 */
public abstract class GCRER001Abstract extends AbstractLibrary implements GCRER001 {

	protected ApplicationConfigurationService applicationConfigurationService;


	/**
	* @param applicationConfigurationService the this.applicationConfigurationService to set
	*/
	public void setApplicationConfigurationService(ApplicationConfigurationService applicationConfigurationService) {
		this.applicationConfigurationService = applicationConfigurationService;
	}

}