package com.cipl.demo.model;

import java.util.List;
/**
 * @author Santosh Mahto
 *
 */
public class DivLobyDto {
	
	private String divisionCode;
	private List<StationMstDto> stationMstList;
	
	
	public String getDivisionCode() {
		return divisionCode;
	}
	public void setDivisionCode(String divisionCode) {
		this.divisionCode = divisionCode;
	}
	public List<StationMstDto> getStationMstList() {
		return stationMstList;
	}
	public void setStationMstList(List<StationMstDto> stationMstList) {
		this.stationMstList = stationMstList;
	}
	
	
	
	

}
