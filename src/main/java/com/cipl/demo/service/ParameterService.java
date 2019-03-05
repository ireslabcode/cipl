package com.cipl.demo.service;

import com.cipl.demo.model.LinkPlanAssociatedParameterAndKpiRequest;
import com.cipl.demo.model.LinkPlanAssociatedParameterAndKpiResponse;
/**
 * @author Santosh Mahto
 *
 */
public interface ParameterService {
	public LinkPlanAssociatedParameterAndKpiResponse getAllParameterList(LinkPlanAssociatedParameterAndKpiRequest linkPlanAssociatedParameterAndKpiRequest) ;

}
