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
@Table(name = "TRACTION_MST")
public class TransationMst {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TRACTION_TYPE")
	private Long tractionType;
	
	
	@Column(name = "TRACTION_DESC")
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
