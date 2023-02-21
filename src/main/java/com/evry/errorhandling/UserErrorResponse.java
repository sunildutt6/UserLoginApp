package com.evry.errorhandling;

import java.time.ZonedDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class UserErrorResponse {

	@JsonFormat(pattern = "MM-dd-yyyy HH:mm:ss")
	private ZonedDateTime timeStamp;
	private int statusCode;
	private String path;
	private String message;

	public ZonedDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(ZonedDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public UserErrorResponse(ZonedDateTime timeStamp, int statusCode, String path, String message) {
		super();
		this.timeStamp = timeStamp;
		this.statusCode = statusCode;
		this.path = path;
		this.message = message;
	}

}
