package com.cipl.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * @author Santosh Mahto
 *
 */
@Entity
@Table(name = "PARAMETER_VALUE")
public class ParameterValue {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;

	@Column(name = "LINK_ID")
	private Integer linkId;

	@Column(name = "PARAMETER_ID")
	private Integer parameterId;
	
	@Column(name = "PARAMETER_VALUE_ID")
	private String parameterValueId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getLinkId() {
		return linkId;
	}

	public void setLinkId(Integer linkId) {
		this.linkId = linkId;
	}

	public Integer getParameterId() {
		return parameterId;
	}

	public void setParameterId(Integer parameterId) {
		this.parameterId = parameterId;
	}

	public String getParameterValueId() {
		return parameterValueId;
	}

	public void setParameterValueId(String parameterValueId) {
		this.parameterValueId = parameterValueId;
	}
	
	
	


}
