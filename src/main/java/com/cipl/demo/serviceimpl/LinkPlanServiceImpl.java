package com.cipl.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cipl.demo.entity.LinkPlan;
import com.cipl.demo.model.LinkPlanAssociatedParameterAndKpiRequest;
import com.cipl.demo.model.LinkPlanAssociatedParameterAndKpiResponse;
import com.cipl.demo.repository.LinkPlanRepository;
import com.cipl.demo.service.LinkPlanService;
/**
 * @author Santosh Mahto
 *
 */
@Service
public class LinkPlanServiceImpl implements LinkPlanService {

	@Autowired
	private LinkPlanRepository linkPlanRepository;

	@Override
	public LinkPlanAssociatedParameterAndKpiResponse getAllLinkPlanAssociatedToLink(
			LinkPlanAssociatedParameterAndKpiRequest linkPlanAssociatedParameterAndKpiRequest) {
		LinkPlanAssociatedParameterAndKpiResponse linkPlanAssociatedParameterAndKpiResponse = new LinkPlanAssociatedParameterAndKpiResponse();
		List<LinkPlan> linkPlanList = linkPlanRepository
				.findByLinkId(linkPlanAssociatedParameterAndKpiRequest.getLinkId());
		linkPlanAssociatedParameterAndKpiResponse.setLinkPlanList(linkPlanList);
		return linkPlanAssociatedParameterAndKpiResponse;
	}

}
