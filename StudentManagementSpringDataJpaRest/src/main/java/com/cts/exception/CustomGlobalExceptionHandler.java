package com.cts.exception;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class CustomGlobalExceptionHandler {

	@ExceptionHandler(value = MethodArgumentNotValidException.class)
	public ResponseEntity<Object> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {

		Map<String, Object> body = new HashMap<>();
		body.put("Time Stamp", new Date());
		ex.getBindingResult().getAllErrors()
				.forEach(error -> body.put(((FieldError) error).getField(), error.getDefaultMessage()));
		return new ResponseEntity<Object>(body, HttpStatus.BAD_REQUEST);

	}

	@ExceptionHandler(value = StudentNotFoundExcepttion.class)
	public ResponseEntity<ExceptionResponse> handleStudentNotFoundExcepttion(StudentNotFoundExcepttion ex,
			WebRequest web) {
		ExceptionResponse response = new ExceptionResponse();
		response.setDate(LocalDateTime.now());
		response.setResponse(ex.getMessage());
		response.setStatus(406);

		return new ResponseEntity<ExceptionResponse>(response, HttpStatus.BAD_REQUEST);
	}

}
