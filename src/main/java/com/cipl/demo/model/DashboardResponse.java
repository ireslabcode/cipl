package com.cipl.demo.model;

import java.util.List;

import com.cipl.demo.dto.TrainFrequencyMstDto;
import com.cipl.demo.dto.TrainTypeMstDto;
import com.cipl.demo.entity.LinkMaster;
/**
 * @author Santosh Mahto
 *
 */
public class DashboardResponse {
	
	
	private List<TrainTypeMstDto> trainTypeMstList;
	private List<TractionMstDto> tractionMstList;
	private List<TrainFrequencyMstDto> trainFrequencyMstDtosList;
	private List<LinkMaster> linkMasterList;
	
	
	
	
	
	
	
	public List<LinkMaster> getLinkMasterList() {
		return linkMasterList;
	}
	public void setLinkMasterList(List<LinkMaster> linkMasterList) {
		this.linkMasterList = linkMasterList;
	}
	public List<TrainFrequencyMstDto> getTrainFrequencyMstDtosList() {
		return trainFrequencyMstDtosList;
	}
	public void setTrainFrequencyMstDtosList(List<TrainFrequencyMstDto> trainFrequencyMstDtosList) {
		this.trainFrequencyMstDtosList = trainFrequencyMstDtosList;
	}
	public List<TrainTypeMstDto> getTrainTypeMstList() {
		return trainTypeMstList;
	}
	public void setTrainTypeMstList(List<TrainTypeMstDto> trainTypeMstList) {
		this.trainTypeMstList = trainTypeMstList;
	}
	public List<TractionMstDto> getTractionMstList() {
		return tractionMstList;
	}
	public void setTractionMstList(List<TractionMstDto> tractionMstList) {
		this.tractionMstList = tractionMstList;
	}
	
	
	
	
	

}
