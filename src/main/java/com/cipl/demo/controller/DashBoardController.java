package com.cipl.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cipl.demo.entity.DivisionMst;
import com.cipl.demo.entity.ZoneMst;
import com.cipl.demo.model.DashboardRequest;
import com.cipl.demo.model.DashboardResponse;
import com.cipl.demo.model.DivisionMstDto;
import com.cipl.demo.model.LinkMasterRequest;
import com.cipl.demo.model.LinkMasterResponse;
import com.cipl.demo.model.LinkPlanAssociatedParameterAndKpiRequest;
import com.cipl.demo.model.LinkPlanAssociatedParameterAndKpiResponse;
import com.cipl.demo.model.UserResponse;
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
@RequestMapping(value="/master/")
public class DashBoardController {
	private static final Logger log = LoggerFactory.getLogger(DashBoardController.class);

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

	@RequestMapping(value = "filter", method = RequestMethod.POST, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<DashboardResponse> stationList(@RequestBody DashboardRequest dashboardRequest)
			throws JsonProcessingException {

		// TODO: Request and response logging
		log.info("dashboard data request received..:");
		log.info(objectWriter.writeValueAsString(dashboardRequest));

		DashboardResponse dashboardData = commonService.getDashboardData();

		return new ResponseEntity<>(dashboardData, HttpStatus.OK);

	}

		
	
	@GetMapping("level")
	public ResponseEntity<UserResponse>  getZoneDetails(HttpServletRequest request) {

		/*
		 * for (ZoneMst iterable_element :
		 * zoneMstRepository.findByZone("Northern Railway")) {
		 * System.out.println(iterable_element.getZone()); }
		 */
		UserResponse userResponse = new UserResponse();
		//List<ZoneMst> findByZone = zoneMstRepository.findByZone("Northern Railway");
		
		List<ZoneMst> zoneList = (List<ZoneMst>) zoneMstRepository.findAll();
		
		//List<DivisionMst> divisionList = (List<DivisionMst>) divisionMstRepository.findAll();
		List<DivisionMst> divisionList = (List<DivisionMst>) divisionMstRepository.findAll();
		
		List< DivisionMstDto> divisionMstDtos = new ArrayList<DivisionMstDto>();
		
		for (DivisionMst divisionMst : divisionList) {
			DivisionMstDto divisionMstDto = new DivisionMstDto();
			divisionMstDto.setDivisionCode(divisionMst.getDivisionCd());
			divisionMstDto.setDivisionName(divisionMst.getDivision());
			
			divisionMstDtos.add(divisionMstDto);
			
			
		}
		
		
		
		
		
		userResponse.setDivisionMstDtos(divisionMstDtos);
		
		//System.out.println("sissssssisssssssssss"+divisionList.size());
		userResponse.setZoneList(zoneList);
		//userResponse.setDivisionList(divisionList);
		userResponse.setDivLobyDto(cpilUserService.getAllDivisionList().getDivLobyDto());
		//getZoneAssociatedDivision
	
		UserResponse zoneAssociatedDivision = cpilUserService.getZoneAssociatedDivision("");
		userResponse.setZoneDivDtos(zoneAssociatedDivision.getZoneDivDtos());
		/*
		 * List<DivisionMst> findByDivisionCd =
		 * divisionMstRepository.findByDivisionCd("FZR");
		 * System.out.println("SIZE  :"+findByZone.size()); try {
		 * //log.info(objectWriter.writeValueAsString(findByZone));
		 * log.info(objectWriter.writeValueAsString(findByDivisionCd)); }catch
		 * (Exception e) { e.printStackTrace(); } System.out.println("testmethod...!!");
		 * Map<String , String> map = new HashMap<String,String>(); map.put("k1", "v1");
		 * map.put("k2", "v2"); map.put("k3", "v3");
		 */
		return new ResponseEntity<>(userResponse, HttpStatus.OK);
	}

}
