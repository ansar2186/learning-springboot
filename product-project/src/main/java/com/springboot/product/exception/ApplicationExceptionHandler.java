package com.springboot.product.exception;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApplicationExceptionHandler {
//    4 / oct / 2024
	
	 @ResponseStatus(code = HttpStatus.NOT_FOUND)
	  @ExceptionHandler(ProductNotFoundException.class) 
	  public Map<String, String> handleException(ProductNotFoundException exception) {
	  
	  Map<String, String> map = new HashMap<>(); map.put("Error Message",
	  exception.getMessage());
	  
	  return map; }
	 
	
	
	
	

	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleValidation(MethodArgumentNotValidException exception) {
		Map<String, String> map = new HashMap<>();
		List<ObjectError> error = exception.getBindingResult().getAllErrors();

		for (ObjectError productError : error) {
			map.put("Error Message", productError.getDefaultMessage());

		}
		return map;

	}
	// Try by himself (Ahtesham Ansari  Trying the above Validation )
	/*
	 * @ResponseStatus(code = HttpStatus.BAD_REQUEST)
	 * 
	 * @ExceptionHandler(MethodArgumentNotValidException.class) public
	 * Map<String,String> handleVaalidation(MethodArgumentNotValidException
	 * exception){ Map<String,String>map = new HashMap<>(); List<ObjectError> error
	 * = exception.getBindingResult().getAllErrors(); for(ObjectError productError :
	 * error) { map.put("Error Message", productError.getDefaultMessage()); } return
	 * map; }
	 */

}
