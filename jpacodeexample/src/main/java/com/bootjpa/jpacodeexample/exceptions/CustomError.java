package com.bootjpa.jpacodeexample.exceptions;

import java.util.List;

public class CustomError {
	
	private String message;
	private List<String> details;
	
	public void CustomResponse(long l, List<String> details) {
        this.message = message;
        this.details = details;
    }

}
