package com.cipl.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * @author Santosh Mahto
 *
 */
@Entity
@Table(name = "TRAIN_TYPE_MST")
public class TrainTypeMst {
	@Id
	@Column(name = "TRAIN_TYPE_CD")
	private String trainTypeCd;
	
	@Column(name = "TRAIN_TYPE_DESC")
	private String trainTypeDesc;

	public String getTrainTypeCd() {
		return trainTypeCd;
	}

	public void setTrainTypeCd(String trainTypeCd) {
		this.trainTypeCd = trainTypeCd;
	}

	public String getTrainTypeDesc() {
		return trainTypeDesc;
	}

	public void setTrainTypeDesc(String trainTypeDesc) {
		this.trainTypeDesc = trainTypeDesc;
	}
	
	

}
