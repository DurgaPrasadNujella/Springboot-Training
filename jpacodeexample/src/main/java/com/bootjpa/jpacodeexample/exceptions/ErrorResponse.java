package com.bootjpa.jpacodeexample.exceptions;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

public class ErrorResponse {

	private String message;
	private List<String> details;

	/*
	 * public ErrorResponse(long l, List<String> details) { // TODO Auto-generated
	 * constructor stub }
	 */

	//@XmlRootElement(name = "error")
	public ErrorResponse(long l, List<String> details) {
        super();
        this.message = message;
        this.details = details;
    }
}
