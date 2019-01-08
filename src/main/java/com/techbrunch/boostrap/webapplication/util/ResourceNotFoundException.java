package com.techbrunch.boostrap.webapplication.util;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception {

	private static final long serialVersionUID = -4644869501616701272L;

	private static final String EXCEPTION_TEXT = "The requested resource was not found";

	public ResourceNotFoundException() {
		super(EXCEPTION_TEXT);
	}

}
