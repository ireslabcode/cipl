package com.cipl.demo.model;

import java.sql.Timestamp;
/**
 * @author Santosh Mahto
 *
 */
public class LinkMasterRequest {
	
	private Integer linkId;
	
	private String linkName;
	
	private Integer lobbyStationId;
	
	private Integer tractionType;

	private Integer trainTypeCode;
	
	private Integer trainFrequency;
	
	private Timestamp createdDat;
	
	private Integer createdBy;

	public Integer getLinkId() {
		return linkId;
	}

	public void setLinkId(Integer linkId) {
		this.linkId = linkId;
	}

	public String getLinkName() {
		return linkName;
	}

	public void setLinkName(String linkName) {
		this.linkName = linkName;
	}

	public Integer getLobbyStationId() {
		return lobbyStationId;
	}

	public void setLobbyStationId(Integer lobbyStationId) {
		this.lobbyStationId = lobbyStationId;
	}

	public Integer getTractionType() {
		return tractionType;
	}

	public void setTractionType(Integer tractionType) {
		this.tractionType = tractionType;
	}

	public Integer getTrainTypeCode() {
		return trainTypeCode;
	}

	public void setTrainTypeCode(Integer trainTypeCode) {
		this.trainTypeCode = trainTypeCode;
	}

	public Integer getTrainFrequency() {
		return trainFrequency;
	}

	public void setTrainFrequency(Integer trainFrequency) {
		this.trainFrequency = trainFrequency;
	}

	public Timestamp getCreatedDat() {
		return createdDat;
	}

	public void setCreatedDat(Timestamp createdDat) {
		this.createdDat = createdDat;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	
	
}
