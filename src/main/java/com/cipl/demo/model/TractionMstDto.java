package com.cipl.demo.model;

import javax.persistence.Column;
/**
 * @author Santosh Mahto
 *
 */
public class TractionMstDto {
	
	private Long tractionType;
	private String tractionDesc;
	
	
	public Long getTractionType() {
		return tractionType;
	}
	public void setTractionType(Long tractionType) {
		this.tractionType = tractionType;
	}
	public String getTractionDesc() {
		return tractionDesc;
	}
	public void setTractionDesc(String tractionDesc) {
		this.tractionDesc = tractionDesc;
	}
	
	
}
