package com.cipl.demo.dto;

import java.sql.Timestamp;
/**
 * @author Santosh Mahto
 *
 */
public class LinkMasterDto {
	
	private Long linkId;
	
	private String linkName;
	
	private Long lobbyStationId;
	
	private Long tractionType;

	private Long trainTypeCode;
	
	private Long trainFrequency;
	
	private Timestamp createdDat;
	
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