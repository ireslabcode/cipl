package com.cipl.demo.model;

import java.util.List;

import com.cipl.demo.entity.DivisionMst;
/**
 * @author Santosh Mahto
 *
 */
public class ZoneDivDto {
	
	private String zone;
	private List<DivisionMst> diviList;
	
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public List<DivisionMst> getDiviList() {
		return diviList;
	}
	public void setDiviList(List<DivisionMst> diviList) {
		this.diviList = diviList;
	}
	
	

}
