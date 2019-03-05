package com.cipl.demo.entity;

import java.sql.Timestamp;

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
@Table(name = "LINK_MASTER")
public class LinkMaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "LINK_ID")
	private Long linkId;
	
	@Column(name = "LINK_NAME")
	private String linkName;
	
	@Column(name = "LOBBY_STATION_ID")
	private Long lobbyStationId;
	
	@Column(name = "TRACTION_TYPE")
	private Long tractionType;

	@Column(name = "TRAIN_TYPE_CODE")
	private Long trainTypeCode;
	
	@Column(name = "TRAIN_FREQUENCY")
	private Long trainFrequency;
	
	@Column(name = "CREATED_DATE") 
	private Timestamp createdDat;
	
	@Column(name = "CREATED_BY")
	private Long createdBy;

	public Long getLinkId() {
		return linkId;
	}

	public void setLinkId(Long linkId) {
		this.linkId = linkId;
	}

	public String getLinkName() {
		return linkName;
	}

	public void setLinkName(String linkName) {
		this.linkName = linkName;
	}

	public Long getLobbyStationId() {
		return lobbyStationId;
	}

	public void setLobbyStationId(Long lobbyStationId) {
		this.lobbyStationId = lobbyStationId;
	}

	public Long getTractionType() {
		return tractionType;
	}

	public void setTractionType(Long tractionType) {
		this.tractionType = tractionType;
	}

	public Long getTrainTypeCode() {
		return trainTypeCode;
	}

	public void setTrainTypeCode(Long trainTypeCode) {
		this.trainTypeCode = trainTypeCode;
	}

	public Long getTrainFrequency() {
		return trainFrequency;
	}

	public void setTrainFrequency(Long trainFrequency) {
		this.trainFrequency = trainFrequency;
	}

	public Timestamp getCreatedDat() {
		return createdDat;
	}

	public void setCreatedDat(Timestamp createdDat) {
		this.createdDat = createdDat;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}
	
	
	
}
