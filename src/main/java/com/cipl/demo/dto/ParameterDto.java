package com.cipl.demo.dto;
/**
 * @author Santosh Mahto
 *
 */
public class ParameterDto {
	
	
	
	private Integer id;

	private String parameterDesc;

	private Integer defaultValue;
	
	private String actualValue;
	
	private String uom;

	
	
	
	public String getActualValue() {
		return actualValue;
	}

	public void setActualValue(String actualValue) {
		this.actualValue = actualValue;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getParameterDesc() {
		return parameterDesc;
	}

	public void setParameterDesc(String parameterDesc) {
		this.parameterDesc = parameterDesc;
	}

	public Integer getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(Integer defaultValue) {
		this.defaultValue = defaultValue;
	}

	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}
	
	


}
