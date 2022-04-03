package com.cursos.randtech.projetospringboot.resources.exceptions;

import java.io.Serializable;
import java.time.Instant;

public class StandardError implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Instant timestamp;
	private Integer status;
	private String error;
	private String messagr;
	private String path;
	
	public StandardError() {
	}

	public StandardError(Instant timestamp, Integer status, String error, String messagr, String path) {
		super();
		this.timestamp = timestamp;
		this.status = status;
		this.error = error;
		this.messagr = messagr;
		this.path = path;
	}

	public Instant getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Instant timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessagr() {
		return messagr;
	}

	public void setMessagr(String messagr) {
		this.messagr = messagr;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	
}
