package com.cipl.demo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author Santosh Mahto
 *
 */
@JsonInclude(value = Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GenericResponse implements Serializable {

	private static final long serialVersionUID = 4519741788165974557L;

	/* For auditing and logging purpose - Mostly used in case of error */
	private String refId;

	/* HTTP Status codes */
	private Integer status;

	/* Application Status Codes */
	private Integer code;
	private String message;

	/* Error list */
	private List<Error> errors;

	public GenericResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param status
	 * @param code
	 * @param message
	 * @param errors
	 */
	public GenericResponse(Integer status, Integer code, String message, List<Error> errors) {
		super();
		this.status = status;
		this.code = code;
		this.message = message;
		this.errors = errors;
	}

	/**
	 * @param status
	 * @param code
	 * @param message
	 * @param errors
	 */
	public GenericResponse(String refId, Integer status, Integer code, String message, List<Error> errors) {
		super();
		this.refId = refId;
		this.status = status;
		this.code = code;
		this.message = message;
		this.errors = errors;
	}

	/**
	 * @param refId
	 * @param status
	 * @param code
	 * @param message
	 */
	public GenericResponse(String refId, List<Error> errors) {
		super();
		this.refId = refId;
		this.errors = errors;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GenericResponse [refId=" + refId + ", status=" + status + ", code=" + code + ", message=" + message
				+ ", errors=" + errors + "]";
	}

	/**
	 * @return the refId
	 */
	public String getRefId() {
		return refId;
	}

	/**
	 * @param refId
	 *            the refId to set
	 */
	public void setRefId(String refId) {
		this.refId = refId;
	}

	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * @return the code
	 */
	public Integer getCode() {
		return code;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(Integer code) {
		this.code = code;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the errors
	 */
	public List<Error> getErrors() {

		if (errors == null) {
			return new ArrayList<>();
		}

		return errors;
	}

	/**
	 * @param errors
	 *            the errors to set
	 */
	public void setErrors(List<Error> errors) {
		System.out.println(errors);
		this.errors = errors;
	}

}
