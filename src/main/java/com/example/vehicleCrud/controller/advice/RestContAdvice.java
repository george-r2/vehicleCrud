package com.example.vehicleCrud.controller.advice;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.vehicleCrud.exception.ErrorMessage;


@RestControllerAdvice
public class RestContAdvice {

	private static final Logger log = LoggerFactory.getLogger(RestContAdvice.class);


	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorMessage handleMethodArgumentNotValid(
			MethodArgumentNotValidException ex) {
  		log.info(ex.toString());
		ErrorMessage errorMessage  = new ErrorMessage();		
		List<String> errorList = ex.getFieldErrors().stream().map(fe -> {
			String field = fe.getField()+", "+fe .getDefaultMessage();
			return field;
		}).toList();
		errorMessage.setMessages(errorList);
		return errorMessage;
	}
}
