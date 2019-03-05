package com.cipl.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 * @author Santosh Mahto
 *
 */
@Entity
@Table(name = "STATION_MST")
public class StationMst {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "STATION_ID")
	private Long id;

	@Column(name = "STATION_CODE")
	private String stationName;
	
	@Column(name = "STATION_NAME")
	private String stationCode;
	
	@Column(name = "STATUS")
	private String status;
	
	@Column(name = "LOBBY_FLAG")
	private String lobbyFlag;
	
	
	
	
	
	
	
	  public String getLobbyFlag() {
		return lobbyFlag;
	}

	public void setLobbyFlag(String lobbyFlag) {
		this.lobbyFlag = lobbyFlag;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@ManyToOne(optional = false)
	  
	  @JoinColumn(name="DIVISION_ID") private DivisionMst divisionMst;
	 

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public String getStationCode() {
		return stationCode;
	}

	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}

	/*
	 * public DivisionMst getDivisionMst() { return divisionMst; }
	 * 
	 * public void setDivisionMst(DivisionMst divisionMst) { this.divisionMst =
	 * divisionMst; }
	 */
	
	
	

}
