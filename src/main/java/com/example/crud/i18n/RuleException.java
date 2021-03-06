package com.example.crud.i18n;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.EXPECTATION_FAILED)
public class RuleException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5383655513965443243L;

	public RuleException(String message) {
		super(message);
	}

	public RuleException(Messages message) {
		super(MessageFactory.getMessage(message));
	}

	public RuleException(Messages message, String... args) {
		super(MessageFactory.getMessage(message, args));
	}

	@Override
	public synchronized Throwable fillInStackTrace() {
		return this;
	}
}