package com.cipl.demo.model;

import java.util.List;

import com.cipl.demo.dto.KpiValueDto;
import com.cipl.demo.dto.ParameterDto;
import com.cipl.demo.entity.LinkPlan;
/**
 * @author Santosh Mahto
 *
 */

public class LinkPlanAssociatedParameterAndKpiResponse {
	
	List<LinkPlan> linkPlanList;
	List<ParameterDto> linkParameterList;
	List<KpiValueDto> linkkpiList;
	
	
	
	public List<KpiValueDto> getLinkkpiList() {
		return linkkpiList;
	}

	public void setLinkkpiList(List<KpiValueDto> linkkpiList) {
		this.linkkpiList = linkkpiList;
	}

	public List<ParameterDto> getLinkParameterList() {
		return linkParameterList;
	}

	public void setLinkParameterList(List<ParameterDto> linkParameterList) {
		this.linkParameterList = linkParameterList;
	}

	public List<LinkPlan> getLinkPlanList() {
		return linkPlanList;
	}

	public void setLinkPlanList(List<LinkPlan> linkPlanList) {
		this.linkPlanList = linkPlanList;
	}
	
	
	
	

}
