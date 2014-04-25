package de.avgl.dmp.controller.providers.handler;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

import de.avgl.dmp.controller.providers.BaseExceptionHandler;
import de.avgl.dmp.converter.DMPMorphDefException;

/**
 * An exception handler for providing exact messages for wrong Metamorph definitions
 *
 * @author phorn
 */
@Provider
public class DMPMorphDefExceptionHandler extends BaseExceptionHandler<DMPMorphDefException> {

	@Override
	public Response toResponse(DMPMorphDefException exception) {

		final String message = errorMessage(exception);
		return createResponse(message);
	}
}
