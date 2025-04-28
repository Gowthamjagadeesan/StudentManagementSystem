package com.cts.exception;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ExceptionResponse {

	public ExceptionResponse() {
		super();
	}

	private int status;
	private String response;
	private LocalDateTime date;
}
