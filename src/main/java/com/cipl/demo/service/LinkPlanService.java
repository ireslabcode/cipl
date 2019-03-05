package com.cipl.demo.service;

import org.springframework.stereotype.Service;

import com.cipl.demo.model.LinkPlanAssociatedParameterAndKpiRequest;
import com.cipl.demo.model.LinkPlanAssociatedParameterAndKpiResponse;
/**
 * @author Santosh Mahto
 *
 */

public interface LinkPlanService {
	
	public LinkPlanAssociatedParameterAndKpiResponse getAllLinkPlanAssociatedToLink(LinkPlanAssociatedParameterAndKpiRequest linkPlanAssociatedParameterAndKpiRequest) ;
	
}
