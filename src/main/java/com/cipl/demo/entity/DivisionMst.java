package com.cipl.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Santosh Mahto
 *
 */
@Entity
@Table(name = "DIVISION_MST")
public class DivisionMst {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "DIVISION_ID")
	private Long id;

	@Column(name = "DIVISION_CD")
	private String divisionCd;

	@Column(name = "DIVISION")
	private String division;
	
	@ManyToOne(optional = false)
    @JoinColumn(name="ZONE_ID")
    private ZoneMst zoneMst;
	
	
	
	  @OneToMany(mappedBy = "divisionMst", cascade = CascadeType.ALL) private
	  List<StationMst> stationList;
	 
	  
	
	public List<StationMst> getStationList() {
		return stationList;
	}

	public void setStationList(List<StationMst> stationList) {
		this.stationList = stationList;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDivisionCd() {
		return divisionCd;
	}

	public void setDivisionCd(String divisionCd) {
		this.divisionCd = divisionCd;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public ZoneMst getZoneMst() {
		return zoneMst;
	}

	public void setZoneMst(ZoneMst zoneMst) {
		this.zoneMst = zoneMst;
	}
	
	
	

}
