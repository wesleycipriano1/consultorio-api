package com.example.demo.resorce.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.service.execption.ObjectNotFoundExecption;


import jakarta.servlet.ServletRequest;

@ControllerAdvice
public class ResorceExceptionHlander {
	@ExceptionHandler(ObjectNotFoundExecption.class)
	public ResponseEntity<EstandardErro>objectNotFoundExecption(ObjectNotFoundExecption e,ServletRequest request){
		EstandardErro error= new EstandardErro(System.currentTimeMillis(), HttpStatus.NOT_FOUND.value(), e.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	}

}
