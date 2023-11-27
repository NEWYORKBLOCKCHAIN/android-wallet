package com.alphawallet.app.entity;
/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public class ServiceException extends Exception {
	public final ErrorEnvelope error;

	public ServiceException(String message) {
		super(message);

		error = new ErrorEnvelope(message);
	}
}
