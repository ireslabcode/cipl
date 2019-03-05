package com.cipl.demo.model;

import java.util.List;

import com.cipl.demo.entity.DivisionMst;
import com.cipl.demo.entity.StationMst;
import com.cipl.demo.entity.Train;
import com.cipl.demo.entity.TrainFrequencyMst;
import com.cipl.demo.entity.TrainTypeMst;
import com.cipl.demo.entity.TransationMst;
import com.cipl.demo.entity.ZoneMst;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
/**
 * @author Santosh Mahto
 *
 */
@JsonInclude(value = Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserResponse extends GenericResponse {
	
private List<Train> trainList;

private List<DivisionMst> divisionList;

private List<StationMst> stationList;

private List<ZoneMst> zoneList;

private List<ZoneDivDto> zoneDivDtos;

private List<DivLobyDto>  divLobyDto;

private List< DivisionMstDto> divisionMstDtos; 

private List<TransationMst> tractionList;

private List<TrainTypeMst> trainTypeList;

private List<TrainFrequencyMst> trainFrequencyList;






public List<TrainFrequencyMst> getTrainFrequencyList() {
	return trainFrequencyList;
}

public void setTrainFrequencyList(List<TrainFrequencyMst> trainFrequencyList) {
	this.trainFrequencyList = trainFrequencyList;
}

public List<TrainTypeMst> getTrainTypeList() {
	return trainTypeList;
}

public void setTrainTypeList(List<TrainTypeMst> trainTypeList) {
	this.trainTypeList = trainTypeList;
}

public List<TransationMst> getTractionList() {
	return tractionList;
}

public void setTractionList(List<TransationMst> tractionList) {
	this.tractionList = tractionList;
}

public List<DivisionMstDto> getDivisionMstDtos() {
	return divisionMstDtos;
}

public void setDivisionMstDtos(List<DivisionMstDto> divisionMstDtos) {
	this.divisionMstDtos = divisionMstDtos;
}

public List<DivLobyDto> getDivLobyDto() {
	return divLobyDto;
}

public void setDivLobyDto(List<DivLobyDto> divLobyDto) {
	this.divLobyDto = divLobyDto;
}

public List<ZoneDivDto> getZoneDivDtos() {
	return zoneDivDtos;
}

public void setZoneDivDtos(List<ZoneDivDto> zoneDivDtos) {
	this.zoneDivDtos = zoneDivDtos;
}

public List<DivisionMst> getDivisionList() {
	return divisionList;
}

public void setDivisionList(List<DivisionMst> divisionList) {
	this.divisionList = divisionList;
}

public List<StationMst> getStationList() {
	return stationList;
}

public void setStationList(List<StationMst> stationList) {
	this.stationList = stationList;
}

public List<ZoneMst> getZoneList() {
	return zoneList;
}

public void setZoneList(List<ZoneMst> zoneList) {
	this.zoneList = zoneList;
}

public List<Train> getTrainList() {
	return trainList;
}

public void setTrainList(List<Train> trainList) {
	this.trainList = trainList;
}


	
}
