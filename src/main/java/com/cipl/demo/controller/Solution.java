package com.cipl.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cipl.demo.model.DashboardResponse;
import com.cipl.demo.model.LinkMasterRequest;
import com.cipl.demo.model.LinkMasterResponse;
import com.cipl.demo.model.LinkPlanAssociatedParameterAndKpiRequest;
import com.cipl.demo.model.LinkPlanAssociatedParameterAndKpiResponse;
import com.cipl.demo.repository.ConnectionEntityRepository;
import com.cipl.demo.repository.DivisionMstRepository;
import com.cipl.demo.repository.ZoneMstRepository;
import com.cipl.demo.service.CommonService;
import com.cipl.demo.service.CpilUserService;
import com.cipl.demo.service.KpiService;
import com.cipl.demo.service.LinkMasterService;
import com.cipl.demo.service.LinkPlanService;
import com.cipl.demo.service.ParameterService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectWriter;

/**
 * @author Santosh Mahto
 *
 */
@RestController
@CrossOrigin(origins = { "*" })
@RequestMapping(value="/solution/")
public class Solution {
	
	private static final Logger log = LoggerFactory.getLogger(Solution.class);

	@Autowired
	private ObjectWriter objectWriter;
	
	@Autowired
	private CpilUserService cpilUserService;
	
	@Autowired
	private ZoneMstRepository zoneMstRepository;
	
	
	@Autowired
	private DivisionMstRepository divisionMstRepository;
	
	@Autowired
	private ConnectionEntityRepository conRepo;
	
	@Autowired
	private KpiService kpiService;
	

	@Autowired
	private ParameterService parameterService;

	@Autowired
	private LinkPlanService linkPlanService;

	@Autowired
	private CommonService commonService;

	@Autowired
	private LinkMasterService linkMasterService;
	
	@RequestMapping(value = "searchLinks", method = RequestMethod.POST, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<DashboardResponse> searchLinks(@RequestBody LinkMasterRequest linkMasterRequest)
			throws JsonProcessingException {

		// TODO: Request and response logging
		log.info("search link data request received..:");
		log.info(objectWriter.writeValueAsString(linkMasterRequest));
		LinkMasterResponse searchedLinkList = linkMasterService.searchLink(linkMasterRequest);
		DashboardResponse dashboardData = new DashboardResponse();
		dashboardData.setLinkMasterList(searchedLinkList.getLinkMasterList());
		return new ResponseEntity<>(dashboardData, HttpStatus.OK);

	}

	@RequestMapping(value = "searchLinkPlanAssociatedParameterAndKpi", method = RequestMethod.POST, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<LinkPlanAssociatedParameterAndKpiResponse> searchLinkPlanAssociatedParameterAndKpi(
			@RequestBody LinkPlanAssociatedParameterAndKpiRequest linkPlanAssociatedParameterAndKpiRequest)
			throws JsonProcessingException {

		// TODO: Get linkId in LinkMasterRequest to search Link Plan
		log.info("searching Link Plan Associated Parameter And Kpi...!!");
		log.info(objectWriter.writeValueAsString(linkPlanAssociatedParameterAndKpiRequest));

		LinkPlanAssociatedParameterAndKpiResponse allLinkPlanAssociatedToLink = linkPlanService
				.getAllLinkPlanAssociatedToLink(linkPlanAssociatedParameterAndKpiRequest);
		// allLinkPlanAssociatedToLink.setParameterValueList(parameterService.getAllParameterList(linkPlanAssociatedParameterAndKpiRequest).getParameterValueList());
		allLinkPlanAssociatedToLink.setLinkParameterList(
				parameterService.getAllParameterList(linkPlanAssociatedParameterAndKpiRequest).getLinkParameterList());
		//
		
		allLinkPlanAssociatedToLink.setLinkkpiList(kpiService.getAllKpiList(linkPlanAssociatedParameterAndKpiRequest).getLinkkpiList());

		return new ResponseEntity<>(allLinkPlanAssociatedToLink, HttpStatus.OK);

	}



}
