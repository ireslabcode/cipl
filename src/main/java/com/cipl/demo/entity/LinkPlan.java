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
@Table(name = "LINK_PLAN")
public class LinkPlan {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "LINK_PLAN_ID")
	private Long id;

	@Column(name = "LINK_ID")
	private Integer linkId;

	@Column(name = "CREW_NO")
	private Integer crewNo;
	
	@Column(name = "TRAIN_NO")
	private String trainNo;

	@Column(name = "FROM_STATION")
	private String fromStation;

	@Column(name = "TO_STATION")
	private String toStation;
	
	@Column(name = "SIGN_ON_TIME")
	private String signOnTime;
	
	@Column(name = "DEPARTURE_TIME")
	private String departureTime;

	@Column(name = "ARRIVAL_TIME")
	private String arrivalTime;

	@Column(name = "SING_OFF_TIME")
	private String signOffTime;
	
	@Column(name = "DUTY_DURATION")
	private String dutyDuratin;
	
	@Column(name = "DISTANCE")
	private String distance;
	
	@Column(name = "NIB")
	private String nib;
	
	@Column(name = "SORTED_ORDER")
	private Integer sortedOrder;

	
	

	public String getNib() {
		return nib;
	}

	public void setNib(String nib) {
		this.nib = nib;
	}

	public Integer getSortedOrder() {
		return sortedOrder;
	}

	public void setSortedOrder(Integer sortedOrder) {
		this.sortedOrder = sortedOrder;
	}

	public String getFromStation() {
		return fromStation;
	}

	public void setFromStation(String fromStation) {
		this.fromStation = fromStation;
	}

	public String getToStation() {
		return toStation;
	}

	public void setToStation(String toStation) {
		this.toStation = toStation;
	}

	public String getSignOnTime() {
		return signOnTime;
	}

	public void setSignOnTime(String signOnTime) {
		this.signOnTime = signOnTime;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getSignOffTime() {
		return signOffTime;
	}

	public void setSignOffTime(String signOffTime) {
		this.signOffTime = signOffTime;
	}

	public String getDutyDuratin() {
		return dutyDuratin;
	}

	public void setDutyDuratin(String dutyDuratin) {
		this.dutyDuratin = dutyDuratin;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

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

	public Integer getCrewNo() {
		return crewNo;
	}

	public void setCrewNo(Integer crewNo) {
		this.crewNo = crewNo;
	}

	public String getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(String trainNo) {
		this.trainNo = trainNo;
	}

	
	
	
}
