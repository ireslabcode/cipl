package com.cipl.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 * @author Santosh Mahto
 *
 */
@Entity
@Table(name = "ZONE_MST")
public class ZoneMst {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ZONE_ID")
	private Long id;

	@Column(name = "ZONE_CD")
	private String zoneCd;

	@Column(name = "ZONE")
	private String zone;
	
	
	// -- Date : 18-02-2019
	//------------------------
	
	/*
	 * @Column(name = "CREATED_DATE") //@Temporal(TemporalType.TIMESTAMP) private
	 * Timestamp createdDate;
	 * 
	 * @Column(name = "STATUS") private String status;
	 */
	
	
	
	
	
	//------------------------
	
	
	
	
	
	
	
	
	@OneToMany(mappedBy = "zoneMst", cascade = CascadeType.ALL)
    private List<DivisionMst> divisionList;

	

	
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getZoneCd() {
		return zoneCd;
	}

	public void setZoneCd(String zoneCd) {
		this.zoneCd = zoneCd;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}
	
	
}
